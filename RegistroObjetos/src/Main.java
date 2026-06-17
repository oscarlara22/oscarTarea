import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);

        System.out.print("¿Cuantas personas desea registrar?: ");
        int cantidad = leer.nextInt();
        leer.nextLine();

        Persona[] per = new Persona[cantidad];

        int totalHombres = 0;
        int totalMujeres = 0;
        int totalMenores = 0;
        int totalAdultos = 0;

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nRegistro " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = leer.nextLine();

            System.out.print("Edad: ");
            int edad = leer.nextInt();
            leer.nextLine();

            System.out.print("Genero (Hombre/Mujer): ");
            String genero = leer.nextLine();

            if (genero.equalsIgnoreCase("Hombre")) {
                per[i] = new Hombre(nombre, edad, genero);
                totalHombres++;
            } else {
                per[i] = new Mujer(nombre, edad, genero);
                totalMujeres++;
            }

            if (edad <= 18) {
                totalMenores++;
            } else {
                totalAdultos++;
            }
        }

        System.out.println("\n===== PERSONAS REGISTRADAS =====");

        for (int i = 0; i < cantidad; i++) {
            per[i].mostrarInfo();
            per[i].clasificacion();
            System.out.println("-------------------");
        }

        System.out.println("\n===== RESUMEN =====");
        System.out.println("Total de hombres: " + totalHombres);
        System.out.println("Total de mujeres: " + totalMujeres);
        System.out.println("Total de menores: " + totalMenores);
        System.out.println("Total de adultos: " + totalAdultos);
    }
}