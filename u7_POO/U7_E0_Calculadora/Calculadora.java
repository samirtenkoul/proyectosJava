package U7_E0_Calculadora;
import java.util.Scanner;
public class Calculadora {
    //Metodos
    public int cuadrado (int num){
        return num*num;
    }
    
    public void cuadradoArray (int[] numeros){
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = cuadrado (numeros[i]);
        }
    }
    
    public void suma (){
        Scanner lector = new Scanner (System.in);
        System.out.println("Introduce dos numeros");
        System.out.println(lector.nextInt()+ lector.nextInt());
    }
    public int resta (int numero1, int numero2){
        int resultado;
        if (numero1>numero2){
            resultado = numero1 - numero2;
        }
        else {
            resultado = numero2 - numero1;
        }
        return resultado;
    }
    public int division (int numero1, int numero2){
        return numero1/numero2;
    }
}
