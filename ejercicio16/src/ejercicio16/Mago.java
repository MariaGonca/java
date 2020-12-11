package ejercicio16;
/**
 * 
 * @author mcgca
 *
 */
public class Mago extends Personaje{



	private String poder;
/**
 * 
 * @param nombre
 * @param poder
 */

	public Mago(String nombre,  String poder) {
		super(nombre, 100);
		this.poder = poder;
	}


	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}
	
	public String encantar() {
		if(getEnergia()-2<0) {
			return ("No hay suficiente energia");
		}
		else {
			return ("Poder: "+ getPoder());
		}
	}
	
	
}
