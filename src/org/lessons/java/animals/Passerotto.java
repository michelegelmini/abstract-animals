package org.lessons.java.animals;

public class Passerotto extends Animale implements Volante {

	//costruttore
		public Passerotto(String name) {
			super(name);
		}

		//metodi ereditati dalla classe padre (Animale)
	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + ": Cip Cip!");
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + ": Mmm... semini!");
	}

	@Override
	public void vola() {
			System.out.println(this.getName() + ": Sto volando!");
		}


}
