package U11_E0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E0_ExRuntime {

    public static void main(String[] args) {
        System.out.println("introduce número");
        Scanner lector = new Scanner(System.in);
        boolean isNotNumber;
        do{
            try{
                isNotNumber = false;
                int num = lector.nextInt();
            }
            catch(InputMismatchException e){
                isNotNumber=true;
                System.out.println("introduce un número, no un carácter");
                lector.nextLine();
            }
        }while(isNotNumber);
        /*int lista[] = new int[20];
        for(int i=0;i<=lista.length;i++)
            try{
            System.out.println(lista[i]);
            }catch(Exception e){
                System.out.println("---"+lista[i-1]);
            }
        }*/
    }
}

    