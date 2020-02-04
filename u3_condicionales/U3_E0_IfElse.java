/*
Imprimir por pantalla si el valor de una variable predefinida
es positivo o negativo. 
*/
package u3_condicionales;

import java.util.Scanner;

public class U3_E0_IfElse {

    public static void main(String[] args) {
        //ENTRADA DE DATOS
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num = lector.nextInt();
        
        //SECUENCIAL IF ELSE
        if (num >= 0){
            System.out.println("El numero introducido es positivo");
        }
        else {
            System.out.println("El numero introducido es negativo");
        }
    }
}
