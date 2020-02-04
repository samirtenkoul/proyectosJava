/*
7.Hacer un programa que pida dos números
después que los imprima en orden ascendente.
 */
package u3_condicionales;

import java.util.Scanner;

public class U3_E7 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int n1 = lector.nextInt();
        System.out.println("Introduzca el segundo numero");
        int n2 = lector.nextInt();
        
        if (n1>n2){
            System.out.println(n2+" "+n1);
        }
        else {
            System.out.println(n1+" , "+n2);
        }
    }
    
}
