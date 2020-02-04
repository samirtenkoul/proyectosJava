
package u2_secuenciales;

/*1. Importamos librerio io.*(todas la de io)
InputStreamReader: convierte bytes a caracteres y nos lo devuelve.
La pega es que nos da los caracteres sueltos.
*/
import java.io.*;

public class U2_E0_InputStreamreader {

    
    public static void main(String[] args) throws IOException {
       
       //2. Variables, instanciamos nuestros reader
       char letra;
       InputStreamReader lector= new InputStreamReader(System.in);
       //4. Mensaje
       System.out.println("Introduzca una letra");
       /*5.ENTRADA DE DATOS CARACTERES, InputStreamReader, ver librería java.io.*
       Hay que castearlo porque lo que entra es un int
       */
       letra = (char)lector.read();
        
       System.out.println("la letra introducida ha sido: "+ letra);
       
    }
    
}
