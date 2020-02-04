/*
3.  Hacer un programa que pida tres números A, B, C,
    y después haga el cálculo siguiente: D=((A+B) / C).
*/
package u2_secuenciales;

//1. Importar Scanner
import java.util.Scanner;

public class U2_E3 {
    
    public static void main(String[] args) {
        
        //2. Variables (float por si decimales)
        Scanner lector = new Scanner (System.in);
        float A;
        float B;
        float C;
        float D;
        
        //3. Recoger datos con scanner
        System.out.println("Introduzca el primer numero");
        A = lector.nextFloat();
        
        System.out.println("Introduzca el segundo numero");
        B = lector.nextFloat();
        
        System.out.println("Introduzca el tercer numero");
        C = lector.nextFloat();
        
        lector.close();
        
        //4. Algoritmo
        D=((A+B) / C);
        System.out.println("El resultado de la operacion es "+D);
    }
    
}
