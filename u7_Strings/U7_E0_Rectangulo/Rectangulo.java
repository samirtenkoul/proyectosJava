package U7_E0_Rectangulo;

public class Rectangulo {
    
    //Atributos
    private double base;
    private double altura;
    
    //Metodos
    public double getBase (){
        return base;
    }
    public double getAltura (){
        return altura;
    }
    public void setBase (double b) {
        base = b;
    }
    public void setAltura (double b){
        altura = b;
    }
    public double area (){
        return base*altura;
    }
    
}
