package ej;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		System.out.println("Indiquez la météo (soleil, nuage ou pluie) : ");
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String reponse;
			reponse = reader.readLine();
	        commenteLaMeteo(reponse);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
	}
	
	public static void commenteLaMeteo(final String meteo) {
		switch(meteo) {
		case "soleil" -> System.out.println("Beau temps");
		case "nuage" -> System.out.println("Couvert");
		case "pluie" -> System.out.println("Mauvais temps");
		default -> System.out.println("Je ne sais pas.");
		}
	}
	

}
