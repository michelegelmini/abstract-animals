package org.lessons.java.animals;

public class Cane extends Animale{
	
	//costruttore
	public Cane(String name) {
		super(name);
	}

	//metodi ereditati dalla classe padre (Animale)
	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + ": Bau Bau!");
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + ": Mmm... crocchette");
	}

}
