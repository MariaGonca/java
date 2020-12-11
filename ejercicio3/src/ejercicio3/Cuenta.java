package ejercicio3;

public class Cuenta {

	long numerodecuenta;
	long DNI;
	double saldo;
	double interes;
	
	/**
	 * 
	 * @param numerodecuenta
	 * @param dNI
	 * @param saldo
	 * @param interes
	 */
	//Constructor por defecto
	public Cuenta(long numerodecuenta, long dNI, double saldo, double interes) {
		super();
		this.numerodecuenta = numerodecuenta;
		DNI = dNI;
		this.saldo = saldo;
		this.interes = interes;
	}

	//Constructor con DNI, saldo e interés
	public Cuenta(long dNI, double saldo, double interes) {
		super();
		DNI = dNI;
		this.saldo = saldo;
		this.interes = interes;
	}
	
	//función para actualizar el saldo
	public void actualizarSaldo() {
		setSaldo(getSaldo()+getSaldo()*(getInteres()/365));
	}
	
	//función para ingresar dinero en la cuenta
	public void ingresar(double dinero) {
		setSaldo(getSaldo()+dinero);
	
	}
	
	//función para retirar dinero si lo hubiera
	public void retirar(double dinero) {
		setSaldo(getSaldo()-dinero);
	}
	
	//getters y setters, para el número de cuenta no hay getter
	public void setnumerodecuenta(int numerodecuenta) {
		
	}
	public long getDNI() {
		return DNI;
	}

	public void setDNI(long dNI) {
		DNI = dNI;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

}
