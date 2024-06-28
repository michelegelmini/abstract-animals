package org.lessons.java.animals;

public abstract class Animale {
	
	private String name;
	
	//costruttori
	public Animale(String name) {
		this.name = name;
	}
	
	//metodi
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public void dormi() {
		System.out.println(this.getName() + ": Zzz");
		}
	
	public abstract void verso();

	public abstract void mangia();

	
	
}
