
package vuelos;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Vuelo implements Serializable , Comparable<Vuelo> {
    private String id;
    private String aerolinea;
    private String origen;
    private String destino;
    private String fecha;
    private int numPasajeros;
    private double precio;

    public Vuelo(String id, String aerolinea, String origen, String destino, String fecha, int numPasajeros, double precio){
        this.id = id;
        this.aerolinea = aerolinea;
        this.origen = origen;
        this.destino = destino; 
        try{
        if (!MiExcepcion.comprobarFecha(fecha)){
            throw new MiExcepcion("fecha invalida"); 
        }
        }
        catch(MiExcepcion e){
        Scanner s = new Scanner(System.in);
        while(!MiExcepcion.comprobarFecha(fecha)){                   
        System.out.println("(dd/mm/aaaa)Introduza una fecha válida, el dia debe estar comprendido entre 1 y 30, el mes entre 1 y 12 y el año entre 2018 y 2049");
        fecha=s.next();          
        }
        }
        this.fecha=fecha;
        this.numPasajeros = numPasajeros;
        this.precio = precio;
    }

    public Vuelo() {
        int random=((int)(Math.random()*99));
        int diaRandom=((int)((Math.random()*20)+10));
        int mesRandom=((int)((Math.random()*9)+1));
        int annoRandom=((int)((Math.random()*31)+2018));
        this.id = "id"+((int)(Math.random()*99999));
        this.aerolinea = "aerolinea"+random;
        this.origen = "origen"+((int)(Math.random()*2));;
        this.destino = "destino"+((int)(Math.random()*2));; 
        this.fecha=diaRandom+"/0"+mesRandom+"/"+annoRandom;
        this.numPasajeros =random;
        this.precio =((int)(Math.random()*99999));
      

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "id=" + id + ", aerolinea=" + aerolinea + ", origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", numPasajeros=" + numPasajeros + ", precio=" + precio;
    }
    public  String toStringFichero() {
         return this.getClass().getSimpleName().charAt(0)+";"+id+";"+ aerolinea+";"+ origen+";"+ destino+";"+ fecha+";"+ numPasajeros+";"+ precio;
    }
    @Override
    public int compareTo(Vuelo v) {
        return (int)this.precio-(int)v.getPrecio();
    }

  

}


     