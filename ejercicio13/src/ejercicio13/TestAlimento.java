package ejercicio13;

public class TestAlimento {
	public static void main(String[] args) {
		Alimento a = new Alimento("Patata");
		Alimento b = new Alimento("Pollo", 2, 2, 20, true, "B", "B");
		Alimento c = new Alimento("Zanahoria", 2, 2, 20, true, "A", "A");
		Alimento d = new Alimento("Tomate", 40, 2, 20, true, "A", "A");
		
		System.out.print(a.esDietetico());
		System.out.print(b.esDietetico());
		System.out.print(c.esDietetico());
		System.out.print(d.esDietetico());
		
		a.muestraAlimento();
		b.muestraAlimento();
		c.muestraAlimento();
		d.muestraAlimento();
	
	}
}
