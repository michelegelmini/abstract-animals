package org.lessons.java.animals;

public class Delfino extends Animale implements Nuotante{
	
	//costruttore
	public Delfino(String name) {
		super(name);
	}

	//metodi ereditati dalla classe padre (Animale)
	
	@Override
	public void dormi() {
		super.dormi();
		System.out.println(this.getName() + ": blublublu");
	}
	
	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + ": Eie-eeee-eeeeeeeeeeeheee");
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + ": Mmm... plankton");
	}

	@Override
	public void nuota() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + ": Sto nuotando!");
	}

}
