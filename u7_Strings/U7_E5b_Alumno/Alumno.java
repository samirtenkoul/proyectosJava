package U7_E5b_Alumno;

public class Alumno {
    //Atributos
    private Asignatura asignatura1 ;
    private Asignatura asignatura2 ;
    private Asignatura asignatura3 ;
    
    //Constructor
    public Alumno (Asignatura asignatura1,Asignatura asignatura2,Asignatura asignatura3){
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }
    //Constructor con parametros
    public Alumno (int id1,int id2,int id3){
        asignatura1 = new Asignatura(id1);
        asignatura2 = new Asignatura (id2);
        asignatura3 = new Asignatura (id3);
    }
    //Gets
    public Asignatura getAsignatura1(){
        return asignatura1;
    }
    public Asignatura getAsignatura2(){
        return asignatura2;
    }
    public Asignatura getAsignatura3(){
        return asignatura3;
    }
}
