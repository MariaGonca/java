package ejercicio12;

public class empleadoYSueldo {
	
	private String nombre;
	private int horas;
	private int sueldo;
	private int tarifaNormal;
	

	/**
	 * Inicializa el constructor empleado con sus atributos
	 * @param nombre
	 * @param horas
	 * @param sueldo
	 * @param tarifaNormal
	 */
	public empleadoYSueldo(String nombre, int horas, int sueldo, int tarifaNormal) {
		super();
		this.nombre = nombre;
		this.horas = horas;
		this.sueldo = sueldo;
		this.tarifaNormal = tarifaNormal;	
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getTarifaNormal() {
		return tarifaNormal;
	}

	public void setTarifaNormal(int tarifaNormal) {
		this.tarifaNormal = tarifaNormal;
	}

	//Dependiendo del n�mero de horas se calcula el sueldo
	public void sueldo() {
		if(horas<=40) {
			sueldo=tarifaNormal;
			System.out.print("El sueldo de "+nombre+" es de "+sueldo+" euros porque trabaj� "+horas+" horas\n");
		}else {
			sueldo=tarifaNormal+((horas-40)*(tarifaNormal+(tarifaNormal/2)));
			System.out.print("El sueldo de "+nombre+" es de "+sueldo+" euros porque trabaj� "+horas+" horas\n");
		}
	}
	
}
