/*
5.Hacer un programa que:
 a.Cree un array bidimensional de 5x5 y nombre “diagonal”
 b.Inicialice la matriz de forma que los componentes pertenecientes
 a la diagonal de la matriz valgan 1 y el resto 0
 c.Muestre el contenido del array en pantalla

 */
package u5_arrays;

public class U5_E5 {

    public static void main(String[] args) {
        //a. crear array bidimensional
        int [][] diagonal = new int [5][5];
        int f;
        int c;
        
        //b. inicializar array
        for (c = 0; c < diagonal.length; c++){
            for (f = 0; f < diagonal.length; f ++){
                if (c==f){
                    diagonal [f][c]=1;
                }
            }
        }
        //c. mostrar contenido
        for (c = 0; c<diagonal.length; c++){
            for (f = 0; f < diagonal.length; f ++){
                System.out.print(" "+diagonal[c][f]+" ");
            }
            System.out.println("");
        }
    }
    
}
