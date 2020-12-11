package ejercicio3;

public class testCuenta {

	public static void main (String[] args) {
		
		//Se le asigna el número 100001
		numerodecuenta numero = new numerodecuenta(100001);
		//Creación del objeto cuenta
		Cuenta cuenta1 = new Cuenta(13131313, 234.0, 7.0);
		Cuenta cuenta2 = new Cuenta(14141414, 500.0, 6.0);
		Cuenta cuenta3 = new Cuenta(15151515, 660.0, 5.0);
		
		cuenta1.setnumerodecuenta(numero.getIndice());
		cuenta2.setnumerodecuenta(numero.getIndice());
		cuenta3.setnumerodecuenta(numero.getIndice());
		
		cuenta1.setInteres(7.0);
		cuenta1.setSaldo(800.0);
		cuenta1.setDNI(16161616);
		
		cuenta2.ingresar(100.0);
		cuenta1.retirar(50.0);
		cuenta3.actualizarSaldo();
		
		return;
	}
}
