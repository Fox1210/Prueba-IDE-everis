package prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import modelo.Coche;
import lógica.OperacionesCoche;

class CocheTest {

	@Test
	void test() {
		Coche c1 = new Coche(100);
		Coche c2 =new Coche(100);
		OperacionesCoche.sumaKilometros(100,c1);
		OperacionesCoche.sumaKilometros(150,c2);
		assertEquals(200, c1.getContadorKilometros());
		assertEquals(250, c2.getContadorKilometros());
	}

}
