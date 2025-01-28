package ej;

public interface IBloc {

	int MIN_LONGUEUR = 1;
	int MIN_LARGEUR = 1;
	int MIN_HAUTEUR = 1; //constantes Longueur, largeur et hauteur minimales
	
	public void afficherDescription(); //les classes qui utilisent cette interface devront fournir l'implémentation de cette méthode
									   //cela ne concerne pas les classes abstraites mais les classes filles
}
