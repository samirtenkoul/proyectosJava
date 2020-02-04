package E1_FBin_Animales;

import java.io.Serializable;

public class Animal implements Serializable{
    //Atributos
    private String raza;
    private String nomDu;
    private int edad;
    private String nomAn;

    public Animal(String raza, String nomDu, int edad, String nomAn) {
        this.raza = raza;
        this.nomDu = nomDu;
        this.edad = edad;
        this.nomAn = nomAn;
    }
    public Animal() {
        raza = "perro";
        nomDu = "Belen";
        edad = 3;
        nomAn = "Otto";
    }
    public Animal(int i) {
        raza = "perro"+i;
        nomDu = "Dueno"+i;
        edad = (int)(Math.random()*10+1);
        nomAn = "Animal"+i;
    }

    public String getRaza() {
        return raza;
    }

    public String getNomDu() {
        return nomDu;
    }

    public int getEdad() {
        return edad;
    }

    public String getNomAn() {
        return nomAn;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNomDu(String nomDu) {
        this.nomDu = nomDu;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNomAn(String nomAn) {
        this.nomAn = nomAn;
    }
    
    @Override
    public String toString() {
        return raza + ";" + nomDu + ";" + edad + ";" + nomAn + ';';
    }
    
    
}
