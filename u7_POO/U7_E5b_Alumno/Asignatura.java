package U7_E5b_Alumno;

public class Asignatura {
    
    //Atributos
    private int id;
    private double calificacion;
    
    //Constructores
    public Asignatura (){
        int id = 1;
        double calificacion = 6.5;
    }
    public Asignatura (int id){
        this.id = id;
    }
    
    //Getters y setters
    public int getId (){
        return id;
    }
    public double getCalificacion (){
        return calificacion;
    }
    public void setCalificacion (double calificacion){
        this.calificacion = calificacion;
    }
}
