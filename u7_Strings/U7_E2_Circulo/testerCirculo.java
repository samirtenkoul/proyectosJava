package U7_E2_Circulo;

public class testerCirculo {

    public static void main(String[] args) {
        //instanciar objeto sin parametros
        Circulo circulo1 = new Circulo();
        
        //instanciar objeto con parametros
        Circulo circulo2 = new Circulo(20);
        
        //imprimir objeto
        System.out.println(circulo1);
        System.out.println(circulo2.toString());
    }
}
