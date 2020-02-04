
package u2_secuenciales;

import java.io.IOException;

/*System.in.read: lee bytes del teclado.
El problema de leer bytes, es que luego debemos convertirlos
a lo que necesitemos. Por ejemplo, si tecleamos una letra A mayúscula,
el byte leído es el 65, correspodiente a la A mayúscula en código ASCII.
Si tecleamos un 3 y un 2, es decir, un 32, leeremos dos bytes 51 y 52,
correspondientes a los caracteres ASCII del 3 y del 2, NO leeremos un 32. 
*/
public class U2_E0_SystemInRead {

    public static void main(String[] args) throws IOException {
        //Prueba 1
        System.out.println("Introduzca un caracter");
        int a = System.in.read();
        System.out.println(a);
        
        //Prueba 2
        char letra;
        System.out.println("Introduzca una letra");
        letra = (char) System.in.read();
        System.out.println(letra);
        
        
        
    }
    
}
