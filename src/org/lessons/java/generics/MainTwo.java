package org.lessons.java.generics;

import org.lessons.java.animals.*;

import java.util.*;

public class MainTwo {

	public static void main(String[] args) {
		
		/*
		le collections sono strutture dati dinamiche
		java collections framework è composto da interfacce, implementazioni(classi concrete), algoritmi
		
		la collection è il contenitore generico più astratto, l'interfaccia generale, hai dei metodi per le operazioni basilari
		quanto è grande, se è vuota, aggiungere o rimuovere elementi, sapere se contiene un elemento specifico o alcuni, iterare sugli elementi
		
		un SET è un insieme di dati che non possono essere mai duplicati
		è dinamico ma devono essere tutti elementi unici (anche un eventuale null, deve essere solo eventualmente). L'orinde di inserimento non è rilevante
		
		una LIST può contenere duplicati ma ha le informazioni dell'ordine di inserimento, posso accedere agli elementi sulla base della loro posizione
		oltre ai metodi di collection si può accedere ad un elemento e riceverlo sulla base della sua posizione

		MAP ci permette di avere delle coppie chiave-valore, ad esempio una coppia coordinata-cosac'è a quella coordinata
		ogni coppia è unica.
		è possibile ricercare sulla base della chiave
		è possibile chiedere se c'è una chiave o un valore dentro la lista
		aggiungere/togliere/sostituire un elemento (coppia-chiave-valore)
		
		Un contenitore può contenere solo oggetti di un determinato tipo

*/
	
		HashSet<String> mySet = new HashSet<String>(); //un set di stringhe
		mySet.add("MadonnaT");
		mySet.add("MadonnaTwo");
		mySet.add("MadonnaTreeeee");
	
		System.out.println(mySet);
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("gino");
		strings.add("culo");
		strings.add("dario");
		strings.add("volgkso");
		
	
		
		for(int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i));
	}
	
		
		HashMap<String, String> stringMaps = new HashMap<String, String>();
		
		stringMaps.put("cane", "dio");
		System.out.println(stringMaps);
	}

}
