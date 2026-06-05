class Estreaming extends ServicioSuscripcion {
    private int pantallas;
    private boolean premiumExtra;

    public Estreaming(String nombre, double costoBase, int meses,
                      int pantallas, boolean premiumExtra) {
        super(nombre, costoBase, meses);
        this.pantallas = pantallas;
        this.premiumExtra = premiumExtra;
    }

    @Override
    public double calcularCosto() {
        double costo = costoBase + (pantallas * 50);

        if (premiumExtra) {
            costo += 100;
        }

        return costo;
    }
}


