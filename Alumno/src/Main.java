public class Main {
    public static void main(String[] args) {
        Estudiante alumno1 = new Estudiante("Oscar", 7.5);
        Estudiante alumno2 = new Estudiante("Uriel", 4.2);
        alumno1.mostrarInfo();
        alumno2.mostrarInfo();
        System.out.println("¡Sofia repitio el examen!");
        alumno2.setCalificacion(8.0);
        alumno2.mostrarInfo();
    }
}