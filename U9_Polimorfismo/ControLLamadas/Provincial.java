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
public class Provincial extends Llamada{
    
    private int franja;
    
    public Provincial(String origen, String destino, double duracion, int franja) {
        super(origen, destino, duracion);
        this.franja=franja;
        switch(franja){
            case 1: tarifa=0.20;
                break;
            case 2: tarifa=0.25;
                break;
            case 3: tarifa=0.30;
                break;
      
        }
    }
    /**
     * En realidad no haría falta que fuera abstracto y lo podría implementar el padre
     * @return 
     */
    @Override
    public double calcularPrecio(){
          return tarifa*duracion;
    }

    public int getFranja() {
        return franja;
    }
    /**
     * 
     * @param franja 
     */
    public void setFranja(int franja) {
        this.franja = franja;
    }

    @Override
    public String toString() {
        return super.toString()+", franja="+ franja;
    }
    
}
