package U7_E5a_Punto;

public class Punto {
    //Atributos
    private double x;
    private double y;
    
    //Constructor vacio
    public Punto (){
        x = 2.2;
        y = 0.0;
    }
    //Constructor con parametros
    public Punto (double x,double y){
        this.x = x;
        this.y = y;
    }
    //Gets
    public double getX (){
        return x;
    }
    public double getY (){
        return y;
    }
    //calcularDistancia
    public double calcularDistanciaDesde(Punto punto){
        double lado1 = x - punto.getX();
        double lado2 = y - punto.getY();
        double hipo = Math.sqrt(lado1*lado1 + lado2*lado2);
        return hipo;
    }
    
}
