/*
3.Introducir dos números por el teclado, dividendo y divisor.
Si dividendo es divisible por divisor,
el programa ha de mostrar el mensaje “DIVISIBLES”.
 */
package u3_condicionales;

import java.util.Scanner;

public class U3_E3 {

    public static void main(String[] args) {
        //VARIABLE SCANNER
        Scanner lector = new Scanner(System.in);
        
        //ENTRADA DE DATOS 
        System.out.println("Introduzca el dividendo");
        double dividendo = lector.nextDouble();
        System.out.println("Introduzca el divisor");
        double divisor = lector.nextDouble();
        
        //CIERRE SCANNER
        lector.close();
        
        //CONDICION
        if (dividendo % divisor ==0){
            System.out.println("DIVISIBLES");
        }
    }
}
