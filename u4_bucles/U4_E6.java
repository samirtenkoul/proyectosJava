/*
6. Hacer un programa que pida un número, 
y después muestre su tabla de multiplicar.
 */
package u4_bucles;

import java.util.Scanner;

public class U4_E6 {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduzca un numero");
        int num = lector.nextInt();
        System.out.printf("La tabla de multiplicar de %d es: %n",num);
        for (int i=0; i<=10;i++){
            int res = num * i;
            
            System.out.printf("%d x %d = %d %n",num,i,res);
        }
    }
    
}
