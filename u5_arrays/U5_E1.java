/*
Hacer un programa que:
1.Cree un array unidimensional de nombre “vector” y 15 elementos, siendo sus componentes de tipo numérico entero
2.Cargar el array con valores aleatorios que sean introducidos por teclado
3.Calcular la suma de los primeros N elementos almacenados en el array
4.Muestre el resultado obtenido así como el contenido del array en pantalla
*/
package u5_arrays;
import java.util.*;
public class U5_E1 {

    public static void main(String[] args) {
        //1. Declaracion + asignacion de un array
        int [] vector = new int [15];
        
        //2. Bucle para rellenar con numeros aleatorios el array
        for (int i = 0; i<vector.length;i++){
            vector[i]=(int)(Math.random()*100);
        }
        //2b. Cargar el array con valores que sean introducidos por teclado 
        Scanner lector = new Scanner(System.in);
        int[] vector1 = new int[3];
            
        for(int i=0; i<vector1.length;i++) {
            System.out.println ("Introduzca el elemento "+ (i+1));
            vector1[i]=lector.nextInt();
	}
        /*3a. Bucle imprime contenido array
        for (int j = 0;j<vector.length;j++){
            System.out.println(vector[j]);
        }
        */
        //3b. Imprimir array en un linea quitando la ultima coma
        for(int i=0;i<vector.length;i++) {
            if(i==vector.length -1) {
		System.out.print(vector[i]);
            }
            else{
		System.out.print(vector[i]+" , ");
            }	
        }
	System.out.println("");
        
        //5. Calcular la suma de los primeros N elementos almacenados en el array
	int N =0;
	do {
	System.out.println("Introduzca el numero de elementos que quiere sumar");
	N = lector.nextInt();
	if (N>vector.length) {
	System.out.println("La cantidad no puede ser mayor que el numero de elementos");
	}
	}while (N>vector.length);
	int suma=0;
	for (int k=0;k<N;k++) {
	suma = suma+vector[k];
	}
	
        //6. Muestre el resultado obtenido así como el contenido del array en pantalla
	System.out.println("La suma de los primeros "+N+" elementos da "+suma);
		
	lector.close();
    }
}
