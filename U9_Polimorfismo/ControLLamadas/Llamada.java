/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControLLamadas;

/**
 *
 * @author sandiecr
 */
public abstract class Llamada {
    protected String origen;
    protected String destino;
    protected double duracion;
    protected double tarifa;
    
    public Llamada(){
    }
    
    public Llamada(String origen, String destino, double duracion) {
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
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

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public String toString() {
        return "Llamada{" + "origen=" + origen + ", destino=" + destino + ", duracion=" + duracion + ", tarifa=" + tarifa +  '}';
    }
    public abstract double calcularPrecio();
        
    
}

