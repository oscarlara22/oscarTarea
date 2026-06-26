public class Main {
    public static void main (String[] args){
        //creamos un arreglo polimorfico aprovechando la abstraccion
        Instrumento[] orquesta ={
                new Guitarra("fender stratocaster",1200.0),
                new Bateria("Yamaha stage custom",2500.0)
        };
        System.out.println("=== DEMOSTRACION DE ABSTRACCION BASICA ===");
        for (Instrumento i : orquesta) {
            i.tocar();// cada instrumrnto resuelve su propia abstraccion
        }
    }
}