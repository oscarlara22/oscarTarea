public class Estudiante {
    // 1. Atributos (identificados con '-' en el UML)
    private String nombre;
    private double calificacion;

    // 2. Constructor (identificado con '+' en el UML)
    public Estudiante(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    // 3. Métodos (identificados con '+' en el UML)

    // Cambia la nota actual por una nueva
    public void setCalificacion(double nuevaCalif) {
        this.calificacion = nuevaCalif;
    }

    // Devuelve true si la nota es 6 o más, de lo contrario false
    public boolean haAprobado() {
        return this.calificacion >= 6.0;
    }

    // Imprime los datos en la consola
    public void mostrarInfo() {
        System.out.println("Alumno: " + nombre);
        System.out.println("Nota: " + calificacion);
        System.out.println("¿Aprobado?: " + (haAprobado() ? "Sí" : "No"));
        System.out.println("-------------------------");
    }
}
