/*
5. Hacer un programa que pida tres números N, M y Y.
Mostrar todos los valores comprendidos entre N y M 
con un intervalo Y. 
Si M < N, antes se habrán de intercambiar los valores.
 */
package u4_bucles;

import java.util.Scanner;

public class U4_E5 {

    public static void main(String[] args) {
        //ENTRADA DE DATOS
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduzca el primer numero");
        int N = lector.nextInt();
        System.out.println("Introduzca el segundo numero");
        int M = lector.nextInt();
        System.out.println("Introduzca el intervalo");
        int Y = lector.nextInt();
        //CONDICION (INTERCAMBIO DE VALORES)
        if ( M < N){
            int aux = N;
            N = M;
            M = aux;
            }
        for (int i = N + 1; i <= M; i = i + Y){
            System.out.println(i);    
        }
    }
}
