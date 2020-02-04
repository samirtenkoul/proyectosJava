package E1_FBin_Animales;

import static E1_FBin_Animales.GestionFicheros.escribirFichero;
import static E1_FBin_Animales.GestionFicheros.leerFichero;

public class TesterAnimales {

    public static void main(String[] args) {
        
        Veterinario vet = new Veterinario();
        
        escribirFichero(vet);
        
        leerFichero(vet);
        
    }
    
}
