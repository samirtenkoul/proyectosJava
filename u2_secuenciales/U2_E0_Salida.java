
package u2_secuenciales;


public class U2_E0_Salida {

    
    public static void main(String[] args) {
        
        int numero = 10;
        float real = 20.5f;
        char letra ='a';
     
        //PRIMERA FORMA SYSTEM.OUT.PRINT("..."+NUM)
        System.out.print("LOS numeros son:");
        System.out.print(numero + " " + real + '\n');
     
        //SEGUNDA FORMA SYSTEM.OUT.PRINTLN("..."+NUM)
        System.out.println("Los numeros son: " + numero + " " + real);
        System.out.println("Fin programa");
        /*EN AMBOS CASOS LAS OPERACIONES HAY QUE HACERLAS ENTRE ()
        PARA DISTINGUIR EL + ARITMÉTICO DEL + CONCATENAR
        */
        System.out.println("La suma de ambos numeros da " + (numero + letra));
        
        //TERCERA FORMA System.out.printf("..%d ...%c...%f....",num,letra,real);
        System.out.printf("Los numeros son: \n %d %f y su suma %d \n",numero,real,(int)(numero+real));
        //APLICANDO UN POCO DE FORMATO
        System.out.printf("Los numeros son: %4d %.3f y su suma %.0f\n", numero, real, numero + real);
        System.out.printf("La letra %c %c tiene el valor ascii %d\n",37,letra,(int)letra);//ojo: utilizar casting
        //MÁS FORMATO
        //%f: Para valores float o double:
        System.out.printf("valor flotante: %f \n", 28.3);// Salida “valor flotante: 5,300000”
        //%x.yf: Para float o double con formato ‘x’ dígitos ‘y’ decimales:
        System.out.printf("valor pi: %010.4f \n", Math.PI);// Salida “valor pi: 3,1416” 6 dígitos, 4 decimales.
        //%x.ye: Para Notación científica: ‘x’ dígitos (incluyendo e+ o e-) ’y’ decimales
        System.out.printf ("Notacion cientifica = %7.3e \n", 123456.0);//Salida “Notacion cientifica = 1.235e+05”
        //%o: Octal
        System.out.printf("Octal: %o \n",25);// Salida “Octal: 31”
        //%h: Hexadecimal
        System.out.printf("Hexadecimal: %h \n",255);//Salida "Hexadecimal: ff"
  
    }
    
}
