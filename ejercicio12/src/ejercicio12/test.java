package ejercicio12;

import java.util.Scanner;


public class test {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		//Se crean tres empleados 
	     empleadoYSueldo empleado1 = new empleadoYSueldo("Antonio", 40, 0, 1000);	  
	     
	     empleadoYSueldo empleado2 = new empleadoYSueldo("Manolo", 49, 0, 1000);
	  
	     empleadoYSueldo empleado3 = new empleadoYSueldo("�lvaro", 40, 0, 1000);
	  
	     //Se pide por pantalla el nombre del empleado para consultar su sueldo
	     //Si el nombre no coincide con los empleados lo muestra por pantalla
	     System.out.println("Escribe el nombre del empleado");
	       String nombre = sc.nextLine();
	        
	     
	     if(nombre.equals(empleado1.getNombre())) {
	    		empleado1.sueldo();
	     }else if (nombre.equals(empleado2.getNombre())){
	    	 empleado2.sueldo();
	     }else if (nombre.equals(empleado3.getNombre())) {
	    	 empleado3.sueldo();
	     }else {
	    	 System.out.print("Esa persona no trabaja aqu�");
	     }
	     
	     sc.close();
	     
	}
	

}
