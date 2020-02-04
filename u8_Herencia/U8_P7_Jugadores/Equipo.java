package U8_P7_Jugadores;

public class Equipo {
    
    //Atributos
    private int idEquipo;
    private String nomEquipo;
    private Jugador [] jugadores;
    
    //Constructor
    public Equipo (int idEquipo, String nomEquipo,Jugador [] jugadores){
        //
        //jugador plantilla[] = new jugador[4]
        //Equipo equipo = new Equipo (21,paco,plantilla)
        this.idEquipo = idEquipo;
        this.nomEquipo = nomEquipo;
        this.jugadores = jugadores;
    }
    public Equipo (int idEquipo, String nomEquipo){
        this.idEquipo = idEquipo;
        this.nomEquipo = nomEquipo;
    }
    //Constructor vacio
    public Equipo (){
    }
    //Constructor parametro numero jugadores (tamano)
    public Equipo (int idEquipo,String nomEquipo,int tamano){
        this.idEquipo = idEquipo; 
        this.nomEquipo = nomEquipo;
        jugadores = new Jugador[tamano];
         for (int i = 0; i < jugadores.length; i++) {
            jugadores[i]= new Jugador(i,"jugador"+i,idEquipo,i*10,i*5);
            //otra forma de rellenar el array
            //jugadores[i]=EntradaDatos.dameJugador();
         }
     }
    //Getter y setters
    public int getIdEquipo() {
        return idEquipo;
    }
    public String getNomEquipo() {
        return nomEquipo;
    }
    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
    //Metodos
    public String mostrarDatos (Liga liga){
        String datos = "Equipo " + nomEquipo + "\nidEquipo :"+idEquipo+"\nPlantilla:\n";
        for(int i = 0; i < jugadores.length; i++){
            if(jugadores[i] != null){
                //datos = datos + jugadores[i].getIdJugador()+" - "+jugadores[i].getNombre()+"\n";
                datos = datos + jugadores[i].mostrarDatosJugador(liga);
            }
        }
        return datos;
    }
    //Con StringBuilder
    public StringBuilder mostrarDatos2 (Liga liga){
        //StringBuilder datos = new StringBuilder("Equipo " + nomEquipo + "\nidEquipo :"+idEquipo+"\nPlantilla:\n");
        StringBuilder datos = new StringBuilder("Equipo");
        datos.append(nomEquipo).append("\nidEquipo :").append(idEquipo).append("\nPlantilla:\n");
        for(int i = 0; i < jugadores.length; i++){
            if(jugadores[i] != null){
                datos.append(jugadores[i].mostrarDatosJugador(liga));
            }
        }
        return datos;
    }
    
    @Override
    public String toString() {
        String datos = "Equipo " + nomEquipo + "\nidEquipo :"+idEquipo+"\nPlantilla:\n";
        for(int i = 0; i < jugadores.length; i++){
            if(jugadores[i] != null){
                //datos = datos + jugadores[i].getIdJugador()+" - "+jugadores[i].getNombre()+"\n";
                //datos = datos + jugadores[i].mostrarDatosJugador(liga);
            }
        }
        return datos;
    }
    /**
     * nos muestra los datos de un jugador a partir de su nombre
     * @param nombre es la condicion de busqueda
     */
    public void mostrarDatosJugador (String nombre){
        boolean cond = false;
        for (int i = 0; i<jugadores.length && cond == false;i++){
            if (jugadores[i].getNombre().equalsIgnoreCase(nombre)){
                System.out.println(jugadores[i].toString());
                cond = true;
            }
        }
    }
    /**
     * 
     * @return 
     */
    public String mejorDelantero (){
        int aux = 0;
        String jug ="";
        for (int i = 0; i<jugadores.length; i++){
            if (jugadores[i].getGoles() > aux){
                aux = jugadores[i].getGoles();
                jug = jugadores[i].getNombre();
            }
        }
        return "El mejor delantero de ese equipo es "+jug+" con "+aux+" goles.";
        
    }
    public void ordenarGoles (){
        Jugador jaux;
        for (boolean cambio = false; cambio== false;) {
            cambio = false;
            for (int j = 0; j < jugadores.length -1; j++) {
                if (jugadores[j].getGoles()< jugadores[j+1].getGoles()){
                   jaux = jugadores[j];
                   jugadores[j] = jugadores [j+1];
                   jugadores [j+1] = jaux;
                   cambio = true;
                }
            }
        }
        System.out.println("¡Los jugadores se han ordenado por su numero de goles!");
    }
    public void darBaja (int idJugador){
        boolean aux = false;
        for (int i = 0; i<jugadores.length && !aux;i++){
            if (jugadores[i].getIdJugador()== idJugador){
                jugadores[i]= null;
                aux = true;
                System.out.println("¡El jugador ha sido dado de baja!");

            }
        }
    }
    //Otra forma dar de baja
    public void darBaja2 (int idJugador){
            if (jugadores[idJugador].getIdJugador()==idJugador){
                jugadores[idJugador]=null;
                System.out.println("¡El jugador ha sido dado de baja!");
            
            }
        
    }
    //Es correcto solo con el id???
    public void darAlta (int idJugador){
            if (jugadores[idJugador]==null){
                //jugadores[idJugador] = new Jugador(idJugador);
                jugadores[idJugador]=EntradaDatos.dameJugador();
                System.out.println("¡El jugador ha sido dado de alta!");
            
            }
        
    }
    //Como acceder al array de otra clase????
    public void traspasar (Equipo equipo2, int idJugador){
        Jugador jaux = null;
        boolean cc = false;
        for (int i = 0; i < jugadores.length && !cc; i++) {
            if (jugadores[i].getIdJugador()== idJugador){
                for (int j = 0; j < equipo2.getJugadores().length; j++) {
                    if (equipo2.getJugadores()[j]== null){
                        jaux = jugadores[i];
                        jugadores[i] = null;
                        equipo2.getJugadores()[j] = jaux;
                        System.out.println("¡El jugador ha sido traspasado!");
                        cc = true;
                    } 
                }
                if (!cc){//cc es igual a true si le preguntamos 
                    System.out.println("¡No hay bacantes en la plantilla del equipo de destino!");
                }
            }
        }
    }
    public void traspasarGema (Equipo equipo2, int idJugador){
        Jugador jaux = null;
        boolean cc = false;
        int i;
        for (i=0; i < jugadores.length && !cc; i++) {
            if (jugadores[i].getIdJugador()== idJugador){
                  jaux = jugadores[i];
                  jugadores[i] = null;
                  cc = true;
            }
        }
        if (cc){
            boolean hueco=false;
            for (int j = 0; j < equipo2.getJugadores().length&&!hueco; j++) {
                    if (equipo2.getJugadores()[j]== null){
                        equipo2.getJugadores()[j] = jaux;
                        hueco=true;
                    }
            }
            if (!hueco){
                jugadores[i-1]=jaux;
                System.out.println("No había hueco en la plantilla");
            }
        }
        
        else
            System.out.println("No existe el jugador");
    }
    
}






