public class Main {
    public static void main(String[] args) {
        Servicio s1 = new Estreaming("Netflix",200,6,3,false);
        Servicio s2 = new Musica("Spotify",100,12,"premium");
        Servicio s3 = new Cloud("Google Cloud", 1000,50,200,"Corporativo");

        System.out.println("STREAMING");
        System.out.println("Costo: $" + s1.calcularCosto());

        System.out.println("\nMUSICA");
        System.out.println("Costo: $" + s2.calcularCosto());

        System.out.println("\nCLOUD ");
        System.out.println("Costo: $" + s3.calcularCosto());
    }
}