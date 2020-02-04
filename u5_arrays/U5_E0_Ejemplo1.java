package u5_arrays;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class U5_E0_Ejemplo1 {

    public static void main(String[] args)throws IOException {
        
        Scanner leer = new Scanner(System.in);
        //int longitud = leer.nextInt();
 /*       int vector[] = new int[3];//        int minimo=100;
//        int maximo =-100;
//        for (int i=0;i<100;i++) {   
//            System.out.println((int)(Math.random()*(maximo-minimo)+minimo));
//      //      System.out.println((int)(Math.random()*200-100));
    //}
        //cargar de forma aleatoria el array
        for (int i = 0; i < vector.length; i++) {
            //vector[i]=(int)(Math.random()*100);
            System.out.println("Introduce el elemento "+ (i+1));
            vector[i]= leer.nextInt();
        }
        
        
        for (int i = 0; i < vector.length; i++) {
            //vector[i]=(int)(Math.random()*100);
            System.out.print(vector[i]+", ");
        }
        int N;
        do{
            System.out.println("Cuántos elementos quiere sumar");
            N= leer.nextInt();
        }while (N>vector.length);
        int suma=0;
        for (int i = 0; i < N; i++) {
            suma=suma+vector[i];
        }
        System.out.println("El resultado es "+suma);
*/
    int tabla[][] =new int[5][5];
        for (int fila = 0; fila < tabla.length; fila++) {
            for (int columna = 0; columna < tabla[0].length ; columna++) {
                if (fila%2!=0)
                    tabla[fila][columna]=1;
            }
        }
         for (int fila = 0; fila < tabla.length; fila++) {
            for (int columna = 0; columna < tabla[0].length ; columna++) {
                System.out.print(tabla[fila][columna]);
            }
             System.out.println("");
        }
    }
}
