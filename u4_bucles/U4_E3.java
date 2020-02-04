/*
3. Hacer un programa que pida dos números por el teclado N 
y M, y si M > N muestre todos los valores comprendidos 
entre estos dos números.
 */
package u4_bucles;

import java.util.Scanner;

public class U4_E3 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        int N = lector.nextInt();
        System.out.println("Introduzca el segundo numero");
        int M = lector.nextInt();
        
        if (M > N){
            
            for (int i = N +1 ; N<M ; N++){
                System.out.println(N);
            }
        }
    }
}
