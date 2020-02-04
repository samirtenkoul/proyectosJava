/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U11_E1;

/**
 *
 * @author carlo
 */
public class ParException extends Exception{
    public ParException(){
        super("El nº es par");
    }
    
    public ParException(String mensaje){
        super(mensaje);
    }
}