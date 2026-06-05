class Cloud extends ServicioEmpresarial {
    private int almacenamiento;
    private String tipoEmpresa;

    public Cloud(String nombre, double costoBase, int empleados,
                 int almacenamiento, String tipoEmpresa) {

        super(nombre, costoBase, empleados);
        this.almacenamiento = almacenamiento;
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public double calcularCosto() {

        double costo = super.calcularCosto();

        costo += almacenamiento * 5;

        if(tipoEmpresa.equals("Corporativo")){
            costo += 500;
        }

        return costo;
    }
}