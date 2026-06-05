public class Main {

    public static void main(String[] args) {

        Figura triangulo = new Triangulo(8, 5, 6, 7, 8);
        Figura rectangulo = new Rectangulo(10, 4);
        Figura circulo = new Circulo(3);

        System.out.println("=== TRIANGULO ===");
        System.out.println("Area: " + triangulo.calcularArea());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());

        System.out.println();

        System.out.println("=== RECTANGULO ===");
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());

        System.out.println();

        System.out.println("=== CIRCULO ===");
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
    }
}