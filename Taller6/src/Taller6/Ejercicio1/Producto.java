package Taller6.Ejercicio1;

public class Producto {

    private String nombre;
    private double precio;


    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    public void mostrarProducto() {
        System.out.println("Nombre del Producto: " + nombre);
        System.out.println("Precio del Producto: $" + precio);
    }
    public static void main(String[] args) {
        Producto producto = new Producto("Café", 5.99);
        producto.mostrarProducto();
    }
}
