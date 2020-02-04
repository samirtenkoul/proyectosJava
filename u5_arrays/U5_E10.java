/*
10. Hacer un programa que intercambie el primer y el último elemento
de una lista.
 */
package u5_arrays;

public class U5_E10 {

    public static void main(String[] args) {
        
        //a. Crear array
        int [] numeros = new int [10];
        int i;
        int aux = 0;
        
        //b. Rellenar e imprimir array
        for (i = 0; i<numeros.length; i++ ){
            numeros[i] = (int)(Math.random()*100);
            System.out.print(" "+numeros[i]+" ");
        }
        System.out.println("");
        
        //c. intercambiar valores
        for (i = 0; i<numeros.length; i++ ){
            if (i==0){
                aux = numeros[i];
                numeros[i] = numeros[numeros.length-1];
                numeros [numeros.length-1] = aux;
            }
            System.out.print(" "+numeros[i]+" ");
        }
    }
}
