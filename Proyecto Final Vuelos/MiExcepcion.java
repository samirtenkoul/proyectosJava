
package vuelos;


public class MiExcepcion extends Exception {

    public MiExcepcion() {
        super();
    }

    public MiExcepcion(String message) {
        super(message);
    }
    public static boolean comprobarFecha(String fecha){
        boolean correcto=false;
        if(fecha.length()==10){
        String[] fechaPartida=fecha.split("/");
        int dia=Integer.parseInt(fechaPartida[0]);
        int mes=Integer.parseInt(fechaPartida[1]);
        int año=Integer.parseInt(fechaPartida[2]);
        
        if(dia>0 && dia<31 && mes>0 && mes<13 && año>2017 && año<2050){
            correcto=true;
        }
        }
        return correcto;
    }
    
}
