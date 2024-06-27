package org.lessons.java.animals;

public class Aquila extends Animale implements Volante{
	
	//costruttore
	public Aquila(String name) {
		super(name);
	}

	//metodi ereditati dalla classe padre (Animale)
	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + ": Screeeeech!");
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println(this.getName() + ": Mmm... coniglietti");
	}

	@Override
	public void vola() {
			System.out.println(this.getName() + ": Sto volando velocissimo!");
		}

}
