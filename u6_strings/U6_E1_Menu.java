/*
1. Hacer un menú que permita al usuario conocer el uso de 10 métodos de la clase String.
El programa debe dar la opción 11 para poder salir del mismo. 
*/
package u6_strings;

import java.io.IOException;
import java.util.Scanner;

public class U6_E1_Menu {

    
    public static void main(String[] args) throws IOException {
        //Variables
        int opcion = 11;
        String frase;
        Scanner lector = new Scanner(System.in);
        
        //Entrada de datos para el array
        System.out.println("Introduzca una frase con la que crear nuestro string ejemplo para ver los diferentes métodos");
            frase = lector.nextLine();
        System.out.println("");
        //Menu
                do {
                    System.out.println(
                            "Métodos de la clase String:\n"
                            + "1  - CharAt \n"
                            + "2  - concat \n"
                            + "3  - indexOf \n"
                            + "4  - toUpperCase \n"
                            + "5  - toLowerCase \n"
                            + "6  - equals \n"
                            + "7  - equalsIgnoreCase \n"
                            + "8  - trim \n"
                            + "9  - length \n"
                            + "10 - lastIndexOf \n"
                            + "11 - Salir del programa");
                    
                    System.out.println("");
                    
                    System.out.println("Introduzca el numero del método que desea conocer u 11 para salir del programa");
                    opcion = lector.nextInt();
			if (opcion < 1 || opcion > 11) {
				System.out.println("Error, a introducido una opción no válida.");
			}
		} while (opcion < 1 || opcion > 11);
		
                //Selección de opción
                switch (opcion) {
		case 1://charAT
			int indice;
			System.out.println("La opción CharAt devuelve la posición de cierto carácter.");
			System.out.println("Para la frase (" + frase
					+ ") introduzca un índice para descubrir cual es el carácter correspondiente.");
			indice = lector.nextInt();
			System.out.println(frase.charAt(indice));
			break;
		case 2://concat
			System.out.println("La opción concat nos permite añadir más carécteres al String original");
			System.out.println("Por ejemplo vamos a añadirle 'Es particular'");
			System.out.println(frase.concat(" Es particular"));
                        break;
                
		case 3://indexOf
			indice = 0;
			System.out.println("La opción indexOf devuelve la primera ocurrencia de un carácter.");
			System.out.println("Para nuestro ejemplo de string (" + frase + ") introduzca un carácter para saber su índice.");
			indice = System.in.read();
			System.out.println(frase.indexOf(indice));
			break;
                
		case 4://toUpperCase
			System.out.println("La opción toUpperCase transforma todos los carácteres a mayúscula.");
			System.out.println("Si aplicamos toUpperCase a la frase (" + frase + ")");
			System.out.println("El resultado sería: "+(frase.toUpperCase()));
			break;
		case 5://toLowercase
			System.out.println("La opción toLowerCase transforma todos los carácteres a minúscula.");
			System.out.println("Si aplicamos toLowerCase a la frase (" + frase + ")");
			System.out.println("El resultado sería: "+(frase.toLowerCase()));
			break;
		case 6://equals
			System.out.println("La opción equals permite comparar dos Strings.");
			System.out.println("Pueden ocurrir dos casos: ");
			System.out.println(frase.equals("El patio de mi casa"));
			System.out.println(frase.equals("Hola"));
                        break;
		case 7://length
			System.out.println("La opción length nos devuelve la longitud de la cadena de caracteres.");
			System.out.println("Nuestro ejemplo de string (" + frase + ") tiene una longitud de: "+frase.length());
			break;
                case 8://trim
                    System.out.println("La opcion trim nos devuelve la cadena sin espacios en blanco ni por delante ni por detrás");
                    System.out.println("Con nuestro ejemplo el resultado seria:" + (frase.trim()));
                    break;
                case 9://length
                    System.out.println("La opcion length nos devuelve el largo del string");
                    System.out.println("en nuestro ejemplo el resultado seria:\n" + (frase.length()));
                    break;
                case 10://lastIndexOf
                    System.out.println("Devuelve la ultima ocurrencia de un string (-1 si no se encuentra)");
                    System.out.println("introduzca una combinacion de caracteres: \n");
                    indice = System.in.read();
                    System.out.println("En nuestro ejemplo seria: \n" + frase.lastIndexOf(indice));
                    break;    
                }
	}

}

