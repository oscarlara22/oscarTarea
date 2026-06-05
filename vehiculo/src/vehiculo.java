public abstract class vehiculo {
    protected String marca;
    protected String modelo;
    protected double costoBase;

    public vehiculo(String marca,String modelo,double costoBase){
    this.marca=marca;
    this.modelo=modelo;
    this.costoBase=costoBase;
    }
    public  double calcularCosto(){
        return costoBase;
    }
}
