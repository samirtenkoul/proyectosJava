/*
22.En un supermercado se hace una promoción, mediante la cual el cliente 
obtiene un descuento dependiendo de un numero que se escoge al azar. 
- Si el numero escogido es menor que 74 el descuento es del 15% sobre el total 
- Si es mayor o igual a 74 el descuento es del 20%.
- Obtener cuanto dinero se le descuenta.
 */
package u3_condicionales;

import java.util.Scanner;

public class U3_E22 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el importe de su compra");
        double importe = lector.nextDouble();
        int num = (int)(Math.random()*100);
        System.out.println("Su numero es el "+num);
        double descuento;
        
        if (num < 74){
            descuento = importe * 0.15;
            importe = importe * 0.85;
        }
        else{
            descuento = importe * 0.20;
            importe = importe * 0.80;
        }
        System.out.println("El importe final es de "+importe+"€\n"
                + "Se han descontado "+descuento+"€"
        );
    }
}
