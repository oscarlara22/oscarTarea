class Guitarra extends Instrumento {
    public Guitarra(String nombre, double precio){
        super(nombre, precio);
    }

    @Override
    public void tocar(){
        System.out.println("La Guitarra" + getNombre() + "suena: Ragueo de cuerdas ... DING DANG (Precio: $" + getPrecio() + ")");

    }

}
