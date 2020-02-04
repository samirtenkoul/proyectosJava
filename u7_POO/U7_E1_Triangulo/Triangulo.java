package U7_E1_Triangulo;

public class Triangulo {
    //Atributos
    private double lado;
  
    //Constructor vacio (por defecto, pej 10)
    public Triangulo (){
        lado=10;
    }
    //constructor con parametros
    public Triangulo (double lado){
        this.lado=lado;
    }    
    //Métodos
    public double getLado (){
        return lado;
    }
    public void setLado (double lado) {
        this.lado = lado;
    }
    public double perimetro () {
        return lado+lado+lado;
    }
    public double area () {
        return Math.sqrt(perimetro()/2*(perimetro()/2-lado)*(perimetro()/2-lado)*(perimetro()/2-lado));
    }
    
}
