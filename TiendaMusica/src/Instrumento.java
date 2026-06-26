/*Se requiere un sistema para una tienda de música. Todos los Instrumentos
tienen un nombre y un precio. Todos los
instrumentos deben poder ejecutarse mediante el método tocar(), pero la forma en que
emiten sonido depende exclusivamente del tipo de instrumento.*/
abstract class Instrumento {
    private String nombre;
    private double precio;

    public Instrumento(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;


    }
    //metodo abstracto: no tiene cuerpo {}, termina en punto y coma
    //obliga a las clases hijas a definir su propio sonido
    public abstract void tocar();
    //getters y setters (Encapsulamiento)
    public String getNombre() {return nombre;}
    public double getPrecio() {return precio;}
}
