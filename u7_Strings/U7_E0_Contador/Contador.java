/*
Una clase siempre va a tener como minimo dos cosas:
atributos:
    - private: no es visible fuera de la clase, tengo que manejarlo dentro.
    - public: lo que queremos mostrar
metodos:
    - public/private: es posible llamar al metodo desde otro codigo/solo dentro
    
*/
package U7_E0_Contador;

public class Contador {
    
    //Atributos: aqui private para no modificarlo desde el tester
    private int valor = 0;
    
    //Metodo: public para desde el tester, int devuelve un entero
    //este metodo incrementa el valor del contador en 1 cada vez que
    //lo llamemos desde el tester
    public int incrementar (){
        valor = valor + 1;
        if (valor > 100){
            valor = 0;
        }
        return valor;
    }
    
}
