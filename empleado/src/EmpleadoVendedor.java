class EmpleadoVendedor extends Empleado{
    private double comision;

    public EmpleadoVendedor(String nombre, double salarioBase, double comision){
        super(nombre, salarioBase);
        this.comision = comision;
    }
    @Override
    public double calcularSalario(){
        return salarioBase + comision;
    }
}