package U8_P8_Medico;

public class MedicoCentroSalud extends Medico{
    //Atributos
    private CentroSalud centroSalud;
    
    //Constructores
    public MedicoCentroSalud(String nombre, int edad, String sexo, double horas, double salarioHora, CentroSalud centroSalud) {
        super(nombre, edad, sexo, horas, salarioHora);
        this.centroSalud = centroSalud;
    }
    public MedicoCentroSalud() {
        super(nombre, edad, sexo, horas, salarioHora);
        this.centroSalud = centroSalud;
    }
    //Metodos
    @Override
    public String toString() {
        return "MedicoCentroSalud:"+super.toString() + "\ncentroSalud=" + centroSalud + '\n';
    }
    
   @Override
    public double calcularSalario() {
        return getHoras()*getSalarioHora();
    }
    
}
