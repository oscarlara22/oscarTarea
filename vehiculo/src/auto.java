class auto extends vehiculo {
    private int numPuertas;

    public auto(String marca, String modelo, double costoBase, int numPuertas){
        super(marca,modelo,costoBase);
    this.numPuertas=numPuertas;
    }

@Override
    public double calcularCosto(){
    return costoBase + (numPuertas * 100);
}
}
