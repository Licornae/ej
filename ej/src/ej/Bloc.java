package ej;

public class Bloc {
	
	protected int longueur;
	protected int largeur;
	protected int hauteur;
	
	public Bloc(int longueur, int largeur, int hauteur) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	
	public void afficheUneDescription() {
		System.out.println("Je suis un bloc !");
	}

}
