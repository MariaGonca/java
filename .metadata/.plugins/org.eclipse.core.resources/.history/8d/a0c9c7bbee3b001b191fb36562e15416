package ejercicio13;

public class Alimento {

	String nombrealimento;
	float lipidos;
	float hidradosdecarbono;
	float proteinas;
	boolean origenanimal;
	String vitaminas;
	String minerales;
	
	public Alimento(String nombrealimento, float lipidos, float hidradosdecarbono, float proteinas,
			boolean origenanimal, String vitaminas, String minerales) {
		super();
		this.nombrealimento = nombrealimento;
		this.lipidos = lipidos;
		this.hidradosdecarbono = hidradosdecarbono;
		this.proteinas = proteinas;
		this.origenanimal = origenanimal;
		this.vitaminas = vitaminas;
		this.minerales = minerales;
	}

	public Alimento(String nombrealimento) {
		super();
		this.nombrealimento = nombrealimento;
	}
	
	public boolean esDietetico() {
		if(this.vitaminas ==null || this.minerales==null) {
			System.out.print("No hay  mas informacion sobre este alimento\n");
		}else
		if(getLipidos()<20 && vitaminas.equals("B")){
			return false;
		}
		
			return true;
		
		
	}
	
	public void muestraAlimento() {
		System.out.print("Nombre del alimento: " +getNombrealimento()+"\n");
		if(this.vitaminas ==null || this.minerales==null) {
			System.out.print("No hay  mas informacion sobre este alimento\n");
		}else {
		System.out.print("Contenido de lipidos: "+ getLipidos()+"\n");
		System.out.print("Contenido de Hidratos de carbono: "+ getHidradosdecarbono()+"\n");
		System.out.print("Contenido de proteinas: "+ getProteinas()+"\n");
		System.out.print("Origen animal: "+ isOrigenanimal()+"\n");
		System.out.print("Contenido de vitaminas: "+  getVitaminas()+"\n");
		System.out.print("Contenido de minerales: "+ getMinerales()+"\n\n");
		}
	}
	

	public String getNombrealimento() {
		return nombrealimento;
	}

	public void setNombrealimento(String nombrealimento) {
		this.nombrealimento = nombrealimento;
	}

	public float getLipidos() {
		return lipidos;
	}

	public void setLipidos(float lipidos) {
		this.lipidos = lipidos;
	}

	public float getHidradosdecarbono() {
		return hidradosdecarbono;
	}

	public void setHidradosdecarbono(float hidradosdecarbono) {
		this.hidradosdecarbono = hidradosdecarbono;
	}

	public float getProteinas() {
		return proteinas;
	}

	public void setProteinas(float proteinas) {
		this.proteinas = proteinas;
	}

	public boolean isOrigenanimal() {
		return origenanimal;
	}

	public void setOrigenanimal(boolean origenanimal) {
		this.origenanimal = origenanimal;
	}

	public String getVitaminas() {
		return vitaminas;
	}

	public void setVitaminas(String vitaminas) {
		this.vitaminas = vitaminas;
	}

	public String getMinerales() {
		return minerales;
	}

	public void setMinerales(String minerales) {
		this.minerales = minerales;
	}
	
	
	
}
