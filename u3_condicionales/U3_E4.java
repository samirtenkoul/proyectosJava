/*
4.Hacer un programa que determine si con el valor de los tres lados
de un triángulo, se puede formar este triángulo. 
Para formar un triángulo, todos los lados deben cumplir que su tamaño 
sea más pequeño que la suma de los otros dos.
 */
package u3_condicionales;

import java.util.Scanner;

public class U3_E4 {

    public static void main(String[] args) {
        //VARIABLE SCANNER
        Scanner lector = new Scanner(System.in);
        
        //ENTRADA DE DATOS
        System.out.println("Introduzca el primer lado en cm");
        double L1 = lector.nextDouble();
        System.out.println("Introduzca el segundo lado en cm");
        double L2 = lector.nextDouble();
        System.out.println("Introduzca el tercer lado en cm");
        double L3 = lector.nextDouble();
        
        //CIERRE SCANNER
        lector.close();
        
        //CONDICION
        if (L1<L2+L3 && L2<L1+L3 && L3<L1+L2){
            System.out.println("Con estos lados SI se puede formar un triangulo");
        }
        else {
            System.out.println("Con estos lado NO se puede formar un triangulo");
        }
    }
    
}
