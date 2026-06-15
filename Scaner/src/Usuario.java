public class Usuario {
    //Atributos

    private String nombre;
    private int edad;

    //Constructor
    public Usuario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo para mostrar la informacion

    public void mostarDatos(){
        System.out.println("Datos del usuario:");
        System.out.println("Nombre:"+ this.nombre);
        System.out.println("Edad:"+ this.edad + " Años");
    }

}
