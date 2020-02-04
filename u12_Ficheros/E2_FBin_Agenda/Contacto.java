package E2_FBin_Agenda;

import java.io.Serializable;

public class Contacto implements Serializable {
    //Atributos
    private String nombre;
    private String apellidos;
    private String telefono;
    //Constructores
    public Contacto(String nombre, String apellidos, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }
    public Contacto() {
        nombre = "nombre";
        apellidos = "apellidos";
        telefono = "666222333";
    }
    public Contacto(int i) {
        nombre = "nombre"+i;
        apellidos = "apellidos"+i;
        telefono = "666222333"+i;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //toString
    @Override
    public String toString() {
        return nombre + ";" + apellidos + ";" + telefono + ';';
    }
    
    
}
