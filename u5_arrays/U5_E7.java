/*
7. Hacer un programa que:
 a.Cree un array unidimensional de 30 elementos de tipo numérico entero
   y nombre ”números”
 b.Inicializar el array con valores +, - y nulos
 c.Contabilizar el número de valores +,- y nulos
 d.Mostrar en pantalla los resultados obtenidos
 */
package u5_arrays;

public class U5_E7 {

    public static void main(String[] args) {
        //a. crear array numeros de 30
        int [] numeros = new int [30];
        int i;
        int pos = 0;
        int neg = 0;
        int nul = 0;
        
        //b. inicializar array
        for (i = 0; i <numeros.length; i++){
            numeros[i] = (int)(Math.random()*200)-100;
        }
        
        //c. contabilizar valores
        for (i = 0; i<numeros.length; i++){
            if (numeros[i]>0){
                pos++;
            }
            else if (numeros[i]<0){
                neg++;
            }
            else {
                nul++;
            }
        }
        //d. mostrar por pantalla
        System.out.println("El array numeros contiene: ");
        for (i = 0; i<numeros.length; i++){
            if (i ==numeros.length -1){
                System.out.print(numeros[i]);
            }
            else {        
            System.out.print(numeros[i]+", ");
            }
        }
        System.out.println("");
        System.out.println("Y da como resultado: \n"
                + pos+" valores positivos \n"
                + neg+" valores negativos \n"
                + nul+" valores nulos \n");
        System.out.println("");
    }
}
