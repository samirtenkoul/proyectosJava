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
public class Local extends Llamada {

    public Local() {
    }

    public Local(String origen, String destino, double duracion) {
        super(origen, destino, duracion);
        tarifa= 0.15;
    }
    public double calcularPrecio(){
        return tarifa*duracion;
    }
    
}
