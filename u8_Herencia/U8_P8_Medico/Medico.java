
package U8_P8_Medico;

public abstract class Medico {
    //Atributos
    private String nombre;
    private int edad;
    private String sexo;
    private double horas;
    private double salarioHora;
    
    //Constructor
    public Medico (String nombre, int edad, String sexo, double horas, double salarioHora){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.horas = horas;
        this.salarioHora = salarioHora;
    }
    public Medico (){
        this.nombre = "Luis";
        this.edad = 33;
        this.sexo = "M";
        this.horas = 35;
        this.salarioHora = 20;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }
    

    @Override
    public String toString() {
        return "\nnombre: " + nombre + "\nedad: " + edad + "\nsexo:" + sexo + "horas: " + horas + "\nsalarioHora: " + salarioHora;
    }
    /*Abstract sin argumentos de entrada??
    public double calcularSalario (double horas,double salarioHora){
        return salarioHora * horas;
    }
    */
    public abstract double calcularSalario();
    
    
    
}
