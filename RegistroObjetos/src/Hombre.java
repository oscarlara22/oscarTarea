public class Hombre extends Persona {

    public Hombre(String nombre, int edad, String genero){
        super(nombre, edad, genero);
    }

    @Override
    public void clasificacion() {
        if (edad <= 18) {
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Es adulto");
        }
    }
}