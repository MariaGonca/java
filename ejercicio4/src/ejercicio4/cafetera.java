package ejercicio4;

public class cafetera {
	private int _capacidadMaxima;
	private int _cantidadActual;
	
	/**
	 * 
	 * @param capacidadMaxima
	 * @param cantidadActual
	 */
	
	 // Si la cantidad actual es mayor que la capacidad máxima de la cafetera, la ajustará al máximo
	public cafetera(int capacidadMaxima, int cantidadActual) {
		super();
		if(capacidadMaxima<=cantidadActual) {
			capacidadMaxima=cantidadActual;
		}
			
		this._capacidadMaxima = capacidadMaxima;
		this._cantidadActual = cantidadActual;
	}
	//Constructor Establece C.max en 1000 y actual en 0
	public cafetera() {
		this._capacidadMaxima=1000;
		this._cantidadActual=0;
	}
	
	//Inicializa la cantidad de café actual igual a la máxima
	public cafetera(int capacidadMaxima) {
		this._capacidadMaxima=capacidadMaxima;
		this._cantidadActual=capacidadMaxima;
		
	}
	
	//llenar cafetera
	public void llenarCafetera() {
		set_cantidadActual(get_capacidadMaxima());
	}
	//servir taza
	public void servirTaza(int capacidadtaza) {
		if(capacidadtaza>=get_cantidadActual()) {
			capacidadtaza=get_cantidadActual();
			set_cantidadActual(0);
		}else {
			set_cantidadActual(get_cantidadActual()-capacidadtaza);
		}
	}
	//vaciar taza
	public void vaciarCafetera() {
		set_cantidadActual(0);
	}
	//agregar café
	public void agregarCafe(int cantidadnueva) {
		
		if(cantidadnueva+get_cantidadActual()>get_capacidadMaxima()) {
			set_cantidadActual(_capacidadMaxima);	
		}else {
			set_cantidadActual(cantidadnueva+get_cantidadActual());
		}
	}
	
	//getters y setters
	public int get_capacidadMaxima() {
		return _capacidadMaxima;
	}

	public void set_capacidadMaxima(int _capacidadMaxima) {
		this._capacidadMaxima = _capacidadMaxima;
	}

	public int get_cantidadActual() {
		return _cantidadActual;
	}

	public void set_cantidadActual(int _cantidadActual) {
		this._cantidadActual = _cantidadActual;
	}

}

