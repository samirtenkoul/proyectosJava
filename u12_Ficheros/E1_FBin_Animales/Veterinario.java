package E1_FBin_Animales;

import java.io.Serializable;

public class Veterinario implements Serializable {
    //Atributo
    private Animal [] veterinario;
    
    public Veterinario (){
        veterinario = new Animal[(int)(Math.random()*5+1)];
        for (int i = 0; i <veterinario.length; i++) {
            veterinario[i] = new Animal(i);
        }
    }
    public Veterinario(Animal[] veterinario) {
        this.veterinario = veterinario;
    }

    public Animal[] getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Animal[] veterinario) {
        this.veterinario = veterinario;
    }
    
    
    
}
