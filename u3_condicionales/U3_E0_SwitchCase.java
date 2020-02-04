/*
Definir dos variables enteras a y b, y según el valor que tome otra
variable entre [1,4], se hagan distintas operaciones con a y b, 
siendo:
1. Sumar.
2. Restar.
3. Multiplicar.
4. Dividir.
Por último, imprimir por pantalla los valores de a y b,
la opción elegida y el resultado obtenido.
 */
package u3_condicionales;

import java.util.Scanner;

public class U3_E0_SwitchCase {

    public static void main(String[] args) {
        //VARIABLES
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        double num1 = lector.nextDouble ();
        System.out.println("Introduzca el segundo numero");
        double num2 = lector.nextDouble();
        //MENU
        System.out.println(
                "Selecione el numero de operacion que desea:\n"
                + "1. Sumar.\n"
                + "2. Restar.\n"
                + "3. Multiplicar.\n"
                + "4. Dividir.\n"
                );
        int op = lector.nextInt();
        
        //SALTO DE LINEA
        System.out.println("");
        
        //MOSTRAR POR PANTALLA ELECCIONES 
        System.out.println(
                "El primer numero introducido es el "+num1+"\n"
                + "El segundo numero introducido es el "+num2+"\n\n"
                + "La operacion elegida es la "+op+" y da como resultado :");
        //SWITCH CASE
        switch (op){
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("El numero de operacion introducido es incorrecto");
                break;
        }
    }
    
}
