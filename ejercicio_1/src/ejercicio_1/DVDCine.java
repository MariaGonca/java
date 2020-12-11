package ejercicio_1;

public class DVDCine {

		private String titulo;
		private String director;
		private String actores;
		private String resumen;
		private String genero;
		private int duracion;
		
		/**
		 * Constructor que admite como argumentos los atributos de la clase
		 * @param titulo
		 * @param director
		 * @param actores
		 * @param genero
		 * @param resumen
		 * @param duracion
		 */
		
		public DVDCine( String titulo,String director,String actores, String genero, String resumen, int duracion) {
			this.titulo=titulo;
			this.director=director;
			this.actores=actores;
			this.genero=genero;
			this.resumen=resumen;
			this.duracion=duracion;
		
	}	

	   
	   	//Método que retorna toda la descripción de la pelicula   
	   public String muestraDVDCine() {
	       return titulo+". De: "+director+ ", con los actores: "+actores+", tipo: "+genero+", con duración de: "+duracion+". Resumen: "+resumen;
	   }	
		
		
		//Método que retorna True si  Thriller es el género de la película
	   public boolean esThriller() {
	       if(this.genero=="Thriller") {
	           return true;
	       }else {
	       return false;
	       }
	   }
	   
	    //Método que retorna cierto si la película tiene resumen (no es nulo)
	   public boolean tieneResumen() {
	            return this.resumen!=null;
	   }

	   
	    //Mostrara la duracion de la pelicula
	   public int muestraDuracion() {
	       return this.duracion;

	   }

}
