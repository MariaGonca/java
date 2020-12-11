package ejercicio15;

public class Cuenta {

	private float saldoActual;
	private String nombreCuenta;
	/**
	 * 
	 * @param saldoActual
	 * @param nombreCuenta
	 */
	public Cuenta(float saldoActual, String nombreCuenta) {
		super();
		this.saldoActual = saldoActual;
		this.nombreCuenta = nombreCuenta;
	}	
	
	//cuenta vacía
	public Cuenta() {
		super();
		this.saldoActual = 0;
		this.nombreCuenta = "";
	}
	//cuenta con saldo inicial
	public Cuenta(float saldoActual) {
		super();
		this.saldoActual = saldoActual;
	}
//Este es el getSaldo() que devuelve el saldo actual
	public void getSaldoActual() {
		System.out.println("El saldo actual es de: "+saldoActual);
	}
	
	public void setSaldoActual(float saldoActual) {
		this.saldoActual = saldoActual;
	}

	public String getNombreCuenta() {
		return nombreCuenta;
	}

	public void setNombreCuenta(String numeroCuenta) {
		this.nombreCuenta = numeroCuenta;
	}

	//Métodos ingresar y extraer
	public void ingresar(float c) {
		this.saldoActual=saldoActual+c;
	}
	
	public void extraer(float c) {
		this.saldoActual=saldoActual-c;
	}	
	
}
