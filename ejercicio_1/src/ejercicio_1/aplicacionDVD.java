package ejercicio_1;
import java.util.Scanner;
public class aplicacionDVD {

	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        
         //Te muestra por pantalla la informacion necesaria a introducir y despu�s te pide que introduzcas
        System.out.println("Escriba el t�tulo de la pel�cula");
        String titulo = sc.nextLine();
        System.out.println("Escriba el nombre del director");
        String director = sc.nextLine();
        System.out.println("Escriba los actores que participan");
        String actores = sc.nextLine();
        System.out.println("Haz un resumen");
        String resumen = sc.nextLine();
        System.out.println("Dinos el g�nero");
        String genero = sc.nextLine();
        System.out.println("Duraci�n");
        int duracion = sc.nextInt();
        
         //Llamada a la clase objeto para utilizar sus respectivos m�todos
        DVDCine pelicula = new DVDCine(titulo, director, actores, genero, resumen, duracion);
        System.out.println(pelicula.esThriller());
        System.out.println(pelicula.muestraDuracion()); 
        System.out.println(pelicula.tieneResumen());
        System.out.println(pelicula.muestraDVDCine());
        
        sc.close();
    }
}
