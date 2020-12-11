package ejercicio10;

public class Provisiones {
	private float kiloPapas;
	private float kiloChocos;

	public void addChocos(float kilos) {
		setKiloChocos(getKiloChocos() + kilos);
	}

	public void addPapas(float kilos) {
		setKiloPapas(kilos + getKiloPapas());
	}

	public int getComensales() {
		int totalpersonasporchocos = (int) (getKiloChocos() * 6);
		int totalpersonasporpapas = (int) (getKiloPapas()*3);

		//El limite de personas a las que se pueden servir se debe a los chocos o son iguales
		if(totalpersonasporchocos<=totalpersonasporpapas) {
			System.out.print("Se pueden servir a un total de " + totalpersonasporchocos + " en el restaurante\n");
		}
		else {
			System.out.print("Se pueden servir a un total de " + totalpersonasporpapas + " en el restaurante\n");
		}
		return 5;
	}

	public void showChocos() {
		System.out.print("Quedan " + getKiloChocos() + "kilos de chocos.");
	}

	public void showPapas() {
		System.out.print("Quedan " + getKiloPapas() + "kilos de papas.");
	}

	public Provisiones(float kiloPapas, float kiloChocos) {
		super();
		this.kiloPapas = kiloPapas;
		this.kiloChocos = kiloChocos;
	}

	public float getKiloPapas() {
		return kiloPapas;
	}

	public void setKiloPapas(float kiloPapas) {
		this.kiloPapas = kiloPapas;
	}

	public float getKiloChocos() {
		return kiloChocos;
	}

	public void setKiloChocos(float kiloChocos) {
		this.kiloChocos = kiloChocos;
	}

}
