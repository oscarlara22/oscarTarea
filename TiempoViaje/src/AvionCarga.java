public class AvionCarga extends Vehiculo {

    public AvionCarga(String matricula) {
        super(matricula);
    }

    @Override
    public double calcularTiempoViaje(double distanciaKm) {
        return distanciaKm / 600;
    }
}