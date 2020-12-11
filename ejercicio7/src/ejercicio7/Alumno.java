package ejercicio7;

//Implementar clase alumno que incluya Asignatura
public class Alumno extends Asignatura {

	private String nombreAlumno;
	private int edadAlumno;	
	/**
	 * ESTE ES EL EJERCICIO 8
	 * @param nombreAsignatura
	 * @param notaAsignatura
	 * @param nombreAlumno
	 * @param edadAlumno
	 */
	//Constructor que acepta como par�metro el nombre y la edad
	public Alumno(String nombreAsignatura, double notaAsignatura, String nombreAlumno, int edadAlumno) {
		super(nombreAsignatura, notaAsignatura);
		this.nombreAlumno = nombreAlumno;
		this.edadAlumno = edadAlumno;
	}
	
	//M�todo para consultar la informaci�n
	 public void informacion() {
		   System.out.printf("Nombre: " + this.nombreAlumno  + "\n");
		   System.out.printf("Edad: " + this.edadAlumno + "\n");           
		   System.out.printf("Asignaturas que curs�: \nNombre:"+ this.getNombreAsignatura() + "\nNota: " + this.getnotaAsignatura() +" \nCalificaci�n: "+this.indicaAprobado() +"\n\n");
	 }

	
	//getters y setters
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public int getEdadAlumno() {
		return edadAlumno;
	}
	public void setEdadAlumno(int edadAlumno) {
		this.edadAlumno = edadAlumno;
	}
		
}
