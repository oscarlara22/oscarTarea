public class Camion extends Vehiculo {

    public Camion(String matricula) {
        super(matricula);
    }

    @Override
    public double calcularTiempoViaje(double distanciaKm) {
        return distanciaKm / 80;
    }
}
