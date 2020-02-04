/*
StringBuffer es una secuencia de caracteres mutable; es decir, es una clase que nos permite 
concatenar String de una manera simple y muy eficiente.
 */
package u6_strings;

public class U6_E0_StringBuffer {

    public static void main(String[] args) {
        //Crear un stringBuffer:
        //a. Constructor vacio "" con una capacidad inical de 16 caracteres.
        StringBuffer a = new StringBuffer();
        //b. constructor con parametros
        StringBuffer b = new StringBuffer ("Hola");
        //c. constructor con parametro de tipo int (capacidad inicial de 3)
        StringBuffer c = new StringBuffer(3); 
    }
}
