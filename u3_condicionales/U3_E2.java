/*
2. Hacer un programa que pida el:
- nombre
- precio
- la cantidad de un producto
El programa ha de pedir el % de descuento, siempre y que el total
sea mayor que 10.000 o el nombre del producto sea ‘A’.
- Calcular el total.
 */
package u3_condicionales;

import java.io.IOException;
import java.util.Scanner;

public class U3_E2 {

    public static void main(String[] args) throws IOException {
        //ENTRADA DE DATOS
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca la primera inicial del nombre del producto");
        char nombre = (char)System.in.read();//casting para leer caracter
        System.out.println("Introduzca el precio");
        double precio = lector.nextDouble();
        System.out.println("introduzca la cantidad");
        double cantidad = lector.nextDouble();
        double total = precio * cantidad;
        //CONDICION
        if (total > 10.000 || nombre=='A'){
            System.out.println("Introduzca el descuento");
            double descuento = lector.nextDouble();
            total = total * (1 - (descuento*0.01));
        }
        lector.close();
        //SALIDA POR PANTALLA
        System.out.println("El precio final es "+total+"€");
        
    }
}
