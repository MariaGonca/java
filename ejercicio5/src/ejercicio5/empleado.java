package ejercicio5;

public class empleado {
	//Atributos
	private int _NIF;
	private float _sueldobase;
	private float _pagoextras;
	private int _numhorasextras;
	private float _IRPF;
	private boolean _casado;
	private int _numhijos;
	
	/**
	 * 
	 * @param NIF
	 */
	
	//
	public void empleado(int NIF) {
		this._NIF=NIF;
	}

	//C�lculo del completmento por horas extras
	public float pagocomplemento(){
		return get_pagoextras()*get_numhorasextras();
	}
	
	//C�lculo y devoluci�n de retenci�n en funci�n de casado y n�mero de hijos
	public float devolucionretencion() {
		int porcentajetotal=0;
		if (is_casado()!=true) {
			porcentajetotal=2;
		}
		porcentajetotal=get_numhijos()+porcentajetotal;
		return get_sueldobase()*porcentajetotal;
	}
	
	//C�lculo del sueldo bruto
	public float sueldobruto() {
		return get_sueldobase()-(get_sueldobase()*get_IRPF());
	}
	
	//Visualizaci�n informaci�n b�sica (NIF)
	public void println() {
		 System.out.printf("El NIF del empleado es: "+_NIF);
	}
	
	//Visualizaci�n de todos los datos del empleado
	public void printAll() {
		System.out.printf("El sueldo base es: "+_sueldobase);
		System.out.printf("El complemento por horas extras es: "+pagocomplemento());
	}
	
	public int get_NIF() {
		return _NIF;
	}
	
	public void set_NIF(int _NIF) {
		this._NIF = _NIF;
	}

	public float get_sueldobase() {
		return _sueldobase;
	}

	public void set_sueldobase(float _sueldobase) {
		this._sueldobase = _sueldobase;
	}

	public float get_pagoextras() {
		return _pagoextras;
	}

	public void set_pagoextras(float _pagoextras) {
		this._pagoextras = _pagoextras;
	}

	public int get_numhorasextras() {
		return _numhorasextras;
	}

	public void set_numhorasextras(int _numhorasextras) {
		this._numhorasextras = _numhorasextras;
	}

	public float get_IRPF() {
		return _IRPF;
	}

	public void set_IRPF(float _IRPF) {
		this._IRPF = _IRPF;
	}

	public boolean is_casado() {
		return _casado;
	}

	public void set_casado(boolean _casado) {
		this._casado = _casado;
	}

	public int get_numhijos() {
		return _numhijos;
	}

	public void set_numhijos(int _numhijos) {
		this._numhijos = _numhijos;
	}
	
	
	
}
