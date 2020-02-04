/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControLLamadas;

import java.util.ArrayList;

/**
 *
 * @author sandiecr
 */
public class Centralita1 { 
    protected ArrayList<Llamada> llamadas;
    
    protected int contadorll;
    protected double total=0;
    
    public Centralita1(ArrayList<Llamada> llamadas, int contadorll) {
        this.llamadas = llamadas;
        this.contadorll = contadorll;
    }
   
    public Centralita1(int contadorll) {
        this.llamadas = new ArrayList();
        this.contadorll = contadorll;
    }
    public int numeroLlamadas(Llamada llamada){
        llamadas.add(llamada);
        contadorll++;
        return contadorll;
    }
    public double tarifaLlamadas(Llamada llamadas){
        total=total+llamadas.calcularPrecio();
        return total;
    }
    public void mostrarDatos(){
        for (int i = 0; i < llamadas.size(); i++) {
            System.out.println(llamadas.get(i));
        }
        
    }
    
}
