/*
3.Hacer un programa que:
  a. Lea una secuencia de 15 números enteros almacenándolos en 
     un array de nombre “números”
  b. Los visualice en el dispositivo estándar de salida en orden inverso
     al de entrada
 */
package u5_arrays;

public class U5_E3 {

    public static void main(String[] args) {
        //Variables: array numeros y indice for
        int [] numeros = new int [15];
        int i;
        //a. Rellenar array num aleatorios
        for (i = 0; i<numeros.length;i++){
            numeros[i] = (int)(Math.random()*100);
        }
        //b. Visualizar de manera inversa
        System.out.println("Array numeros inverso: ");
        for (i=numeros.length-1;i>=0;i--){
            if(i==0){
                System.out.print(numeros[i]);
            }
            else{
                System.out.print(numeros[i]+" , ");
            }
        }
        System.out.println("");
        
        //Visualizar en orden
        System.out.println("Array numeros en orden:");
        for (i=0; i<=numeros.length-1;i++){
            if(i==numeros.length -1){
                System.out.print(numeros[i]);
            }
            else{
                System.out.print(numeros[i]+" , ");
            }
        }
        System.out.println("");
        /*
        if(i==destino.length-1){
                System.out.print(destino[i]);
            }
            else{
                System.out.print(destino[i]+" , ");
            }
        */    
    }
}
