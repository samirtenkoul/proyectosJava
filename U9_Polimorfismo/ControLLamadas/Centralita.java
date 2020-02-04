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
public class Centralita {
    protected int contLlamada;
    protected double precio=0;
    public int contadorLlamadas(Llamada llamadas){
        contLlamada++;
        return contLlamada;
    }
    public double precioLlamadas(Llamada llamadas){
        precio=precio+llamadas.calcularPrecio();
        return precio;
    }
}
