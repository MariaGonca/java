package ejercicio3;

public class numerodecuenta {
	private int indice;
	
	/**
	 * 
	 * @param indice
	 */
	public numerodecuenta(int indice) {
		super();
		this.indice=indice;
	}

	//Asignar el siguiente n�mero al n�mero asignado
	public int getIndice() {
		setIndice(this.indice=this.indice+1);
		return indice;
	}
	
	public void setIndice(int indice) {
		this.indice=indice;
	}
}
