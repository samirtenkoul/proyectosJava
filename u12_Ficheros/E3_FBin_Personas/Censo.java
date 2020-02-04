package E3_FBin_Personas;

import static E3_FBin_Personas.EntradaSalida.alta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Censo implements Serializable{
    //Atributos
    private ArrayList<Persona> personas;
    
    //El arraylist se obtendría por ejemplo del fichero leido persona a persona
    public Censo(ArrayList<Persona> personas) {
        this.personas = personas;
    }    
    //Constructor random
    public Censo (int tamano){
        personas = new ArrayList ();
        for (int j = 0; j < 5; j++) {
            personas.add(new Persona((int)(Math.random()*10+1)));
        }
    }
    //Constructor
    public Censo(){
        Scanner lector = new Scanner(System.in);
        personas = new ArrayList();
        System.out.println("Introduzca el numero de ciudadanos");
        int tamano = lector.nextInt();
        lector.nextLine();
        for (int i = 0; i < tamano; i++) {
            personas.add(alta());
        }
    }
    
    public ArrayList<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void verDatos() {
        StringBuilder datos = new StringBuilder();
        for (int i = 0; i < personas.size(); i++) {
            datos.append(personas.get(i).toString()).append("\n");
        }
        System.out.println(datos);
    }
    
    public void listarNombre (){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la persona:");
        String nombre = lector.nextLine();
        int cc = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equalsIgnoreCase(nombre)){
                System.out.println(personas.get(i).toString());
                cc++;
            }
        }
        if (cc == 0){
            System.out.println("No hay ninguna persona con ese nombre");
        }
    }
    public void listarPoblacion (){
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduzca la poblacion:");
        String poblacion = lector.nextLine();
        int cc = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getPoblacion().equalsIgnoreCase(poblacion)){
                System.out.println(personas.get(i).toString());
                cc++;
            }
        }
        if (cc == 0){
            System.out.println("No hay personas de esta poblacion");
        }
    }
    public void listarEdad (){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca la edad:");
        int edad = lector.nextInt();
        lector.nextLine();
        int cc = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getEdad() > edad){
                System.out.println(personas.get(i).toString());
                cc++;
            }
        }
        if (cc == 0){
            System.out.println("0 personas mayores de "+edad+" años");
        }
    }
    //Modificar la población de un determinado registro a partir de su nombre.
    public void modPoblacion(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el nombre:");
        String nombre = lector.nextLine();
        boolean aux = false;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equalsIgnoreCase(nombre) && !aux){
                System.out.println("Introduzca la nueva poblacion:");
                String poblacion = lector.nextLine();
                personas.get(i).setPoblacion(poblacion);
                System.out.println("Poblacion cambiada");
                aux = true;
            }
        }
        if(!aux){
            System.out.println("Ninguna persona coincide con el nombre indicado");
        }
    }
    
    //Ordenar fichero por Población (implementar interfaz comparable en clase persona)
    public void ordenarPoblacion(){
        System.out.println(toString());
        Collections.sort(personas);
        System.out.println(toString());
        //
    }
    
    @Override
    public String toString() {
        StringBuilder datos = new StringBuilder();
        for (int i = 0; i < personas.size(); i++) {
            datos.append(personas.get(i).toString()).append("\n");
        }
        return datos.toString();
    }
    
}
