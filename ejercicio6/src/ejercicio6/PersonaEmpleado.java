package ejercicio6;

public class PersonaEmpleado {
	
	public static void main (String[] args) {
		
		//Definir un objeto de la clase persona
		Persona persona1 = new Persona("Rodolfo", 22);
		//Llamar a los m�todos de persona cargar datos e imprimir
		persona1.printf();
		persona1.cargarDatos("Rodo", 22);
		
		//Definir objeto de la clase empleado y llamar a sus m�todos
		Empleado empleado1 = new Empleado("Mateu", 21, 1000);
		empleado1.printf();
		empleado1.cargarsueldo(11111);
		
	}

}
