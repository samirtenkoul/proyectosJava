/*
13. Hacer un programa que pida un carácter,
- diga si es una letra mayúscula (ASCII del 65 al 90),
- una letra minúscula (ASCII del 97 al 122),
- o bien otro carácter.
 */
package u3_condicionales;

import java.io.IOException;

public class U3_E13 {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Introduzca un caracter");
        char letra = (char)System.in.read();
        
        if (letra >=65 && letra <=90){
            System.out.println(letra+" es mayuscula");
        }
        else if (letra >=97 && letra <=122){
            System.out.println(letra+" es minuscula");
        }
        else {
            System.out.println(letra+" no es una letra");
        }
    }
}
