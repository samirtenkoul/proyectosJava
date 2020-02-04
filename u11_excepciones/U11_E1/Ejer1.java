/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U11_E1;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Ejer1{
    public static void isPar(int num) throws ParException, ImparException{
        if(num % 2 == 0){
            throw new ParException();
        }else{
            throw new ImparException();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un nº para averiguar si es par o impar: ");
        int num=sc.nextInt();
        
        try{
            isPar(num);
        }catch(ParException | ImparException ex){
            System.out.println(ex.getMessage());
        }
    }
}