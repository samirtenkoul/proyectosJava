package U7_E0_Calculadora;

import java.util.Arrays;

public class testerCalculadora {

    public static void main(String[] args) {
        
        Calculadora miCalculadora = new Calculadora();
        int num = 5;
        num = miCalculadora.cuadrado(num);
        int[]lista = {2,3,4};
        /*
        for (int i = 0; i<lista.length; i++){
            lista[i]=miCalculadora.cuadrado(lista[i]);
            System.out.print(" "+lista[i]+" ");
        }
        System.out.println("");
        */
        miCalculadora.cuadradoArray(lista);
        System.out.println(Arrays.toString(lista));
        //imprimir void
        miCalculadora.suma();
        
        //imprimir return
        System.out.println(miCalculadora.resta(4, 10));
    }
}
