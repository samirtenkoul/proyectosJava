
package u2_secuenciales;

/*1. Importamos librerio io.*(todas la de io)
BufferedReader: nos lee de golpe todo lo que ha escrito el usuario de nuestro
programa, lo convierte en un string y nos lo devuelve de un golpe.
*/
import java.io.*;
import java.util.Scanner;

public class U2_E0_BufferedReader {

    
    public static void main(String[] args) throws IOException {
       //2. Variables, necesitamos un reader (input strem reader lector) 
       InputStreamReader lector= new InputStreamReader(System.in);
       //variable string recoge los datos
       String texto;
       //variable bufferedreader que lo convierte a string
       BufferedReader bfr = new BufferedReader(lector);
       //3. Pedimos los datos
       System.out.println("Introduzca una palabra");
       /*4. Recogemos los datos tecleados en nuestra variable buffered
       hasta que pulsamos <INTRO>
       */
       texto = bfr.readLine();
       //5.nos lo devuelve como un string
       System.out.println("La palabra es "+texto);
        
    }
    
}
