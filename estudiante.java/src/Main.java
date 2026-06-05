

public class Main {
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Juan", 5000);

        c1.depositar(2000);
        c1.retirar(1000);

        // ESTO YA NO ES POSIBLE:
        // c1.saldo = -10000;

        System.out.println("Saldo final: " + c1.getSaldo());
    }
}