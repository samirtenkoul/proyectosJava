/*
4. Repetir el programa anterior, pero en el caso que M < N, 
intercambie los valores y muestre los números comprendidos 
entre ellos.
 */
package u4_bucles;

import java.util.Scanner;

public class U4_E4 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduzca el primer numero");
        int N = lector.nextInt();
        System.out.println("Introduzca el segundo numero");
        int M = lector.nextInt();
        
        if (M < N){
            int aux = N;
            N = M;
            M = aux;
            for (int i = N + 1; N < M; N++){
                System.out.println(N);
            }
        }
    }
}
