package U8_P6_Cuenta;

public class cuentaCorriente {
    //Atributos
    private Titular titular;
    private String numCuenta;
    protected double saldo;
    
    //Constructores
    public cuentaCorriente(Titular titular, String numCuenta, double saldo) {
        this.titular = titular;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    
    public cuentaCorriente (Titular titular, String numCuenta){
        this.titular = titular;
        this.numCuenta = numCuenta;
        saldo = 15.3;
    }
    //Getters
    public Titular getTitular(){
        return titular;
    }
    public String getnumCuenta(){
        return numCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    //Set
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    //Metodos
    public void Ingresar (double ingreso){
        saldo = saldo + ingreso;
    }
    public void Reintegro (double retirada){
        saldo = saldo - retirada;
    }
    @Override
    public String toString (){
        return titular+"\nCuenta Corriente:\nNº de Cuenta: " + numCuenta + "\nSaldo: " + saldo;
    }
    //DUDA: COMO COMPARAR OBJETOS CON COMPARE TO,EQUALS, OBJECT ETC...
    public boolean compararCuentas (cuentaCorriente cuenta){
        boolean respuesta = false;
        if (this.numCuenta.equals(cuenta.numCuenta))
            respuesta = true;
        return respuesta;
    }
     public boolean compararCuentas2 (cuentaCorriente cuenta){
        boolean respuesta = false;
        if (this.numCuenta.compareTo(cuenta.numCuenta)==0)
            respuesta = true;
        return respuesta;
    }
    
}
