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
public class ImparException extends Exception{
    public ImparException(){
        super("El nº es impar");
    }
    
    public ImparException(String mensaje){
        super(mensaje);
    }
}