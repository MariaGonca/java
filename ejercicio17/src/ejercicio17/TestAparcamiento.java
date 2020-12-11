package ejercicio17;

import java.util.Scanner;

public class TestAparcamiento {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el numero de plaza de aparcamiento");
		int numeroPlaza = sc.nextInt();
		Aparcamiento aparcamiento = new Aparcamiento(numeroPlaza);
		aparcamiento.menu();
		sc.close();
	}
}
