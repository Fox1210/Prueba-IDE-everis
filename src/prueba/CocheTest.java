package prueba;

import org.junit.jupiter.api.Test;

import modelo.Coche;
import lógica.OperacionesCoche;

class CocheTest {

	@Test
	void test() {
		Coche c1 = new Coche(100);
		Coche c2 =new Coche(100);
		sumaKilometros(100,c1);
		sumaKilometros(150,c2);
	}

}
