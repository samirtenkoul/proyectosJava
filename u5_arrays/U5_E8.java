/*
8. Hacer un programa que:
 a. Lea una secuencia de 20 valores numéricos reales y
    los almacene en un array de nombre “números”.
 b. Muestra en pantalla cuál es el valor máximo, así como 
    la posición que ocupa en el array. En el caso de aparecer 
    repetido mostrará sólo el de menor índice.
 */
package u5_arrays;

public class U5_E8 {

    public static void main(String[] args) {
        int [] numeros = new int [20];
        int i;
        int vmax = 0;
        int pos = 0;
        
        //a. Rellenar array
        for (i = 0; i<numeros.length; i++){
            numeros[i] = (int)(Math.random()*100)-50;
        }
        
        //b. Mostrar por pantalla
        for (i = 0; i<numeros.length; i++){
            if (numeros[i] > vmax ){
                vmax = numeros[i];
                pos = i;
            }
        }
        System.out.printf("El valor maximo es %d que esta en la posicion %d. %n", vmax, pos);
    }
}
