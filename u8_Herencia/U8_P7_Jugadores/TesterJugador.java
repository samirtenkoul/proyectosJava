package U8_P7_Jugadores;

import java.util.Scanner;

public class TesterJugador {
    
    
    
    public static void main(String[] args) {
        //Variables
        Scanner lector = new Scanner(System.in);
        int opcion;
        int pla;
        int equ;
        boolean salir = false;
        
        System.out.println("Bienvenido a la Liga Fantasy\n"
                + "Para empezar debes crearte una liga con el numero de equipos que deseas\n"
                + "y el numero de jugadores que cada equipo quieres que tenga\n");
        
        do{
            System.out.println("Introduzca el numero de equipos que desea en la liga");
            equ = lector.nextInt();
                if (equ < 1 ){
                System.out.println("Error, a introducido una opción no válida,\n"
                    + "el minimo de equipos es 1");
            }
        }while (equ < 1);
        do{
            System.out.println("Introduzca el numeros de jugadores que desea en los equipos");
            pla = lector.nextInt();
                if (pla < 11 ){
                    System.out.println("Error, a introducido una opción no válida\n"
                    + "el minimo de jugadores es 11");
                }
        }while (pla < 11);
        Liga liga = new Liga (equ,pla);
        do{
        
        do {
            System.out.println("");
            System.out.println(
            "Métodos de la clase Equipo:\n"
            + "1  - mostrarDatosEquipo \n"
            + "2  - mostrarDatosJugador \n"
            + "3  - mejorDelantero \n"
            + "4  - ordenarGoles \n"
            + "5  - darBaja \n"
            + "6  - darAlta \n"
            + "7  - traspasar \n"
            + "8  - promedio de goles por partido \n"
            + "9  - datos del jugador \n"
            + "10 - Salir del programa");
                    
            System.out.println("");
                    
            System.out.println("Introduzca el numero del método que desea conocer o 10 para salir del programa");
            opcion = lector.nextInt();
                if (opcion < 1 || opcion > 11) {
		System.out.println("Error, a introducido una opción no válida.");
		}
	} while (opcion < 1 || opcion > 11);
		
        //Selección de opción
        int aux=0;
        switch (opcion) {
	case 1://mostrarDatosEquipo
            System.out.println("Introduzca el id del equipo del que desea"
                    + " conocer sus datos"
                    + "(el id de cada equipo corresponde con su posicion"
                    + "\nal crear la liga, por lo que el id del primer equipo"
                    + " sera 0 y asi sucesivamente)");
            System.out.println(liga.devolverEquipo(lector.nextInt()).mostrarDatos2(liga));
            break;
	case 2://mostrarDatosJugador
            System.out.println("Introduzca el id del equipo al que pertenece el jugador"
                    + "(el id de cada equipo corresponde con su posicion"
                    + "\nal crear la liga, por lo que el id del primer equipo"
                    + " sera 0 y asi sucesivamente)");
            aux= lector.nextInt();
            System.out.println("Introduzca el nombre del jugador"
                    + " del que quiere conocer sus datos:");
            liga.devolverEquipo(aux).mostrarDatosJugador(lector.next());        
            break;
        case 3://mejorDelantero
            System.out.println("Introduce el id del equipo del cual"
                    + " deseas conocer su mejor delantero:"
                    + "(el id de cada equipo corresponde con su posicion"
                    + "\nal crear la liga, por lo que el id del primer equipo"
                    + " sera 0 y asi sucesivamente)");
            System.out.println(liga.devolverEquipo(lector.nextInt()).mejorDelantero());        
            break;
        case 4://ordenarGoles
            System.out.println("Introduzca el id del equipo del que"
                    + " desea ordenar los jugadores por su numero de goles:"
                    + "(el id de cada equipo corresponde con su posicion"
                    + "\nal crear la liga, por lo que el id del primer equipo"
                    + " sera 0 y asi sucesivamente)");
            liga.devolverEquipo(lector.nextInt()).ordenarGoles();
            break;
	case 5://darBaja
            System.out.println("Introduzca el id del equipo al que pertenece el jugador"
                    + "(el id de cada equipo corresponde con su posicion"
                    + "\nal crear la liga, por lo que el id del primer equipo"
                    + " sera 0 y asi sucesivamente)");
            aux = lector.nextInt();
            System.out.println("Introduzca el id del jugador que desea dar de baja");
            liga.devolverEquipo(aux).darBaja(lector.nextInt());
            break;
	case 6://darAlta
            System.out.println("Introduzca el id del equipo en el"
                    + " que va a dar de alta al jugador"
                    + "(el id de cada equipo corresponde con su posicion"
                    + "\nal crear la liga, por lo que el id del primer equipo"
                    + " sera 0 y asi sucesivamente)");
            int c = lector.nextInt();
            System.out.println("Introduzca el id del jugador que desea dar de alta");
            liga.devolverEquipo(c).darAlta(lector.nextInt());
            break;
        case 7://traspasar
            System.out.println("Introduzca el id del equipo que traspasa el jugador"
                    + "(el id de cada equipo corresponde con su posicion"
                    + "\nal crear la liga, por lo que el id del primer equipo"
                    + " sera 0 y asi sucesivamente)");
            int d = lector.nextInt();
            System.out.println("Introduzca el id del jugador a traspasar");
            int e = lector.nextInt();
            System.out.println("Introduzca el id del equipo de destino");
            liga.devolverEquipo(d).traspasar(liga.devolverEquipo(lector.nextInt()), e);
            break;
        case 8://promedio de goles por partido
            System.out.println("Introduzca el id del jugador"
                    + " del que desea conocer su promedio de goles");
            int f = lector.nextInt();
            System.out.println("Introduzca el id del equipo al que pertenece"
                    + "(el id de cada equipo corresponde con su posicion"
                    + "\nal crear la liga, por lo que el id del primer equipo"
                    + " sera 0 y asi sucesivamente)");
            System.out.println("Promedio de goles :"+liga.devolverEquipo(lector.nextInt()).getJugadores()[f].promedioGoles());
            break;
        case 9://datos del jugador
            System.out.println("introduzca el id del jugador cuyos datos desea conocer");
            int g = lector.nextInt();
            System.out.println("introduzca el id d el equipo al que pertenece");
            System.out.println(liga.getEquipos()[lector.nextInt()].getJugadores()[g].mostrarDatosJugador(liga));
            break;
        case 10://Salir del programa
            salir = true;
            System.out.println("Hasta pronto!");
            break;
        }
        }while (!salir);
    }      
}
    

