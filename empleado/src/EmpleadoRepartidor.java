class EmpleadoRepartidor extends Empleado {
    private int zonasRepartidas;

    public EmpleadoRepartidor(String nombre, double salarioBase, int zonasRepartidas){
        super(nombre, salarioBase);
        this.zonasRepartidas = zonasRepartidas;
    }
    @Override
    public double calcularSalario(){
        return salarioBase + (zonasRepartidas * 50);
    }
}