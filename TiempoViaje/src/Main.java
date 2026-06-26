import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la matricula del camion: ");
        String matriculaCamion = leer.nextLine();

        System.out.print("Ingrese la distancia del camion (km): ");
        double distanciaCamion = leer.nextDouble();
        leer.nextLine();

        System.out.print("Ingrese la matricula del avion: ");
        String matriculaAvion = leer.nextLine();

        System.out.print("Ingrese la distancia del avion (km): ");
        double distanciaAvion = leer.nextDouble();

        Vehiculo camion = new Camion(matriculaCamion);
        Vehiculo avion = new AvionCarga(matriculaAvion);

        System.out.println("\n===== RESULTADOS =====");

        System.out.println("Camion");
        System.out.println("Matricula: " + camion.getMatricula());
        System.out.println("Tiempo estimado: " + camion.calcularTiempoViaje(distanciaCamion) + " horas");

        System.out.println();

        System.out.println("Avion de Carga");
        System.out.println("Matricula: " + avion.getMatricula());
        System.out.println("Tiempo estimado: " + avion.calcularTiempoViaje(distanciaAvion) + " horas");
    }
}