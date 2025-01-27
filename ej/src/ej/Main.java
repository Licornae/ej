package ej;

public class Main {
	
	public static void main(String[] args) {  //Compter le nombre de 0 présents dans le tableau
		
		int[] unTableauDEntier = {26, 0, 1985, 0, 12, 11, 1955, 0, 0};
		int cpt = 0;
		
		for(int i = 0; i <= unTableauDEntier.length -1; i++) {
			if (unTableauDEntier[i] == 0) {	
				cpt ++;
			}		
		}

		System.out.println(cpt);
		
	}
	
}
