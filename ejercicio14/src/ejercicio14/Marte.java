package ejercicio14;

public class Marte {
	
	//Creación de tres marcianos
	public static void main(String[] args) {
		Marciano et1 = new Marciano("et1");
		Marciano et2 = new Marciano("et2");
		Marciano et3 = new Marciano("et3");
	//matar a marciano 2	
		et2.muere();
		
		Marciano et4 = new Marciano("et4");
	//volver a matar a marciano 2	
		et2.muere();
	//Consultar si están vivos o muertos	
		et1.estaVivo();
		et2.estaVivo();
		et3.estaVivo();
		et4.estaVivo();
	}

}
