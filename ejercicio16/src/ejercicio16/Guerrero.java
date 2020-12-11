package ejercicio16;
/**
 * 
 * @author mcgca
 *
 */
public class Guerrero extends Personaje{
	
	private String arma;
	/**
	 * 
	 * @param nombre
	 * @param energia
	 * @param arma
	 */

	public Guerrero(String nombre, int energia, String arma) {
		super(nombre, energia);
		this.arma = arma;
	}

	String combatir(int energiaGastada) {
		if(getEnergia()-energiaGastada<0) {
			return ("No hay suficiente energia");
		}else {
			setEnergia(getEnergia()-energiaGastada);
			return (String.valueOf(energiaGastada)+getArma());
		}
	}
	
	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}
	
}
