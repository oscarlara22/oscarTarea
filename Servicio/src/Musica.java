class Musica extends ServicioSuscripcion {
    private String calidad;

    public Musica(String nombre, double costoBase, int meses, String calidad) {
        super(nombre, costoBase, meses);
        this.calidad = calidad;
    }

    @Override
    public double calcularCosto() {

        double costo = super.calcularCosto();

        if(calidad.equals("media")){
            costo += 50;
        }
        else if(calidad.equals("alta")){
            costo += 100;
        }
        else if(calidad.equals("premium")){
            costo += 150;
        }

        return costo;
    }
}