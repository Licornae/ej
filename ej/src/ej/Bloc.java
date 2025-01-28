package ej;

public class Bloc {
	
<<<<<<< HEAD
	private int longueur;
	private int largeur;
	private int hauteur;
	
	public Bloc(int longueur, int largeur, int hauteur) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	
	public int getLongueur() {
		return longueur;
	}
	
	public int getLargeur() {
		return largeur;
	}
	
	public int getHauteur() {
		return hauteur;
=======
	String description;
	
	Bloc(){
		this.description = "Ceci est un bloc du jeu Epicraft's Journey";
	}
	
	void afficherDescription() {
		System.out.println(description);
>>>>>>> parent of abc1c28 (Le principe d'encapsulation)
	}

}
