package U8_P6_Cuenta;

public class testerCuenta {

    public static void main(String[] args) {
        
        //crear varias cuentas
        Titular titular1 = new Titular();
        cuentaCorriente cuenta = new cuentaCorriente(titular1,"11111");
        System.out.println(titular1.toString());
        
        
    }
}
