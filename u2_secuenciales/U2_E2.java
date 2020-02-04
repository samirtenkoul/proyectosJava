/*
2. Hacer un programa que pida el precio y la cantidad de
un producto y calcule el total. Utilizar variables enteras.
 */
package u2_secuenciales;

//1. importar scanner
import java.util.Scanner;

public class U2_E2 {

    
    public static void main(String[] args) {
        
        //2. Variables
        Scanner lector = new Scanner (System.in);
        int precio;
        int cantidad;
        int total;
        
        //3. recoger datos teclado
        System.out.println("Introduzca el precio del producto");
        precio = lector.nextInt();
        
        System.out.println("Introduzca la cantidad del producto");
        cantidad = lector.nextInt();
        
        lector.close();
        
        //4. Algoritmo
        total = precio * cantidad;
        System.out.println("El importe total es " +total+" €");
        
    }
    
}
