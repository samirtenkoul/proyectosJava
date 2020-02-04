/*
4.Hacer un programa que:
a.Cree un array bidimensional de 10x10
b.Inicialice la matriz de forma que las filas pares se rellenen a uno 
y las impares a cero
c.Una vez inicializada la matriz, muestre su contenido en pantalla
*/
package u5_arrays;

public class U5_E4 {

    public static void main(String[] args) {
        //a. crear el array matriz
        int [][] matriz = new int [10][10];
        int i;
        int j;
        //b. inicializar array
        for (i = 0;i<matriz.length;i++){
            for (j = 0;j<matriz.length;j++){
                if (i%2==0){
                    matriz[i][j]=1;
                }
                /*else {
                    matriz[i][j]=0;
                }
                */
            }
	}
        //c. mostrar contenido
        for (i = 0;i<matriz.length;i++){
            for (j = 0;j<matriz.length;j++){
                //" "+" " para espaciar numeros entre si
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
