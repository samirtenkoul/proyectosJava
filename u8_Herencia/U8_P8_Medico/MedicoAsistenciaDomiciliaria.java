package U8_P8_Medico;

public class MedicoAsistenciaDomiciliaria extends Medico{
    //Atributos
    private int [] kmVisitas;
    private double tarifaKm;

    public MedicoAsistenciaDomiciliaria(int[] kmVisitas, double tarifaKm, String nombre, int edad, String sexo, double horas, double salarioHora) {
        super(nombre, edad, sexo, horas, salarioHora);
        kmVisitas = new int[(int)(Math.random()*25)+1];
        for (int i = 0;i<kmVisitas.length;i++){
            kmVisitas[i]=(int)(Math.random()*50)+1;
        }
        this.tarifaKm = tarifaKm;
    }

    public MedicoAsistenciaDomiciliaria(int[] kmVisitas, double tarifaKm) {
        this.kmVisitas = kmVisitas;
        this.tarifaKm = tarifaKm;
    }

    @Override
    public double calcularSalario(double horas) {
        double salario = horas*super.getSalarioHora();
        double extra = 0;
        for (int i = 0; i<kmVisitas.length;i++){
            extra += kmVisitas[i];
        }
        extra *= tarifaKm;
        return salario + extra;
    }
    
    
    
    
}
