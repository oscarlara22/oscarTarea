import java.util.Scanner;
    public class Main{
    public static void main (String[] args) {
        //2-.creamos una instancia de Scanner asociada a la entrada
        Scanner teclado = new Scanner(System.in);
        {
            //3-. capturar una cadena de texto
            System.out.println("Introduce el nombre:");
            String nombreCapturado = teclado.nextLine();
            //4-. capturamos un entero
            System.out.println("Introduce la edad:");
            int edadCapturada = teclado.nextInt();
            //5-. Aplicamos POO
            //pasamos los datos capturados al constructor
            //de la clase usuario
            Usuario usuario1 = new Usuario(nombreCapturado, edadCapturada);
            //6-. Ejecutamos el metodo del objeto creado
            usuario1.mostarDatos();
            // Buena practica, carramos el flujo del objeto Scanner
            teclado.close();
        }
    }
}