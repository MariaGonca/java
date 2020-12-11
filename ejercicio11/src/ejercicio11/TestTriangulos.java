package ejercicio11;


public class TestTriangulos {
	public static void main(String[] args) {
		Triangulo a = new Triangulo(1,1,1);
		Triangulo b = new Triangulo(1,1,1);
		Triangulo c = new Triangulo(1,1,1);
		
		System.out.print("¿Los triangulos a y b son iguales? " + a.compareTo_Triangulos(a, b)+"\n"); 
		System.out.print("¿Los triangulos b y c son iguales? " + b.compareTo_Triangulos(c, b)+"\n");
		System.out.print("¿Los triangulos c y a son iguales? " + c.compareTo_Triangulos(c, a)+"\n");

		Triangulo listatriangulos[] = new Triangulo[3];
		
		listatriangulos[0] = a;
		listatriangulos[1] = b;
		listatriangulos[2] = c;
		
		System.out.print("¿Todos los triangulos son iguales? " + a.compareTo_VTriangulos(listatriangulos) + "\n");
		
		Triangulo d = new Triangulo(1,1,1);//equilatero
		Triangulo e = new Triangulo(1,1,2);//isoceles
		Triangulo f = new Triangulo(1,2,2);//isoceles
		Triangulo g = new Triangulo(1,2,1);//isoceles
		Triangulo h = new Triangulo(1,2,3);//escaleno
		System.out.println("Tipo de triangulo: "+d.tipo_Triangulo());
		System.out.println("Tipo de triangulo: "+e.tipo_Triangulo());
		System.out.println("Tipo de triangulo: "+f.tipo_Triangulo());
		System.out.println("Tipo de triangulo: "+g.tipo_Triangulo());
		System.out.println("Tipo de triangulo: "+h.tipo_Triangulo());

	}
}
