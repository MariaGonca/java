package ejercicio2;

public class vehiculo {
	String modelo;
	double potencia;
	boolean cRuedas;
	
	/**
	 * 
	 * @param modelo
	 * @param potencia
	 * @param cRuedas
	 */
	//Constructor
	public vehiculo(String modelo, double potencia, boolean cRuedas) {
		this.modelo = modelo;
		this.potencia=potencia;
		this.cRuedas=cRuedas;
	}


	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
	
	//Indica si tiene tracci�n en las ruedas
	public boolean iscRuedas() {
		if (cRuedas == false) {
			System.out.println("No tiene tracci�n en las cuatro ruedas");
			return cRuedas;
		}else {
			System.out.println("Tiene tracci�n en las cuatro ruedas");
			return cRuedas;
		}
	}
}
