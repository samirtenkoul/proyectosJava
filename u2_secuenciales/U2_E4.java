/*
4.  Hacer un programa que calcule el cuadrado de un número. 
 */
package u2_secuenciales;

//1.importar scanner
import java.util.Scanner;

public class U2_E4 {

    public static void main(String[] args) {
        //2. Variables
        Scanner lector = new Scanner(System.in);
        int numero;
        int cuadrado;
        
        //3. Recoger datos
        System.out.println ("Introduzca un numero");
        numero = lector.nextInt();
        
        lector.close();
        
        //4. Algoritmo
        cuadrado = numero*numero;
        System.out.println ("El cuadrado del numero dado es "+cuadrado);
    }
    
}
