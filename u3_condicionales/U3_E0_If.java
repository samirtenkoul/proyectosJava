/*
Imprimir por pantalla que día de la semana es
según el valor de una variable predefinida
*/
package u3_condicionales;

import java.util.Scanner;

public class U3_E0_If {

    
    public static void main(String[] args) {
        //ENTRADA DE DATOS
        String resultado = "lunes";
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el numero del dia de la semana");
        int dia = lector.nextInt();
        
        //SECUENCIAL IF ELSE
        if (dia == 1)
            resultado = "lunes";
        if (dia == 2)
            resultado = "martes";
        if (dia == 3)
            resultado = "miercoles";
        if (dia == 4)
            resultado = "jueves";
        if (dia == 5)
            resultado = "viernes";
        if (dia == 6)
            resultado = "sabado";
        if (dia == 7)
            resultado = "domingo";
        
        System.out.println("El dia es "+resultado);
    }
}
