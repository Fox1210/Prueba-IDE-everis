package modelo;

public class Coche {
	// variables
	private int numeroDeRuedas;
	private String marca;
	private String modelo;
	private boolean arancar;
	private boolean derrapar;
	private int ContadorKilometros;

	// constructores
	public Coche(int contadorKilometros){
		this.numeroDeRuedas = 4;
		this.marca = "marca";
		this.modelo = "modelo";
		this.arancar = false;
		this.derrapar = false;
		ContadorKilometros = contadorKilometros;
	}
	public Coche(int numeroDeRuedas, String marca, String modelo, boolean arancar, boolean derrapar,
			int contadorKilometros) {
		this.numeroDeRuedas = numeroDeRuedas;
		this.marca = marca;
		this.modelo = modelo;
		this.arancar = arancar;
		this.derrapar = derrapar;
		ContadorKilometros = contadorKilometros;
	}

	// getters y setters
	public int getNumeroDeRuedas() {
		return numeroDeRuedas;
	}

	public void setNumeroDeRuedas(int numeroDeRuedas) {
		this.numeroDeRuedas = numeroDeRuedas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isArancar() {
		return arancar;
	}

	public void setArancar(boolean arancar) {
		this.arancar = arancar;
	}

	public boolean isDerrapar() {
		return derrapar;
	}

	public void setDerrapar(boolean derrapar) {
		this.derrapar = derrapar;
	}

	public int getContadorKilometros() {
		return ContadorKilometros;
	}

	public void setContadorKilometros(int contadorKilometros) {
		ContadorKilometros = contadorKilometros;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Coche [numeroDeRuedas=" + this.numeroDeRuedas + ", marca=" + this.marca + ", modelo=" + this.modelo + ", arancar="
				+ this.arancar + ", derrapar=" + this.derrapar + ", ContadorKilometros=" + this.ContadorKilometros + "]";
	}
}
