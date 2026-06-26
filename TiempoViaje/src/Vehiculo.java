public abstract class Vehiculo {

    private String matricula;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public abstract double calcularTiempoViaje(double distanciaKm);
}
