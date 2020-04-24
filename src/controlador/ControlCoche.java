package controlador;

import lógica.OperacionesCoche;
import modelo.Coche;

public class ControlCoche {

	public static void main(String[] args) {
		Coche coche1=new Coche(100);
		Coche coche2=new Coche(100);
		Coche coche3=new Coche(100);
		OperacionesCoche.sumaKilometros(100,coche1);
		OperacionesCoche.sumaKilometros(150,coche2);
		OperacionesCoche.reiniciarKilometros(coche3);
		System.out.println(coche1);
		System.out.println(coche2);
		System.out.println(coche3);
		int c = OperacionesCoche.sumaNumeros(1, 1);
		System.out.println("El número es: "+c);
		
	}

}
