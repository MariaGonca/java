package ejercicio9;

public class Test {

	public static void main(String [] arg) {
		//Creaci�n de tres direcciones y tres empleados
		Direcci�n direccion1 = new Direcci�n("San Francisco", 3, 1, "Sevilla");
		Empleado empleado1 = new Empleado("Rodolfo", 1000, direccion1);
		empleado1.nombreysalario();
		direccion1.informaciondireccion();
		
		Direcci�n direccion2 = new Direcci�n("San Antonio", 4, 2, "Sevilla");
		Empleado empleado2 = new Empleado("Manuel", 2000, direccion2);	
		empleado2.nombreysalario();
		direccion2.informaciondireccion();
		
		Direcci�n direccion3 = new Direcci�n("San Andr�s", 5, 1, "Sevilla");
		Empleado empleado3 = new Empleado("Salva", 1500, direccion3);
		empleado3.nombreysalario();
		direccion3.informaciondireccion();			
	}
}