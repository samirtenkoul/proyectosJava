package U7_E5a_Punto;

public class Triangulo {
    
    //Atributos
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    
    //Constructor vacio
    public Triangulo (){
        punto1 = new Punto(2.3,6.6);
        punto2 = new Punto(4.5,10.7);
        punto3 = new Punto(7.4,9.3);
    }
    //Constructor 3 parametros
    public Triangulo (Punto punto1,Punto punto2,Punto punto3){
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }
    //Constructor 6 parametros
    public Triangulo (double x1, double y1, double x2, double y2, double x3, double y3){
        /*
        this.punto1 = (x1,y1);
        this.punto2 = (x2,y2);
        this.punto3 = (x3,y3);
        */
        punto1 = new Punto(x1,y1);
        punto2 = new Punto (x2,y2);
        punto3 = new Punto (x3,y3);
    }
    //Getter
    public Punto getPunto (){
        return punto1;
    }
    public Punto getPunto2 (){
        return punto2;
    }
    public Punto getPunto3 (){
        return punto3;
    }
    //Metodos
    public double calcularDistanciaDesde (Punto punto){
        return punto1.calcularDistanciaDesde(punto);
    }
    public double calcularArea (){
        double base = punto1.calcularDistanciaDesde(punto2);
        double altura = punto1.calcularDistanciaDesde(punto3);
        return base*altura/2;
    }
    public double calcularPerimetro (){
        double lado1 = punto1.calcularDistanciaDesde(punto2);
        double lado2 = punto2.calcularDistanciaDesde(punto3);
        double lado3 = punto3.calcularDistanciaDesde(punto1);
        return lado1 + lado2 + lado3;
    } 
}
