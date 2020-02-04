package E2_FBin_Agenda;


import static E2_FBin_Agenda.Gestion.entrada;
import java.io.Serializable;
import java.util.Scanner;

public class Agenda implements Serializable {
    //Atributos
    private Contacto [] agenda;
    //Constructores
    public Agenda(Contacto[] agenda) {
        this.agenda = agenda;
    }
    public Agenda() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el numero de contactos");
        agenda = new Contacto [lector.nextInt()];
        lector.nextLine();
        for (int i = 0; i < agenda.length; i++) {
            agenda[i] = entrada();
        }
    }
    public Agenda(int tamano) {
        agenda = new Contacto [tamano];
        for (int i = 0; i < agenda.length; i++) {
            agenda[i] = new Contacto(i);
        }
    }
    public Contacto[] getAgenda() {
        return agenda;
    }

    public void setAgenda(Contacto[] agenda) {
        this.agenda = agenda;
    }
    public void mostrarDatos (){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        StringBuilder datos = new StringBuilder();
        for (int i = 0; i < agenda.length; i++) {
            datos.append(agenda[i].toString());
        }
        return datos.toString();
    }
    
    
    
}
