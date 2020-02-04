/*
6. Hacer un programa que:
 a.Cree un array bidimensional de 10x5 y nombre “datos”
 b.Inicialice la matriz de forma que cada elemento guarde 
   el número de fila a la que pertenece
 c.Muestre el contenido del array en pantalla
*/
package u5_arrays;

public class U5_E6 {

    public static void main(String[] args) {
        //a. crear array
        int [][] datos = new int [10][5];
        int f; //filas
        int c; //columnas
        
        //b. inicializar array
        for (f = 0; f<datos.length;f++){
            for (c = 0;c<datos[f].length; c++){
                datos [f][c]= f;
            }
        }
        //c. mostrar contenido
        for (f = 0; f<datos.length;f++){
            for (c = 0; c<datos[f].length;c++){
                System.out.print(" "+datos[f][c]+" ");
            }
            System.out.println(" ");
        }
    }
}
