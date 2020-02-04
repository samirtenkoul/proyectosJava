package U8_P6_Cuenta;

public class Titular {
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    
    
    //Constructores
    public Titular (){
        nombre = "Juan";
        apellidos = "Gonzalez Rodriguez";
        edad = 25;
    }
    public Titular (String nombre,String apellidos,int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    //Gets
    public String getNombre (){
        return nombre;
    }
    public String getApellidos (){
        return apellidos;
    }
    public int getEdad (){
        return edad;
    }
    //Sets
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setApellidos (String apellidos){
        this.apellidos = apellidos;
    }
    public void setEdad (int edad){
        this.edad = edad;
    }
    //Imprimir
    //toString (poner en mensaje????? sout)
    @Override
    public String toString (){
        return nombre+" "+apellidos+" "+edad;
    }
}
