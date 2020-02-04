/*
9. Hacer un programa que sume los números que hay en las posiciones 
pares de una lista de diez elementos.
 */
package u5_arrays;

public class U5_E9 {

    public static void main(String[] args) {
        
        //a. crear array
        int [] numeros = new int [10];
        int i;
        int suma = 0;
        //b. rellenar y mostrar array
        for (i = 0; i<numeros.length; i++){
            numeros [i] = (int)(Math.random()*100);
            System.out.print(" "+numeros[i]+" ");
        }
        System.out.println(" ");
        //b. Sumar valores posiciones pares
        for (i = 0; i<numeros.length; i++){
            if (i%2==0 && i!=0){
                suma = suma + numeros[i];
            }
        }
        System.out.printf(" La suma de los valores de las posiciones pares da %d %n", suma);
    }
}
