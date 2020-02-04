/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package U11_E0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E0_Ej2 {

    public static void main(String[] args) {
        System.out.println("introduce número");
        Scanner lector = new Scanner(System.in);
        boolean aux= false;
        try{
            int num = lector.nextInt();
            int lista[]=null ;
            for(int i=0;i<=lista.length;i++)
                System.out.println(lista[i]);
        }catch (RuntimeException e2){
            System.out.println("Ha ocurrido un error en tiempo de ejecución "+ e2.getCause()+" "+e2.getClass().getSimpleName());
        }catch (InputMismatchException e1){
            aux = true;
            System.out.println("Tienes que introducir un número");
        }
        if (!aux)
            System.out.println("Muy bien campeón, has introducido el número muy bien");
        /*int lista[] = new int[20];
        for(int i=0;i<=lista.length;i++)
            try{
            System.out.println(lista[i]);
            }catch(Exception e){
                System.out.println("---"+lista[i-1]);
            }
        */
        }
}