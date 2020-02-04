package U7_E3_Cuadrado;

public class Cuadrado {
    //Atributos
    private double lado;
    
    //Constructor sin parametros
    public Cuadrado (){
        lado = 10;
    }
    //Constructor con parametros
    public Cuadrado (double lado){
        this.lado = lado;
    }
    //Gets y Sets
    public double getLado (){
        return lado;
    }
    public void setLado (double lado){
        this.lado = lado;
    }
    //Metodos
    public double calcularArea (){
        return lado*lado;
    }
    public double calcularPermitero (){
        return 4*lado;
    }
    public void imprimeArea (){
        System.out.println("el area resultante es : "+ calcularArea());
    }
    //devolver mensaje como String (tester = sout ó cuadrado1.devuelve...)
    public String devuelveStringArea(){
        return "El area del cuadrado es "+calcularArea();
    }
    // toString
    @Override
    public String toString (){
        return Double.toString(lado);
    }
}
