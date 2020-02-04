/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U11_E2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Ejer2{
    public static void isVocal(char letra) throws VocalException, ConsonanteException{
        if((letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')){
            throw new VocalException();
        }else{
            throw new ConsonanteException();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un caracter para averiguar si es vocal o consonante: ");
        char letra=(char)System.in.read();
        
        try{
            isVocal(letra);
        }catch(VocalException | ConsonanteException ex){
            System.out.println(ex.getMessage());
        }
    }
}