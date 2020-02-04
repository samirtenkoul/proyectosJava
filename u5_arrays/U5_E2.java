/*
2.Hacer un programa en el que dado el siguiente array de nombre origen:
10,25,26,40,37,45,90,76,78,81,58,32 
    1.Lo recorre metiendo en un segundo array de nombre destino todos aquellos 
      elementos que sean pares y mayores de 25
    2.Muestre en pantalla el contenido de los dos arrays unidimensionales
*/
package u5_arrays;
public class U5_E2 {

    public static void main(String[] args) {
        
        int [] origen = {10,25,26,40,37,45,90,76,78,81,58,32};
        int i = 0;//indice para los for de origen
        int j= 0;//indice para los for de destino
        
        //Asignar tamaño arrays destino
        int contador = 0;
        for (i=0; i<origen.length;i++){
            if (origen[i]%2==0 && origen[i]>25){
                contador++;
            }
        }
        //Rellenar destino con pares y <25
        int [] destino = new int[contador];
        
        for (i=0; i<origen.length;i++){
            if(origen[i]%2==0 && origen[i]>25){
                destino[j]=origen[i];
                j++;
            }
        }
        //Imprimir origen
        System.out.println("Array origen");
        for (i=0; i<origen.length;i++){
            if(i==origen.length-1){
                System.out.print(origen[i]);
            }
            else{
                System.out.print(origen[i]+" , ");
            }
        }
        //Salto de línea
        System.out.println("");
        
        //Imprimir destino
        System.out.println("Array destino");
        for (i=0; i<destino.length;i++){
            if(i==destino.length-1){
                System.out.print(destino[i]);
            }
            else{
                System.out.print(destino[i]+" , ");
            }
        }
        //Salto de linea
        System.out.println("");
    }
}
