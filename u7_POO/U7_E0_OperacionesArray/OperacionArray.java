package U7_E0_OperacionesArray;

import java.util.Arrays;

public class OperacionArray {

    //Atributos
    private int array[] = new int[10];
   

    //Constructor
    //Getters y Setters
    //Metodos:
    //a. cargar array
    public void cargarArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    //b. listar array
    public void listarContenido() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]+" ");
        }
        System.out.println("");
    }

    //c. ordenar array
    public void ordenarArray() {
        Arrays.sort(array);
    }

    //d. calcular media
    public double calcularMedia() {
        int a = 0;
        double media;
        for (int i = 0; i < array.length; i++) {
            a += array[i];
        }
        media = a / array.length;
        return media;
    }

    //e. copia array invertido
    public void arrayCopia() {
        int arrayCopia[] = new int[10];
        for (int j = arrayCopia.length - 1, i = 0; j >= 0; j--) {
            arrayCopia[j] = array[i];
            i++;
        }
        for (int i = 0; i<arrayCopia.length;i++){
            System.out.printf("%4d",arrayCopia[i]);
        }
    }
}
