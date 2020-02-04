/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControLLamadas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



/**
 *
 * @author sandiecr
 */
public class Testerllamadas {
   

    public static void main(String[] args) {
    Scanner lector= new Scanner(System.in);
    Centralita centralita1= new Centralita();
    Llamada [] llamadas = new Llamada[7];
    for (int i = 0; i < llamadas.length; i++) {
        if (i%2==0){
           llamadas[i]= new Local("1"+i,"1"+i,1+i);
           System.out.println("Llamada local: "+llamadas[i]);
           System.out.println("Precio llamada: "+llamadas[i].calcularPrecio());
           System.out.println();
         }
        else{
            System.out.println("Elige franja");
            int franja=lector.nextInt();
            llamadas[i]= new Provincial("1"+i,"1"+i,1+i,franja);
            System.out.println("Llamada provincial: "+llamadas[i]);
            System.out.println("Precio llamada: "+llamadas[i].calcularPrecio());
            System.out.println(); 
       }
    }
//    ArrayList <Integer> numeros = new ArrayList();
//        for (int i = 0; i < 100000; i++) {
//            numeros.add(i);
//        }
//        Collections.sort(numeros);
//        for (int i = 0; i < 100000; i++) {
//           if (numeros.get(i)==100){
//               
//               }
   } 
}
