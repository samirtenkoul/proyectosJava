/*
2.Hacer un programa que muestre los números pares, 
del 1 al 100.
 */
package u4_bucles;

public class U4_E2 {

    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i%2==0){
                System.out.printf("%d %n",i);
            }
        }
    }
}
