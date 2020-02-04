package E3_FBin_Personas;

import java.util.Scanner;

public class EntradaSalida {
    public static Persona alta (){
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduzca nombre, edad y poblacion de la persona:");
        String nombre = lector.nextLine();
        int edad = lector.nextInt();
        lector.nextLine();
        String poblacion = lector.nextLine();
        
        return new Persona (nombre,edad,poblacion);
    }
}
