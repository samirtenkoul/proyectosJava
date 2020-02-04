package U7_E5b_Alumno;

public class testerAlumno {

    public static void main(String[] args) {
        
        //Crear e inicializar las tres asignaturas
        Asignatura pgr = new Asignatura (1);
        Asignatura ed = new Asignatura (2);
        Asignatura lm = new Asignatura (3);
        //Crear alumno con las tres asignaturas
        Alumno alumno1 = new Alumno(1,2,3);
        //Crear profesor
        Profesor gema = new Profesor ();
        //Poner notas e imprimirlas
        gema.ponerNotas(alumno1);
        System.out.println(gema.calcularMedia(alumno1));
        
        
    }
    
}
