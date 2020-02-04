/*
5.  Hacer un programa que pida los valores de los dos catetos de un triángulo
rectángulo, y calcule el valor de la hipotenusa. Utilizar la librería Math.
 */
package u2_secuenciales;

//1. Importa scanner
import java.util.Scanner;

public class U2_E5 {

    public static void main(String[] args) {
        //2. Variables
        double cateto1;
        double cateto2;
        double hipotenusa;
        Scanner lector = new Scanner (System.in);
        
        //3. Recoger valores
        System.out.println("Introduzca el valor del primer cateto");
        cateto1 = lector.nextFloat();
            
        System.out.println("Introduzca el valor del segundo cateto");
        cateto2 = lector.nextFloat();
        
        lector.close();
        
        //4. Algoritmo
        hipotenusa = Math.hypot(cateto1, cateto2);
        System.out.println ("La hipotenusa del triangulo rectangulo dado es "+hipotenusa);
        
    }
    
}
