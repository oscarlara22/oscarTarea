public class Animal extends SerVivo {

    public Animal(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void realizarAccion() {
        System.out.println(nombre + " se esta alimentando.");
    }
}