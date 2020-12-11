package ejercicio6;

public class Empleado extends Persona {
	
	private float sueldo;
	
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param sueldo
	 */

	//método para cargar sueldo
	public Empleado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}
	
	//imprimir el sueldo
	public void printf() {
		System.out.printf("El sueldo es de: "+sueldo);
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	public void cargarsueldo(float sueldo) {
		this.cargarsueldo(sueldo);
	}
	

}
