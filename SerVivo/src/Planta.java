public class Planta extends SerVivo {

    public Planta(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void realizarAccion() {
        System.out.println(nombre + " esta realizando fotosintesis.");
    }
}