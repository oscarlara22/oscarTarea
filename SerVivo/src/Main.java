import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        SerVivo[] seres = new SerVivo[10];

        int cantidad;

        System.out.print("¿Cuantos seres vivos desea registrar?: ");
        cantidad = leer.nextInt();
        leer.nextLine();

        for (int i = 0; i < cantidad; i++) {

            System.out.println("\nRegistro " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = leer.nextLine();

            System.out.print("Edad: ");
            int edad = leer.nextInt();
            leer.nextLine();

            System.out.print("Tipo (Animal/Planta): ");
            String tipo = leer.nextLine();

            if (tipo.equalsIgnoreCase("Animal")) {
                seres[i] = new Animal(nombre, edad);
            } else {
                seres[i] = new Planta(nombre, edad);
            }
        }

        System.out.println("\n===== SERES VIVOS REGISTRADOS =====");

        for (int i = 0; i < cantidad; i++) {
            seres[i].mostrarInfo();
            seres[i].realizarAccion();
            System.out.println("-------------------");
        }
    }
}