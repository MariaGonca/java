package ejercicio11;

public class Triangulo {
	private double long_lado1;
	private double long_lado2;
	private double long_lado3;
	
	
	
	public Triangulo(double long_lado1, double long_lado2, double long_lado3) {
		super();
		this.long_lado1 = long_lado1;
		this.long_lado2 = long_lado2;
		this.long_lado3 = long_lado3;
	}
	
	public Triangulo() {
		super();
	}
	
	public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
		
		if(a.getLong_lado1()!=b.getLong_lado1()) {
			return false;
		}
		else if(a.getLong_lado2()!=b.getLong_lado2()) {
			return false;
		}
		else if(a.getLong_lado3()!=b.getLong_lado3()) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean compareTo_VTriangulos(Triangulo[] listatriangulos) {
		
		for(int i = 0;i < listatriangulos.length-1;i++) {
			for(int j = i+1; j< listatriangulos.length;j++) {
				Triangulo a = listatriangulos[i];
				Triangulo b = listatriangulos[j];
				if(a.getLong_lado1()!=b.getLong_lado1()) {
					return false;
				}
				else if(a.getLong_lado2()!=b.getLong_lado2()) {
					return false;
				}
				else if(a.getLong_lado3()!=b.getLong_lado3()) {
					return false;
				}
			}
		}
		return true;
	}
	
	public int tipo_Triangulo() {
		
		//Es equilatero o isoceles
		//si no, es isoceles o escaleno
		if(getLong_lado1()==getLong_lado2()) {
			
			if(getLong_lado2()==getLong_lado3()) {//es equilatero, 1 2 y 3 iguales
				return 1;
			}else {//es isoceles, lados 1 y 2 iguales pero 2 y 3 distintos
				return 2;
			}
		}
		//es isoceles o escaleno
		else if(getLong_lado2()==getLong_lado3()) {//es isoceles, lado 1 y 2 distintos pero 2 y 3 iguales
			return 2;
		}
		else if(getLong_lado1()==getLong_lado3()){//1 y 2 distintos, 2 y 3 distintos pero 1 y 3 iguales, isoceles
			return 2;
		}
		else {//1 y 2 distintos, 2 y 3 distintos y 1 y 3 distintos, escaleno
			return 3;
		}
		
	}
	
	public double getLong_lado1() {
		return long_lado1;
	}
	public void setLong_lado1(double long_lado1) {
		this.long_lado1 = long_lado1;
	}
	public double getLong_lado2() {
		return long_lado2;
	}
	public void setLong_lado2(double long_lado2) {
		this.long_lado2 = long_lado2;
	}
	public double getLong_lado3() {
		return long_lado3;
	}
	public void setLong_lado3(double long_lado3) {
		this.long_lado3 = long_lado3;
	}
	
	
}
