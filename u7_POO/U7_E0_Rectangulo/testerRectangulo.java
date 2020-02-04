package U7_E0_Rectangulo;

public class testerRectangulo {

    public static void main(String[] args) {
        
        //instanciar objeto
        Rectangulo r = new Rectangulo ();
        
        //asignamos valores con el set
        r.setAltura(45);
        r.setBase(10);
        
        //con esos valores ya podemos calcular el area
        System.out.println("El area de de este trinagulo es "+r.area());
    }
    
}
