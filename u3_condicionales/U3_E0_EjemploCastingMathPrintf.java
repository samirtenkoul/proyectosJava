package u3_condicionales;


public class U3_E0_EjemploCastingMathPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DownCasting De un tipo de mayor tama�o queremos bajarlo a un tama�o inferior, bajo la responsabilidad del programador
		//En este ejemplo, se puede a nivel de compilaci�n-> pero falla en ejecuci�n
		byte resultado = (byte)Math.pow(2, 3);
		System.out.println(resultado);
		float resultado2 = (float) Math.pow(1000000, 3);
		//Upcasting se hace autom�ticamente
		double numero = 3*2;
		//java por defecto enteros->int
		//java por defecto reales->double
		float x = (float)3.2;
		float x2 = 3.2f;
		//%f-> reales, %d ->int
		System.out.printf("asdf %f ; %d ; ",x,resultado);
		System.out.printf("asdf %.0f ; %02d ; ",x,resultado);
	}

}
