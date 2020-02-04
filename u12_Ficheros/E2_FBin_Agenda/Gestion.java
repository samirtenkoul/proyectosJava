 package E2_FBin_Agenda;

import java.io.*;
import java.util.Scanner;

public class Gestion {

    //Entrada contacto
    public static Contacto entrada() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el nombre, los apellidos y el telefono:");
        String nombre = lector.nextLine();
        String apellidos = lector.nextLine();
        String telefono = lector.nextLine();

        return new Contacto(nombre, apellidos, telefono);
    }

    //Almacenar en fichero agenda.dat
    public static void escBin(Agenda o) {
        File fichero = new File("agenda.dat");
        ObjectOutputStream os = null;
        try {
            try {
                os = new ObjectOutputStream(new FileOutputStream(fichero));
            } catch (FileNotFoundException fe) {
                System.out.println("Fichero no encontrado");
                fichero.createNewFile();
            }
            if (o != null) {
                os.writeObject(o);
                os.close();
            }
        } catch (IOException io) {
            System.out.println("Error de E/S");
        }
    }
    //Almacenar en fichero agenda.dat, segunda version
    public static void escBin2(Agenda o) {
        File fichero = new File("agenda.dat");
        ObjectOutputStream os = null;
       try {
            os = new ObjectOutputStream(new FileOutputStream(fichero));
        } catch (FileNotFoundException fe) {
            System.out.println("Fichero no encontrado");
            try {
                fichero.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error 1");
            }
        } catch (IOException ex) {
            System.out.println("Error 2");
        }
        if (o != null) {
            try {
                os.writeObject(o);
               
            } catch (IOException ex) {
                System.out.println("Error 3");
            }  
            try {
                os.close();
            } catch (IOException ex) {
                System.out.println("Error 4");
            }
        }
    }

    //bin a txt
    public static void txtNom(Agenda a) {
        Scanner lector = new Scanner(System.in);
        a.mostrarDatos();
        System.out.println("Introduzca el nombre de la persona cuyos telefonos quiere consultar");
        String nombre = lector.nextLine();
        //Leer fichero
        File fichero = new File("agenda.dat");
        ObjectInputStream is = null;
        //Escribir fichero
        File consulta = new File("consulta.txt");
        PrintWriter pw = null;
        //String linea = null;
        try {
            //Flujo entrada desde el fichero
            try {
                is = new ObjectInputStream(new FileInputStream(fichero));
                pw = new PrintWriter(new FileWriter(consulta,true));
            } catch (FileNotFoundException fe) {
                System.out.println("Fichero no encontrado");
                fichero.createNewFile();
                consulta.createNewFile();
            }
            //Contactos coinciden con nombre
            
            //terminar
            try {
                Agenda aux = (Agenda) is.readObject();//Correcion gema
                for (int i = 0; i < aux.getAgenda().length; i++) {
                    
                    
                }
                for (int i = 0; i < (int) fichero.length(); i++) {
                    if (((Agenda) is.readObject()).getAgenda()[i] != null && ((Agenda) is.readObject()).getAgenda()[i].getNombre().equalsIgnoreCase(nombre)) {
                        //linea = ((Agenda) is.readObject()).getAgenda()[i].toString();
                        pw.println(((Agenda) is.readObject()).getAgenda()[i].toString());
                    }
                }
                pw.close();
                is.close();
            } catch (ClassNotFoundException ex) {
                System.out.println("Clase no encontrada");
            }
        } catch (IOException io) {
            System.out.println("Error de E/S");
        }
    }
}
