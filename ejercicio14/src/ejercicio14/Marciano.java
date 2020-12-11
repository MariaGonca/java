package ejercicio14;

public class Marciano {
	private boolean vivo = false;
	private static int numMarcianos;
	private String nombre;

	/**
	 * 
	 * @param nombre
	 */
	
	//Constructor marciano
	public Marciano(String nombre) {
		this.vivo=true;
		this.nombre=nombre;
		numMarcianos++;
		System.out.println(nace());
	}
	
	//mensaje cuando nace
	public String nace() {
		return "Hola, he nacido, soy el marciano "+nombre+" y somos "+cuentaMarcianos()+ " vivos";
	}
	//mensaje cuando muere y acci�n matar cambiando vivo a false
	public String muere() {
		if (vivo==true) {
			vivo=false;
			numMarcianos --;
			return "El marciano "+nombre+ "ha muerto";
		}else {
			return "El marciano ya est� muerto";
		}
	}
	
	//Contador de marcianos
	public int cuentaMarcianos() {
		return numMarcianos;
	}
	
	//Consultar si est� vivo o muerto
	public void estaVivo(){
		if(vivo == true) {
			System.out.println("El marciano "+nombre+ " est� vivo");
		}else {
			System.out.println("El marciano "+nombre+" est� muerto");
		}	
	}
	
	
}
