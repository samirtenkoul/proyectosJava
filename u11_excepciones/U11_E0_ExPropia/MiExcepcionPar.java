/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U11_E0_ExPropia;

/**
 *
 * @author Samir Tenkoul
 */
public class MiExcepcionPar extends Exception{
    MiExcepcionPar(){
        super();
    }
    MiExcepcionPar(String mensaje){
        super(mensaje);
    }
    
    public static void isPar (int numero) throws MiExcepcionPar{
        
        if (numero%2==0)
            throw new MiExcepcionPar("El numero"+numero+"es par");
    }
}


