package ejercicio17;
import java.util.Scanner;
/**
 * 
 * @author mcgca
 *
 */

public class Aparcamiento {
	private int numeroDePlaza;
	private Coche cocheAparcado;
	private boolean plazaOcupada;
	private int numeroDeUsos;
	
	public Aparcamiento(int numeroDePlaza) {
		super();
		this.numeroDePlaza = numeroDePlaza;
		this.plazaOcupada = false;
		this.cocheAparcado = null;
		this.numeroDeUsos = 0;
	}
	
	public void menu() {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		while(opcion!=4) {
			System.out.println("\nPLAZA DE APARCAMIENTO:");
			System.out.println("1.\t Aparcar coche");
			System.out.println("2.\t Sacar coche");
			System.out.println("3.\t Ver coche aparcado");
			System.out.println("4.\t Salida\n");
			//Cuando se usa sc.nextInt() y despues sc.nextLine, hay un error y el nextLine()
			//coge el salto de linea del nextInt, usamos el parse para evitarlo
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion) {
				case 1: {
					System.out.print("\n");
					aparcarCoche(sc);
					break;
				}
				case 2: {
					sacarCoche();
					break;
				}
				case 3: {
					verCocheAparcado();
					break;
				}
				case 4: {
					System.out.println("SALIDA DEL PROGRAMA");
					System.out.println("Se han aparcado un total de "+ getNumeroDeUsos() + " coches.");
					break;
					
				}
				
				default:
					System.out.println("Opcion incorrecta.");
					break;
				}
		}
		sc.close();
	}
	
	public void aparcarCoche(Scanner sc) {
		//si no habia ningun coche aparcado, se aparca uno nuevo asignandole atributos y se aumenta el numero de usos
		//del aparcamiento
		if(isPlazaOcupada()==false) {
			System.out.println("\nInserta la matricula del coche: ");
			String matricula = sc.nextLine();
			System.out.println("Inserta la marca del coche: ");
			String marca = sc.nextLine();
			System.out.println("Inserta el modelo del coche: ");
			String modelo = sc.nextLine();
			
			setCocheAparcado(new Coche(matricula,marca,modelo));
			setPlazaOcupada(true);
			setNumeroDeUsos(getNumeroDeUsos()+1);
			System.out.println("COCHE SE HA APARCADO");
		}
		//Si no, la plaza ya estaba ocupada por otro coche
		else {
			System.out.println("PLAZA YA OCUPADA POR OTRO COCHE");
		}
		
	}
	
	public void sacarCoche() {
		//la plaza ya esta ocupada y se puede sacar el coche
		if(isPlazaOcupada()==true) {
			setCocheAparcado(null);
			setPlazaOcupada(false);
			System.out.println("PLAZA LIBRE DE COCHE... HA SALIDO DE LA PLAZA");
		}
		//la plaza estaba libre, no se podia sacar ningun coche
		else {
			System.out.println("ERROR, NO HAY COCHE EN LA PLAZA DE APARCAMIENTO");
		}
	}
	
	public void verCocheAparcado() {
		//si esta la plaza ocupada, se ve la informacion del coche aparcado
		if(isPlazaOcupada()==true) {
			getCocheAparcado().informacionCoche();
		}
		//si no estaba la plaza ocupada, no se encuentra ningun coche
		else {
			System.out.println("LA PLAZA ESTA LIBRE");
		}
	}
	
	public int getNumeroDePlaza() {
		return numeroDePlaza;
	}
	public void setNumeroDePlaza(int numeroDePlaza) {
		this.numeroDePlaza = numeroDePlaza;
	}
	public Coche getCocheAparcado() {
		return cocheAparcado;
	}
	public void setCocheAparcado(Coche cocheAparcado) {
		this.cocheAparcado = cocheAparcado;
	}
	public boolean isPlazaOcupada() {
		return plazaOcupada;
	}
	public void setPlazaOcupada(boolean plazaOcupada) {
		this.plazaOcupada = plazaOcupada;
	}
	public int getNumeroDeUsos() {
		return numeroDeUsos;
	}
	public void setNumeroDeUsos(int numeroDeUsos) {
		this.numeroDeUsos = numeroDeUsos;
	}
	
	
	
}
