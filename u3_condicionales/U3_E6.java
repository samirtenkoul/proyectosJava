/*
6.Hacer un programa que pida dos números por el teclado. 
- si el primer número es divisible por el segundo los ha de sumar. 
- sino, los ha de multiplicar.
 */
package u3_condicionales;

import java.util.Scanner;

public class U3_E6 {

    public static void main(String[] args) {
        //SCANNER
        Scanner lector = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.println("Introduzca el primer numero");
        double n1 = lector.nextDouble();
        System.out.println("Introduzca el primer numero");
        double n2 = lector.nextDouble();
        //CIERRE SCANNER
        double resultado;
        //CONDICION
        if (n1%n2==0){
            resultado = n1 + n2;
        }
        else {
            resultado = n1 * n2;
        }
        System.out.println("El resultado es "+resultado);
    }
    
}
