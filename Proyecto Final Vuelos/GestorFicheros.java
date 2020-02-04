package vuelos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorFicheros {
   String rutaTexto;
   String rutaBinario;

    public GestorFicheros() {
        this.rutaTexto="vuelosTexto";
        this.rutaBinario="vuelosBinario";
    }
   public void volcarATexto(Aeropuerto a){
       File f = new File(this.rutaTexto);
       PrintWriter pw=null;
       try {
           pw = new PrintWriter(f);
       } catch (FileNotFoundException ex) {
           System.out.println("No se ha encontrado el fichero");
       }
       for (int i = 0; i < a.aeropuerto.size(); i++) {
       pw.println(a.aeropuerto.get(i).toStringFichero());
       }
       pw.close();
   }
   public void VolcarABinario(Aeropuerto a){
       File f = new File(this.rutaBinario);
       ObjectOutputStream os =null;
       try {
           os= new ObjectOutputStream(new DataOutputStream(new FileOutputStream(f)));
       } catch (IOException ex) {
           System.out.println("Error de entrada salida");
       }
       try {
           os.writeObject(a.aeropuerto);
       } catch (IOException ex) {
           System.out.println("Error de entrada salida");
       }
       try {
           os.close();
       } catch (IOException ex) {
           System.out.println("Error de e/s");
       }
   }
   public void cargarDeTexto(Aeropuerto a){
       a.aeropuerto.clear();
         File f = new File(this.rutaTexto);
         FileReader fr=null;
       try {
           fr= new FileReader(f);
       } catch (FileNotFoundException ex) {
           System.out.println("Fichero no encontrado");
       }
       BufferedReader br = new BufferedReader(fr);
       try {
           String linea=br.readLine();
           while(linea!=null){
               String[] aux=linea.split(";");
               String id=aux[1];
               String aerolinea=aux[2];
               String origen=aux[3];
               String destino=aux[4];
               String fecha=aux[5];
               int numPasajeros=Integer.parseInt(aux[6]);
               double precio=Double.parseDouble(aux[7]);
               if(aux[0].equals("I")){
                   boolean escala=Boolean.parseBoolean(aux[8]);
                   if(!escala){
                        a.aeropuerto.add(new Internacional(id,aerolinea,origen,destino,fecha,numPasajeros,precio,false)); 
                   }
                   else{
                       ArrayList<String> auxi= new ArrayList(0);
                       String[] aux2=aux[9].split(",");
                       for (int i = 0; i < aux2.length; i++) {
                          auxi.add(aux2[i]);
                       }
                         a.aeropuerto.add(new Internacional(id,aerolinea,origen,destino,fecha,numPasajeros,precio,true,auxi));
                   }
                  
               }
               else{
                   a.aeropuerto.add(new Nacional(id,aerolinea,origen,destino,fecha,numPasajeros,precio));
               }
               linea=br.readLine();
           }
       } catch (IOException ex) {
           System.out.println("Error de entrada salidarl");
       }
      
   }
   public void cargarDeBinario(Aeropuerto a){
         File f = new File(this.rutaBinario);
         ObjectInputStream oi=null;
       try {
          oi = new ObjectInputStream(new DataInputStream(new FileInputStream(f)));
       } catch (IOException ex) {
           System.out.println("Error de entrada salida");
       }
       try {
           a.aeropuerto=(ArrayList<Vuelo>) oi.readObject();
       } catch (IOException ex) {
           System.out.println("Error de entrada salida");
       } catch (ClassNotFoundException ex) {
           System.out.println("Error en el casting");
       }
   }
}
