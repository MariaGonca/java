package ejercicio9;

public class Empleado {
	
	private String nombre;
	private int salario;
	private Direcci�n direccion;
	
	/**
	 * 
	 * @param nombre
	 * @param salario
	 * @param direccion
	 */
	
	public Empleado(String nombre, int salario, Direcci�n direccion) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.direccion = direccion;
	}
	
	
	public void nombreysalario() {
		System.out.println("Nombre: "+getNombre()+"\nSalario: "+getSalario());
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public Direcci�n getDireccion() {
		return direccion;
	}
	public void setDireccion(Direcci�n direccion) {
		this.direccion = direccion;
	}
	
	
}
