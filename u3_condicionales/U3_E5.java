/*
5.Hacer un programa que introduciendo un número del 1 al 7, 
diga si corresponde a lunes, martes, miércoles, ... 
Si el número no está comprendido entre 1 y 7, 
ha de mostrar un mensaje avisando que no puede decir el día.
 */
package u3_condicionales;

import java.util.Scanner;

public class U3_E5 {

    public static void main(String[] args) {
        //SCANNER
        Scanner lector = new Scanner(System.in);
        //ENTRADA DE DATOS
        System.out.println("Introduzca un numero del 1 al 7");
        int dia = lector.nextInt();
        //CIERRE SCANNER
        lector.close();
        
        switch (dia){
            case 1:
                System.out.println("El dia es lunes");
                break;
            case 2:
                System.out.println("El dia es martes");
                break;
            case 3:
                System.out.println("El dia es miercoles");
                break;
            case 4:
                System.out.println("El dia es jueves");
                break;
            case 5:
                System.out.println("El dia es viernes");
                break;
            case 6:
                System.out.println("El dia es sabado");
                break;
            case 7:
                System.out.println("El dia es domingo");
                break;
            default:
                System.out.println("El numero de dia introducido es incorrecto");
                break;
            }
        }
    }
    

