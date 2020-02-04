package vuelos;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
   public static void main(String[] args){
       Scanner s= new Scanner(System.in);
       Aeropuerto a= new Aeropuerto();
       GestorFicheros g= new GestorFicheros();
       int opcion;
       boolean seguir=true;
       while(seguir){
            System.out.println("¿Qué desea hacer?\n1.Añadir vuelo\n2.Consultar vuelos segun origen y destino\n3.Actualizar un vuelo poniendole escalas"
               + "\n4.Eliminar vuelos con un origen y destino determinados\n5.Volcar informacion a fichero de texto\n6.Volcar informacion a fichero binario"
               + "\n7.cargar informacion a partir de fichero binario\n8.cargar informacion a partir de fichero de texto\n9.Consultar precio\n10.consultar por rentabilidad"
               + "\n11.Salir del programa");
       if(s.hasNextInt()){
           opcion=s.nextInt();
           if(opcion==1){
               a.añadirVuelo(); 
           }
           if(opcion==2){
              a.consultarVuelos(); 
           }
           if(opcion==3){
               a.actualizarVuelo();
           }
           if(opcion==4){
               a.eliminarVuelos();
           }
           if(opcion==5){
               g.volcarATexto(a);
           }
           if(opcion==6){
                g.VolcarABinario(a);
           }
           if(opcion==7){
               g.cargarDeBinario(a);
           }
           if(opcion==8){
               g.cargarDeTexto(a);
           }
           if(opcion==9){
               a.consultaOrdenada();
           }
           if(opcion==10){
               a.consultaPorRentabilidad();
           }
           if(opcion==11){
               seguir=false;
           }
           else{
               System.out.println("Opción introducida inválida");  
           }
       }
       }
      
       
       
       
       
      
       
       
       
       
   } 
}
