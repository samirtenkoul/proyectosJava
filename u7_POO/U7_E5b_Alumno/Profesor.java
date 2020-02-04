package U7_E5b_Alumno;

public class Profesor {
    
    public void ponerNotas (Alumno alumno){
        alumno.getAsignatura1().setCalificacion(Math.random()*10);
        alumno.getAsignatura2().setCalificacion(Math.random()*10);
        alumno.getAsignatura3().setCalificacion(Math.random()*10);
    }
    
    public double calcularMedia (Alumno alumno){
        return (alumno.getAsignatura1().getCalificacion()+alumno.getAsignatura2().getCalificacion()+alumno.getAsignatura3().getCalificacion())/3;
        /*otra manera de hacerlo
        double nota1 = alumno.getAsignatura1().getCalificacion()
        double nota2 = alumno.getAsignatura2().getCalificacion()
        double nota3 = alumno.getAsignatura3().getCalificacion()
        return (nota1 + nota2 + nota3)/3
        */
    }
}
