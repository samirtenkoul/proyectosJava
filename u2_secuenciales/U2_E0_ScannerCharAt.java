package u2_secuenciales;

//1. Importar libreria Scanner
import java.util.Scanner;

public class U2_E0_ScannerCharAt {

    
    public static void main(String[] args) {
       /*
        //2. Variables
        int numero1,numero2;
        Scanner lector= new Scanner(System.in);
        
        //3. Mensaje pidiendo los numeros
        System.out.print("Introduzca dos numeros: ");
        
        //4. Recogida de datos por teclado (igual con nextFloat();)
        numero1 = lector.nextInt();
        numero2 = lector.nextInt();

        //5. Salida por pantalla
        System.out.println("La suma de " + numero1 +" y "+numero2+ " es "+ (numero1+numero2));
        
        //prueba la salida dejando espacio entre los números o intro y verás cómo funciona
        */
        //char con scanner
        Scanner lector = new Scanner(System.in);
        char letra;
        System.out.println("Introduzca una letra");
        letra = lector.next().charAt(0);
        System.out.println(letra);



    }
    
}
