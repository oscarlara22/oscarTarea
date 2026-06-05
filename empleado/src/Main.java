public class Main {
    public static void main(String[] args){

        Empleado e1 = new EmpleadoVendedor("Carlos", 5000, 2000 );
        Empleado e2 = new EmpleadoRepartidor("Ana", 4000, 10 );

        System.out.println("Salario Vendedor: " + e1.calcularSalario());
        System.out.println("Salario Repartidor: " + e2.calcularSalario());
    }
}