package ejercicio16;
/**
 * 
 * @author mcgca
 *
 */
public class TestEjercicio16 {
	public static void main(String[] args) {
		Guerrero guerrero1 = new Guerrero("g1", 50, "Espada");
		Guerrero guerrero2 = new Guerrero("g1", 10, "Hacha");
		
		Mago mago1 = new Mago("m1", "Magia de fuego");
		Mago mago2 = new Mago("m2", "Magia de hielo");
		
		guerrero1.alimentar(5);
		System.out.println(guerrero1.combatir(50));
		
		System.out.println(guerrero2.combatir(10));
		System.out.println(guerrero2.combatir(10));
		//comprobamos que el metodo alimentar funciona y que combatir resto energia
		guerrero2.alimentar(20);
		System.out.println(guerrero2.combatir(10));
		
		System.out.println(mago1.encantar());
		System.out.println(mago1.encantar());
		mago1.alimentar(1);
		
		System.out.println(mago2.encantar());
		mago2.alimentar(1);
	}
}
