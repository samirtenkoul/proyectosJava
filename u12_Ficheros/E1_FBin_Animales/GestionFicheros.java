package E1_FBin_Animales;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionFicheros {

    public static final String f = "animales.dat";

    public static void escribirFichero(Veterinario v) {
        File fichero = new File(f);
        ObjectOutputStream os = null;
        try {
            try {
                os = new ObjectOutputStream(new FileOutputStream(fichero));
            } catch (FileNotFoundException ex) {
                System.out.println("Fichero no encontrado");
                fichero.createNewFile();
            }
            /* Con for
            for (int i = 0; i < v.getVeterinario().length; i++) {
                if (v.getVeterinario()[i] != null) {
                    os.writeObject(v.getVeterinario()[i]);
                }
            }
            */
            if (v != null){
            os.writeObject(v);
            os.close();
            }
        } catch (IOException e) {
            
            System.out.println("Error de e/s");
        }
    }

    public static void leerFichero(Veterinario v) {
        File fichero = new File(f);
        ObjectInputStream oi = null;

        try {
            try {
                oi = new ObjectInputStream(new FileInputStream(f));
            } catch (FileNotFoundException ex) {
                System.out.println("Fichero no encontrado");
                fichero.createNewFile();
            }
            /*Con for
            for (int i = 0; i < v.getVeterinario().length; i++) {
                try {
                    v.getVeterinario()[i] = (Animal) oi.readObject();
                } catch (ClassNotFoundException ex) {
                    System.out.println("Clase no encontrada");;
                }
            }
            */
            try {
                v = (Veterinario)oi.readObject();
            } catch (ClassNotFoundException ex) {
                System.out.println("Clase no encontrada");
            }

            oi.close();
        } catch (IOException io) {
            System.out.println("Error de E/S");
        }
    }
}
