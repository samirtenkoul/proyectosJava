package vuelos;

import java.util.ArrayList;

public class Internacional extends Vuelo {
    private String id;
    private String aerolinea;
    private String origen;
    private String destino;
    private String fecha;
    private int numPasajeros;
    private double precio;
    private boolean escala;
    ArrayList<String> escalas;
    public Internacional(String id, String aerolinea, String origen, String destino, String fecha, int numPasajeros, double precio,boolean escala,ArrayList<String> escalas) {
        super(id, aerolinea, origen, destino, fecha, numPasajeros, precio);
        this.escala=escala;
        this.escalas=escalas;
            if(this.getFecha().charAt(4)=='7' || this.getFecha().charAt(4)=='8'){
                    this.setPrecio(this.getPrecio()*1.25); 
            }
                 for (int i = 0; i < this.getEscalas().size(); i++) {
            this.setPrecio(this.getPrecio()*0.8); 
        } 
    }
  public Internacional(String id, String aerolinea, String origen, String destino, String fecha, int numPasajeros, double precio,boolean escala) {
        super(id, aerolinea, origen, destino, fecha, numPasajeros, precio);
        this.escala=escala;
        this.escalas=new ArrayList(0);
            if(this.getFecha().charAt(4)=='7' || this.getFecha().charAt(4)=='8'){
                    this.setPrecio(this.getPrecio()*1.25); 
            }
                 for (int i = 0; i < this.getEscalas().size(); i++) {
            this.setPrecio(this.getPrecio()*0.8); 
        } 
    }
    public Internacional() {
        super();
        this.escala=true;
        int random=((int)((Math.random()*5)+1));
        escalas= new ArrayList(0);
        for (int i = 0; i < random; i++) {
            this.escalas.add("Ciudad"+i);
        }
             if(this.getFecha().charAt(4)=='7' || this.getFecha().charAt(4)=='8'){
                    this.setPrecio(this.getPrecio()*1.25); 
            }
                 for (int i = 0; i < this.getEscalas().size(); i++) {
            this.setPrecio(this.getPrecio()*0.8); 
        } 
    }

    public boolean isEscala() {
        return escala;
    }

    public void setEscala(boolean escala) {
        this.escala = escala;
    }

    public ArrayList<String> getEscalas() {
        return escalas;
    }

    public void setEscalas(ArrayList<String> escalas) {
        this.escalas = escalas;
    }
    public String escalasToString(){
        String aux="";
        for (int i = 0; i < escalas.size()-1; i++) {
            aux+=escalas.get(i)+",";
        }
        aux+=escalas.get(escalas.size()-1);
        return aux;
    }
       @Override
    public String toString() {
        String aux;
         if(escala){
        aux= super.toString()+", escala="+this.escala+", escalas="+this.escalas.toString()+"}";
        }
        else{
        aux= super.toString()+", escala="+this.escala+"}"; 
        }
        return aux;
    }

    @Override
    public String toStringFichero() {
         String aux;
        if(escala){
        aux=";"+escala+";"+this.escalasToString();
        }
        else{
        aux=";"+escala;   
        }
         return super.toStringFichero()+aux;
    }
     
}
