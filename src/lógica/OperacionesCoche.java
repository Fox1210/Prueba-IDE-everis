package l�gica;

import modelo.Coche;

public class OperacionesCoche {

	public static void derrapar(Coche c1) {
		if(c1.isDerrapar()) {
			System.out.println("Derrapando a todo gas");
		}
	}

	public static void arranca(Coche c1) {
		if(c1.isArancar()) {
			System.out.println("brumm");
		}
	}
	
	public static void sumaKilometros(int km, Coche c1) {
		c1.setContadorKilometros(km+c1.getContadorKilometros());
	}
	public static void reiniciarKilometros( Coche c1) {
		c1.setContadorKilometros(0);
	}
	public static int sumaNumeros(int a, int b) {
		int c = a + b;
		
		return c;
	}
	
}
