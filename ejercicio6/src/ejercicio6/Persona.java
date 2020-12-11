package ejercicio6;

public class Persona {

	private String nombre;
	private int edad;
	/**
	 * 
	 * @param nombre
	 * @param edad
	 */
	
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//m�todo que imprime los datos personales	
	public void printf() {
		System.out.printf("Nombre: "+nombre);
		System.out.printf("Edad: "+edad);	
	}
	
	
	//m�todo que carga los datos personales 
	public void cargarDatos(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	
	
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
