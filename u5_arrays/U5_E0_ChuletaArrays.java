package u5_arrays;

public class U5_E0_ChuletaArrays {

    public static void main(String[] args) {
        
        int[] edades; //declaración array

        edades = new int[5];//asignación de memoria

        int[] edades1= new int[5]; //declaracion + asignacion de memoria.
        
        int [] origen = {10,25,26,40,37,45,90,76,78,81,58,32};//declaracion+asignacion

        //edades.length; //largo del array: pej para bucles, hasta el final del array

        int[][] numeros = new int[4][2]; //declaracion array multidimensional;
        
        //Imprimir array en un linea quitando la ultima coma
        int [] vector = new int [15];
        for(int i=0;i<vector.length;i++) {
            if(i==vector.length -1) {
		System.out.print(vector[i]);
            }
            else{
		System.out.print(vector[i]+" , ");
            }	
        }
	System.out.println("");
    }
}
