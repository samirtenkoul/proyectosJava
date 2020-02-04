package E3_FBin_Personas;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionFicheros {

    //Generar un fichero binario a partir del objeto.
    public static void objAbin(Object o) {
        File fichero = new File("censo.dat");
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
            System.out.println("Error de E/S"+io.getCause().toString()+io.getStackTrace().toString());
        }
    }
    public static void objAtxt (Object o){
        File fichero = new File ("censo.txt");
        ObjectInputStream oi = null;
        try{
            try{
                oi = new ObjectInputStream (new FileInputStream(fichero));
            }catch(FileNotFoundException fe){
            
            }
        }catch(IOException io){
        
        }
        
    }

    //Generar un fichero de texto a partir del binario.
    public static void binAtxt() {
        File fichero = new File("censo.dat");
        File copia = new File("censo.txt");
        ObjectInputStream oi = null;
        PrintWriter pw = null;
        try {
            try {
                oi = new ObjectInputStream(new FileInputStream(fichero));
                pw = new PrintWriter(new FileWriter(copia));
            } catch (FileNotFoundException fe) {
                System.out.println("Fichero no encontrado");
                fichero.createNewFile();
                copia.createNewFile();
            }
            if (oi != null) {
                try {
                    pw.println(((Censo)oi.readObject()).toString());//Correccion gema
                } catch (ClassNotFoundException ex) {
                    System.out.println("Error de clase no encontrada");
                    Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
                }
                /*
                Duda: como seria con un for:
                for (int i = 0; i < fichero.length(); i++) {
                    try {
                        pw.println(((Persona)oi.readObject()).toString());
                    } catch (ClassNotFoundException ex) {
                        System.out.println("clase no encontrada");
                    }
                }
                */
                pw.close();
            }
        } catch (IOException io) {
            System.out.println("Error de E/S");
        }
    }
                
    //Generar un fichero binario a partir del de texto.
    public static void txtAbin(){
        
    }
    //obligatorio un escribirBinario espejo, for i recorriendo al arraylist un wirteObject por elemento
    public static ArrayList<Persona> leerBinario() throws IOException{
    ArrayList<Persona> aux= new ArrayList();
    File fichero = new File("censo.dat");
    File copia = new File("censo.txt");
    ObjectInputStream oi = null;
    
    try {
                oi = new ObjectInputStream(new FileInputStream(fichero));
               
            } catch (FileNotFoundException fe) {
                System.out.println("Fichero no encontrado");
                fichero.createNewFile();
                copia.createNewFile();
            }
    /* Version 1 solucion Gema ficheros binario posicion a posicion utilizando la excepcion end of file
    try{
        while(true){
            try {
                aux.add((Persona)oi.readObject());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } catch (EOFException e){
      //  System.out.println("Se ha alcanzado el final de fichero");
    }
    */
    //Version 2 solucion Gema ficheros binario posicion a posicion utilizando la excepcion end of file
    boolean fin =false;
    while(!fin){
         try {
            aux.add((Persona)oi.readObject());
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(GestionFicheros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (EOFException e){
            System.out.println("Se ha alcanzado el final de fichero");
            fin=true;
        }
      
    }
       
    
    return aux;
    }
}

