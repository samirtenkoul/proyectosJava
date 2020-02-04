/*
Imprimir por pantalla si el valor de una variable predefinida
es positivo, negativo o 0. 
 */
package u3_condicionales;

import java.util.Scanner;

public class U3_E0_If_Elseif_Else {

    public static void main(String[] args) {
        //ENTRADA DE DATOS
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num = lector.nextInt();
        
        //SECUENCIAL IF ELSEIF ELSE
        if (num > 0){
            System.out.println("El numero introducido es positivo");
        }
        else if (num < 0){
            System.out.println("El numero introducido es negativo");
        }
        else {
            System.out.println("El numero introducido es 0");
        }
        
    }
    
}
