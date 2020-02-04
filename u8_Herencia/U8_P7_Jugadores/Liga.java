package U8_P7_Jugadores;

public class Liga {
    //Atributos
    private Equipo[] equipos;
    
    //Constructor
    public Liga (int num_equipos,int plantilla){
        equipos = new Equipo[num_equipos];
        for (int i = 0;i<equipos.length;i++){
            equipos[i]= new Equipo(i,"equipo "+i,plantilla);
        }
    }
    //getters
    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }
    

    public Liga(Equipo[] equipos) {
        this.equipos = equipos;
    }
    
    //metodos
    public Equipo devolverEquipo (int pos){
        return equipos [pos];
    }

    //metodo
    public String getNombreEquipo (int idEquipo){
        //recorrer for y ? cual tiene el id-> nombre
        String nombre=null;
        boolean salir = false;
        for (int i = 0; i < equipos.length && !salir; i++) {
            if (equipos[i].getIdEquipo()==idEquipo){
                nombre = equipos[i].getNomEquipo();
                salir=true;
            }
        }
        return nombre;
    }
    public int getIdEquipo (int idEquipo){
        //recorrer for y ? cual tiene el id-> nombre
        int id = 0;
        boolean salir = false;
        for (int i = 0; i < equipos.length && !salir; i++) {
            if (equipos[i].getIdEquipo()==idEquipo){
                id = equipos[i].getIdEquipo();
                salir=true;
            }
        }
        return id;
    }
    /*
    public void traspasar2 (int idEquipo,int idEquipo2 ,int idJugador){
        Jugador jaux = null;
        boolean cc = false;
        for (int i = 0; i < equipos.length && !cc; i++) {//recorrer liga
            if (equipos[i].getIdEquipo()==idEquipo){//encontrar id Equipo
                for (int j = 0; j < liga.devolverEquipo(j).getJugadores().length; j++) {//recorrer jugadores Equipo 1
                    if (liga.devolverEquipo(j).getJugadores()[j].getIdJugador()== idJugador){//encontrar id jugador
                        jaux = liga.devolverEquipo(j).getJugadores()[j];//guardar jugador
                        for (int b = 0; b < liga.getEquipos().length;b++){//recorrer liga
                            if (liga.devolverEquipo(b).getIdEquipo()==idEquipo2){//encontrar equipo2
                                for(int d = 0; d < liga.devolverEquipo(d).getJugadores().length;d++){//recorrer jugadores
                                    if(liga.devolverEquipo(d).getJugadores()[d]==null){//encontrar hueco
                                        liga.devolverEquipo(d).getJugadores()[d]= jaux;//rellenar con el jugador
                                    }
                                }
                            }
                        }
                        liga.devolverEquipo(j).getJugadores()[j]= null;
                    }
                }
            }
        }
    }
    */
}
