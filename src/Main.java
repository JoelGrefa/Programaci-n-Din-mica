import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de productos
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();

        // Crear la lista de productos
        List<Producto> productos = new ArrayList<>();
        
        // Leer los productos desde el teclado
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            scanner.nextLine();  // Consumir el salto de línea pendiente
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el valor (beneficio) del producto " + (i + 1) + ": ");
            int valor = scanner.nextInt();

            System.out.print("Ingrese el peso del producto " + (i + 1) + ": ");
            int peso = scanner.nextInt();

            productos.add(new Producto(nombre, valor, peso));
        }

        // Pedir al usuario la capacidad máxima
        System.out.print("Ingrese la capacidad máxima de almacenamiento: ");
        int capacidadMaxima = scanner.nextInt();

        // Instanciar la clase de gestión de inventario
        GestionInventario gestionInventario = new GestionInventario();

        // Ejecución de los enfoques
        System.out.println("Beneficio máximo (Recursivo): " + gestionInventario.solucionRecursiva(productos, capacidadMaxima, productos.size()));
        System.out.println("Beneficio máximo (Bottom-Up): " + gestionInventario.solucionBottomUp(productos, capacidadMaxima));
        System.out.println("Beneficio máximo (Top-Down): " + gestionInventario.solucionTopDown(productos, capacidadMaxima));

        scanner.close();
    }
}

