/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U11_E2;

/**
 *
 * @author carlo
 */
public class ConsonanteException extends Exception{
    public ConsonanteException(){
        super("El caracter es consonante");
    }
    
    public ConsonanteException(String mensaje){
        super(mensaje);
    }
}