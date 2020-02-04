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
public class VocalException extends Exception{
    public VocalException(){
        super("El caracter es vocal");
    }
    
    public VocalException(String mensaje){
        super(mensaje);
    }
}