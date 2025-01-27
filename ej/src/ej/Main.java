package ej;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		System.out.println("Indiquez un film je vous donne son genre : ");
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        String reponse;
			reponse = reader.readLine();
			System.out.println(categorieDeFilm(reponse));
		} catch (IOException e) {
			e.printStackTrace();
		}
        
	}
	
	public static String categorieDeFilm(final String film) {
		var resultat = switch(film) {
		case "Star Wars" -> "Science fiction";
		case "Blanche neige", "La petite sirène" -> "Disney";
		case "Indiana Jones" -> {
			String categorie = "Aventure";
			yield categorie;
		}
		default -> "Je ne sais pas.";
		};
		return resultat;
	}
	

}
