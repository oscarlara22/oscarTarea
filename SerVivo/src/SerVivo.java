public abstract class SerVivo {

    protected String nombre;
    protected int edad;

    public SerVivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public abstract void realizarAccion();
}

