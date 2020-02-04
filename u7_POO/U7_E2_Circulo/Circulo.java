package U7_E2_Circulo;

public class Circulo {
    //Atributos
    private double radio;
    
    //Constructor vacio
    public Circulo (){
        radio = 10;
    }
    //Constructor con parametros
    public Circulo (double radio){
        this.radio = radio;
    }
    //Get y Set
    public double getRadio (){
        return radio;
    }
    public void setRadio (){
        this.radio = radio;
    }
    //toString
    @Override
    public String toString (){
        return Double.toString(radio);
    }
    
}
