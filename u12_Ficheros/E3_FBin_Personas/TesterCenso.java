package E3_FBin_Personas;

import static E3_FBin_Personas.GestionFicheros.binAtxt;
import static E3_FBin_Personas.GestionFicheros.objAbin;

public class TesterCenso {

    public static void main(String[] args) {
        Censo censo = new Censo ();
        objAbin(censo);
        binAtxt();
        censo.ordenarPoblacion();
    }
}
