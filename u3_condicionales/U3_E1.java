/*
1. Hacer un programa que pida el precio y el descuento de un producto
y calcule el total. Si el total supera los 100 euros,
el programa ha de descontar 15€.
 */
package u3_condicionales;

import java.util.Scanner;

public class U3_E1 {
    
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el precio");
        double precio = lector.nextDouble();
        System.out.println("Introduzca el descuento");
        double desc = lector.nextDouble();
        double total = precio - (precio * (desc/100));
        double totalFinal = total-15;
        
        if ( total <=100){
            System.out.println("El importe con descuento es de "+total+"€");
        }
        else {
            System.out.println("El importe con descuento es de "+total+"€ ,\n"
                    + "con el descuento adicional el importe final es de "+totalFinal+"€");
        }
    }
}
