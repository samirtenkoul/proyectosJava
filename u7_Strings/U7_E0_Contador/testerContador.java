package U7_E0_Contador;

public class testerContador {

    public static void main(String[] args) {
        
        //instanciamos objeto contador
        Contador c = new Contador ();
        
        /*incrementar devuelve un int por tanto tenermos que declararnos
        una variable (x) que recoga ese valor.
        objeto.(metodos de nuestra clase)
        */
        /*
        int x = c.incrementar();
        
        //metod incrementar incrementa en uno, tanta llamadas tantos mas 1
        x = c.incrementar();
        x = c.incrementar();
        x = c.incrementar();
        
        //imprimimos
        System.out.println("El valor del contador es "+x);
        
        //pero tiene fijado que si llega a 100 se ponga otra vez a 0
        for (int i = 0; i<120;i++){
            x = c.incrementar();
            System.out.println("El valor de contador es "+x);
        }
        
        //instanciamos otro objeto
        Contador cc = new Contador ();
        */
        for (int i = 0; i<100;i++){
            System.out.println("El valor del contador es "+c.incrementar());
        }
        System.out.println(c.valor());
        
        for (int i = 0; i<100;i++){
        System.out.println("el valor del contador es "+c.decrementar());
        }
        
    }
}
