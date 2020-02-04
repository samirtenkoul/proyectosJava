/*
1. Hacer un programa que pida dos números enteros por el teclado y los sume.
*/
package u2_secuenciales;

//1. Importat libreria
import java.util.Scanner;

public class U2_E1 {

    public static void main(String[] args) {
        //2. Variables (una de tipo scanner).
        Scanner lector = new Scanner (System.in); 
        int num1;
        int num2;
        int suma;
        
        //3. recoger datos scanner en variable.
        System.out.println("Introduzca el primer numero entero");
        num1 = lector.nextInt();
        
        System.out.println("Introduzca el segundo numero entero");
        num2 = lector.nextInt();
        
        lector.close();
        
        //4. Algoritmo
        suma = num1 + num2;
        System.out.println("La suma de los numeros introducidos es "+suma);
        
    }
    
}
