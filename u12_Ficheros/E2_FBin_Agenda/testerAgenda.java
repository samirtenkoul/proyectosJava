package E2_FBin_Agenda;

import static E2_FBin_Agenda.Gestion.escBin;
import static E2_FBin_Agenda.Gestion.escBin2;
import static E2_FBin_Agenda.Gestion.txtNom;

public class testerAgenda {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        //agenda.mostrarDatos();
        escBin2(agenda);
        txtNom(agenda);
    }
}
