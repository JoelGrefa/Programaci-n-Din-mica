import java.util.List;

public class GestionInventario {

    // Método recursivo
    public int solucionRecursiva(List<Producto> productos, int capacidad, int n) {
        if (n == 0 || capacidad == 0) {
            return 0;
        }
        if (productos.get(n - 1).getPeso() > capacidad) {
            return solucionRecursiva(productos, capacidad, n - 1);
        } else {
            int incluir = productos.get(n - 1).getValor() + solucionRecursiva(productos, capacidad - productos.get(n - 1).getPeso(), n - 1);
            int excluir = solucionRecursiva(productos, capacidad, n - 1);
            return Math.max(incluir, excluir);
        }
    }

    // Método bottom-up (programación dinámica)
    public int solucionBottomUp(List<Producto> productos, int capacidad) {
        int n = productos.size();
        int[][] dp = new int[n + 1][capacidad + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacidad; w++) {
                if (productos.get(i - 1).getPeso() <= w) {
                    dp[i][w] = Math.max(productos.get(i - 1).getValor() + dp[i - 1][w - productos.get(i - 1).getPeso()], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][capacidad];
    }

    // Método top-down con memoización
    public int solucionTopDown(List<Producto> productos, int capacidad) {
        int[][] memo = new int[productos.size() + 1][capacidad + 1];
        for (int i = 0; i <= productos.size(); i++) {
            for (int j = 0; j <= capacidad; j++) {
                memo[i][j] = -1;
            }
        }
        return topDownHelper(productos, capacidad, productos.size(), memo);
    }

    private int topDownHelper(List<Producto> productos, int capacidad, int n, int[][] memo) {
        if (n == 0 || capacidad == 0) {
            return 0;
        }
        if (memo[n][capacidad] != -1) {
            return memo[n][capacidad];
        }
        if (productos.get(n - 1).getPeso() > capacidad) {
            memo[n][capacidad] = topDownHelper(productos, capacidad, n - 1, memo);
        } else {
            int incluir = productos.get(n - 1).getValor() + topDownHelper(productos, capacidad - productos.get(n - 1).getPeso(), n - 1, memo);
            int excluir = topDownHelper(productos, capacidad, n - 1, memo);
            memo[n][capacidad] = Math.max(incluir, excluir);
        }
        return memo[n][capacidad];
    }
}
