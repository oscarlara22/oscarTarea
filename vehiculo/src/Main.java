public class Main {
    public static void main(String[] args){
        vehiculo moto = new moto("toyota","2000", 20000,200);
        vehiculo auto = new auto("focus","67", 1000,4);

System.out.println("costo moto: " + moto.calcularCosto());
System.out.println("costo auto: " + auto.calcularCosto());
    }
}