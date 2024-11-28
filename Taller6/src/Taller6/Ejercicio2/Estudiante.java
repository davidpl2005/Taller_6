package Taller6.Ejercicio2;

public class Estudiante {

    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante() {
        this("Desconocido", 0); 
    }

    public void mostrarDetalles() {
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Edad del estudiante: " + edad);
    }
    
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles();

        Estudiante estudiante2 = new Estudiante("Juan", 25);
        estudiante2.mostrarDetalles();
    }
}
