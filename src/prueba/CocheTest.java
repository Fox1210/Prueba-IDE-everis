package prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import modelo.Coche;
import lógica.OperacionesCoche;

class CocheTest {

	@Test
	void testAddKm() {
		Coche c1 = new Coche(100);
		Coche c2 =new Coche(100);
		OperacionesCoche.sumaKilometros(100,c1);
		OperacionesCoche.sumaKilometros(150,c2);
		assertEquals(200, c1.getContadorKilometros());
		assertEquals(250, c2.getContadorKilometros());
	}

	@Test
	void testReiniciarKM() {
		Coche c1 = new Coche(100);
		Coche c2 =new Coche(100);
		OperacionesCoche.reiniciarKilometros(c1);
		OperacionesCoche.reiniciarKilometros(c2);
		assertEquals(0, c1.getContadorKilometros());
		assertEquals(1, c2.getContadorKilometros());//linea de error para probar el ASSERTEQUALS
	}

	@Test
	void testSumaNumeros() {
		int a =1;
		int b=2;
		int c;
		c=OperacionesCoche.sumaNumeros(a, b);
	}
}
