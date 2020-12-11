package ejercicio7;

public class Asignatura {
	
	//Atributos de la clase asignatura
	private String nombreAsignatura;
    private double notaAsignatura;
	/**
	 * 
	 * @param nombreAsignatura
	 * @param notaAsignatura
	 */
    //Constructor que acepta atributos como par�metros
    public Asignatura(String nombreAsignatura, double notaAsignatura){
		   this.nombreAsignatura=nombreAsignatura;
		   this.notaAsignatura=notaAsignatura;
		   }
	//M�todo para modificar la nota	   
    public void setNota(double notamodificada){
		   notaAsignatura=notamodificada;
		   }
	//M�todo para consultar la nota	   
	public double getnotaAsignatura(){
		       
		   return notaAsignatura;
		   }
	//M�todo para saber si es aprobado o suspenso	   
	public String indicaAprobado(){
		   if(notaAsignatura<5) {
			   return "Suspenso";
		   }else {
			   return "Aprobado"; 
		   }
	}
	
	public String getNombreAsignatura(){
		   return nombreAsignatura;
		   }
		   	   
}
	
