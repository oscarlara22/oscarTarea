public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String genero;

    public Persona(String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
    }

    public abstract void clasificacion();
}