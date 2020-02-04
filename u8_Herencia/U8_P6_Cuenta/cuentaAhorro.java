package U8_P6_Cuenta;

public class cuentaAhorro extends cuentaCorriente {
    //Atributo
    private double interes;
    
    //Constructor1
    public cuentaAhorro (Titular titular,String numCuenta,double saldo,double interes){
        super (titular,numCuenta,saldo);
        this.interes = interes;
    }
    //Constructor2
    public cuentaAhorro (Titular titular,String numCuenta,double interes){
        super (titular,numCuenta,15.3);
        this.interes = interes;
    }
    public cuentaAhorro (Titular titular,String numCuenta){
        super (titular,numCuenta,15.3);
        interes = 2.5;
    }
    //Get
    public double getInteres (){
        return interes;
    }
    //DUDA: SI NO NOS LO PONEN, NO PONEMOS EL SET???
    //DUDA: SOLUCION  NO FUNCIONA (void)
    public double calcularInteres (){
       return saldo*interes;
    }
    //no se puede hacer asi???
    public void calcularInteres2 (){
        //cuenta.setSaldo(cuenta.getSaldo()+ cuenta.getSaldo()*interes);
        setSaldo(getSaldo()+getSaldo()*interes);
    }
    //o asi
    public double calcularIntereses (){
        double saldo = this.getSaldo();
        return saldo*interes;
    }
    
}
