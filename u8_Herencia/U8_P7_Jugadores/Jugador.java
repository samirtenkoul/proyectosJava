package U8_P7_Jugadores;

public class Jugador {
    
    //Atributos
    //private static int contador;
    private int idJugador;
    private String nombre;
    private int idEquipo;
    private int partJugados;
    private int goles;
    
    //Constructor parametros
    public Jugador (int idJugador, String nombre, int idEquipo,int partJugados,int goles){
        //this();//llamada al constructor desde el idJugador
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.idEquipo = idEquipo;
        this.partJugados = partJugados;
        this.goles = goles;
    }
    public Jugador (String nombre, int idEquipo,int partJugados,int goles){
        this.nombre = nombre;
        this.idEquipo = idEquipo;
        this.partJugados = partJugados;
        this.goles = goles;
    }
    //Constructor id
    public Jugador (int idJugador){
        this.idJugador = idJugador;
    }
    
    public Jugador (){
        this.nombre = "prueba";
    }
    
    public int getIdJugador() {
        return idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public int getPartJugados() {
        return partJugados;
    }

    public int getGoles() {
        return goles;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public void setPartJugados(int partJugados) {
        this.partJugados = partJugados;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    //Metodos
    public double promedioGoles (){
        double res = (double)goles / partJugados ;
        return res;
    }

    public String mostrarDatosJugador(Liga liga){
        return toString()+"\n\tNombre equipo :".concat(liga.getNombreEquipo(idEquipo)+"\n");
    }
    /**
     * toString no puede recibir parametros al ser de object
     * @return 
     */
    @Override
    public String toString() {
        return "\n\tJugador: " + nombre + "\n\tidJugador: " + idJugador + "\n\tidEquipo: " + idEquipo + "\n\tpartJugados: " + partJugados + "\n\tgoles: " + goles + "\n\tidEquipo: " + getIdEquipo();
    }
    
    
    
}
