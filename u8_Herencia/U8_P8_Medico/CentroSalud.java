package U8_P8_Medico;

public class CentroSalud {
    //Atributos
    private int identificador;
    private String nombre;
    private String domicilio;
    private String localidad;

    public CentroSalud(int identificador, String nombre, String domicilio, String localidad) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.localidad = localidad;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "CentroSalud{" + "identificador=" + identificador + ", nombre=" + nombre + ", domicilio=" + domicilio + ", localidad=" + localidad + '}';
    }
    
    
}
