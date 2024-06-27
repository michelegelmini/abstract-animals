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
	
		Delfino Johnny = new Delfino("Johnny");
		Cane Bobby = new Cane("Bobby");
		Passerotto Jimmy = new Passerotto("Jimmy");
		Aquila Danny = new Aquila("Danny");
		Cane Burro = new Cane("Burro");
		
		
		faiNuotare(Johnny);
		faiVolare(Danny);
		
		Bobby.verso();
		
		Bobby.mangia();
		
		faiVolare(Jimmy);
		
		Burro.mangia();
		Burro.verso();
		Burro.dormi();
		
	}

}
