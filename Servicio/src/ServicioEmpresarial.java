class ServicioEmpresarial extends Servicio {
    private int empleados;

    public ServicioEmpresarial(String nombre, double costoBase, int empleados){
        super(nombre,costoBase);
        this.empleados=empleados;
    }

    @Override
    public double calcularCosto(){
        return costoBase + (empleados * 20);
    }

}
