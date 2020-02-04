/*
23.En un juego de preguntas a las que se responde “Si” o “No”
gana quien responda correctamente las tres preguntas.
Si se responde mal a cualquiera de ellas ya no se pregunta la siguiente 
y termina el juego. Las preguntas podrían ser:
1. Colon descubrió América?
2. La guerra de la independencia fue en el año 1808?
3. The Doors fue un grupo de rock Americano?
*/
package u3_condicionales;

import java.io.IOException;

public class U3_E23 {

    public static void main(String[] args) throws IOException {
        
        System.out.println("Responda correctamente las tres preguntas con S para Si o N para No.");
        System.out.println("Si responde mal a cualquiera de ellas ya no se preguntará la siguiente y terminará el juego");
        System.out.println("¿Colón descubrió América?");
        char respuesta = (char)System.in.read();
        if (respuesta == 'S'){
            System.out.println("¡Correcto!");
            System.out.println("¿La guerra de la independencia fue en el año 1808??");
            char respuesta2 = (char)System.in.read();
                if (respuesta2 == 'S'){
                    System.out.println("¡Correcto!");
                    System.out.println("¿The Doors fue un grupo de rock Americano???");
                    char respuesta3 = (char)System.in.read();
                    if (respuesta == 'S'){
                        System.out.println("¡Correcto!");
                    }
                    else {
                    System.out.println("¡Incorrecto!");
                    }
                }
                else {
                    System.out.println("¡Incorrecto!");
                }
            }
            else {
            System.out.println("¡Incorrecto!");
        }   
    }
}
