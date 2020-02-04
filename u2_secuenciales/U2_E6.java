/*
6.  Hacer un programa que dada una cantidad de euros introducida desde teclado,
la distribuya en billetes de 10, 5 éuros y monedas de 50, 10, 5 y 1 céntimos. 
 */
package u2_secuenciales;

import java.util.Scanner;

public class U2_E6 {

    public static void main(String[] args) {
        //1. Variables
        double cantidad;
        double bDiez;
        double bCinco;
        double mCincuenta;
        double mDiez;
        double mCinco;
        double mUno;
        Scanner lector = new Scanner (System.in);
        
        //2. Recoger datos
        System.out.println("Introduzca una cantidad de dinero");
        cantidad = lector.nextDouble();
        
        lector.close();
        
        //3. Algoritmo
        bDiez = cantidad / 10; 
        System.out.println("La cantidad introducida da "+bDiez+" billetes de 10€");
        
        bCinco = cantidad / 5; 
        System.out.println("La cantidad introducida da "+bCinco+" billetes de 5€");
    }
    
}
