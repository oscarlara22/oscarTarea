class ServicioSuscripcion extends Servicio {
    private int meses;

    public ServicioSuscripcion(String nombre, double costoBase, int meses){
        super(nombre,costoBase);
        this.meses=meses;
    }

    public ServicioSuscripcion(int meses) {
        super(meses );
    }

    @Override
    public double calcularCosto(){
        return costoBase * meses;
    }

}
