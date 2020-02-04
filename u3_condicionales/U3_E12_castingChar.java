/*
12. Hacer un programa que pida un carácter y diga si es una letra mayúscula. 
Dentro del código ASCII los caracteres mayúscula están comprendidos 
entre el 65(A), y el 90(Z).
 */
package u3_condicionales;

import java.io.IOException;


public class U3_E12_castingChar {

    public static void main(String[] args) throws IOException {
        //ENTRADA CHAR+ (CASTING)SYSTEM.READ
        System.out.println("Introduzca un caracter");
        char letra = (char)System.in.read();
        
        //CONDICION
        if ((letra >='A') && (letra <='Z')){
            System.out.println(letra+" es mayuscula");
        }
        else {
            System.out.println(letra+" no es mayuscula");
        }
    }
}
