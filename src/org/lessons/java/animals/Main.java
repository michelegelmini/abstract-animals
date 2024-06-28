package org.lessons.java.animals;

public class Main {
	
	
	public static void faiVolare(Volante animale) {
		animale.vola();
	}
	
	public static void faiNuotare(Nuotante animale) {
		animale.nuota();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Delfino johnny = new Delfino("Johnny il delfino");
		Cane bobby = new Cane("Bobby il cane");
		Passerotto jimmy = new Passerotto("Jimmy il passerotto");
		Aquila danny = new Aquila("Danny l'aquila");
		Animale burro = new Cane("Burro il cane");
		Animale ciano = new Cane("ciano");
		
		
		ciano.mangia();
		
		faiNuotare(johnny);
		faiVolare(danny);
		
		bobby.verso();
		
		bobby.mangia();
		
		jimmy.mangia();
		
		burro.mangia();
		burro.verso();
		burro.dormi();
		
	}

}
