package vuelos;
public class Nacional extends Vuelo {
    private String id;
    private String aerolinea;
    private String origen;
    private String destino;
    private String fecha;
    private int numPasajeros;
    private double precio;    

    public Nacional(String id, String aerolinea, String origen, String destino, String fecha, int numPasajeros, double precio) {
        super(id, aerolinea, origen, destino, fecha, numPasajeros, precio);
               if(this.getFecha().charAt(4)=='7'){
                this.setPrecio(this.getPrecio()*1.2);
            }
            if(this.getFecha().charAt(4)=='8'){
                this.setPrecio(this.getPrecio()*1.3);
            }
    }
    public Nacional() {
        super();

              if(this.getFecha().charAt(4)=='7'){
                this.setPrecio(this.getPrecio()*1.2);
            }
            if(this.getFecha().charAt(4)=='8'){
                this.setPrecio(this.getPrecio()*1.3);
            }
        
    }
    @Override
    public String toString() {
        return super.toString()+"}";
    }
    public String ToStringFichero(){
        return super.toStringFichero();
    }
    
}
