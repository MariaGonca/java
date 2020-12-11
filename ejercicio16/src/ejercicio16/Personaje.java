package ejercicio16;
/**
 * 
 * @author mcgca
 *
 */
public class Personaje {
	private String nombre;
	private int energia;
	
/**
 * 
 * @param nombre
 * @param energia
 */
	public Personaje(String nombre, int energia) {
		super();
		this.nombre = nombre;
		this.energia = energia;
	}
	
	
	public void alimentar(int energia) {
		setEnergia(getEnergia()+energia);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	
}
