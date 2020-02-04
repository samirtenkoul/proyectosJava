package E3_FBin_Personas;

import java.io.Serializable;

public class Persona implements Serializable, Comparable<Persona> {
    //Atributos
    private String nombre;
    private int edad;
    private String poblacion;
    
    //Constructor
    public Persona (int i){
        nombre = "nombre"+i;
        edad = (int)(Math.random()*50+1);
        poblacion = "poblacion"+i;
    }
    public Persona(String nombre, int edad, String poblacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.poblacion = poblacion;
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

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return nombre + ";" +  edad + ";" +  poblacion + ';';
    }

    @Override
    public int compareTo(Persona o) {
        return this.getPoblacion().compareTo(o.poblacion);//Correccion Gema
   }
}
