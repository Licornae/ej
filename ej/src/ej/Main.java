package ej;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Affichage des 20 langages informatiques les plus populaires en avril 2024"
				+ " du plus utilisé au moins utilisé.\n");
		
		List<String> nomsDesLangages = Arrays.asList("Python", "C", "C++",
				"Java","C#", "JavaScript","Go", "Visual Basic",
				"SQL", "Fortran", "Delphi/Object Pascal",
				"Assembly language", "Ruby", "Swift", "Scratch",
				"MATLAB", "PHP", "Kotlin", "Rust", "R"
				);
		
		for(String nomDUnLangage : nomsDesLangages) {
			String resultat = nomDUnLangage.toUpperCase();
			System.out.println(resultat);
		}
		
		
	}
	
}
