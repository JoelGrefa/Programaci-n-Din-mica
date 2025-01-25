public class Producto {
    String nombre;
    int valor;
    int peso;

    public Producto(String nombre, int valor, int peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }
}
