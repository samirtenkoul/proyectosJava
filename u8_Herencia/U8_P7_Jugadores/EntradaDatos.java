package U8_P7_Jugadores;

import java.util.Scanner;

public class EntradaDatos {
    /**
     * dameJugador de Gemma
     * @return 
     */
    /* 
   public static Jugador dameJugador(){
      Scanner lector = new Scanner(System.in);
      System.out.println("Introduce idJugador, idEquipo y el nombre");
      int idJugador=lector.nextInt();
      int idEquipo= lector.nextInt();
      lector.nextLine();//lee el enter introducido
      String nombre = lector.nextLine();
      
      return new Jugador (idJugador,nombre,idEquipo,0,0);
      //return new Jugador (lector.nextInt(),lector.nextLine(),lector.nextInt(),lector.nextInt(),lector.nextInt());
  }
    */
    /**
     * He modificado dameJugador eliminando el parametro idJugador ya que
     * desde el tester ya solicitabamos el idJugador por lo que se repetia
     * @return dameJugador
     */
    public static Jugador dameJugador(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce idEquipo y el nombre");
        int idEquipo= lector.nextInt();
        lector.nextLine();//lee el enter introducido
        String nombre = lector.nextLine();
      
        return new Jugador (nombre,idEquipo,0,0);
        //return new Jugador (lector.nextInt(),lector.nextLine(),lector.nextInt(),lector.nextInt(),lector.nextInt());
  }
}
