package U7_E5a_Punto;

public class Circulo {
    //Atributos
    private double radio;
    private Punto centro;
    
    //Constructor vacio
    public Circulo (){
        radio = 3.0;
        centro = new Punto(4,4);
        
    }
    //Constructor 2 parametros
    public Circulo (Punto centro, double radio){
        this.centro = centro;
        this.radio = radio;
    }
    //Constructor 3 parametros
    public Circulo (double x,double y,double radio){
        centro = new Punto(x,y);
        this.radio = radio;
    }
    //Getter
    public double getRadio (){
        return radio;
    }
    public Punto getPunto (){
        return centro;
    }
    //Metodos
    public double calcularDistanciadesde (Punto punto){
       //aqui llamamos al metodo calculardistancia de punto
        return centro.calcularDistanciaDesde(punto);
        /* 
        double lado1 = centro.getX() - punto.getX();
        double lado2 = centro.getY() - punto.getY();
        double hipo = Math.sqrt(lado1*lado1 + lado2*lado2);
        return hipo;
        */
    }
    public double calcularArea (){
        return Math.PI*radio*radio;
    }
    public double calcularPerimetro (){
        return 2*Math.PI*radio;
    }
}
