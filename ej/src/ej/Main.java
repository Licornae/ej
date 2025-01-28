package ej;

public class Main {
	
	public static void main(String[] args) {  
		Bloc unBloc = new Bloc("Ceci est un premier bloc.");
		unBloc.afficherDescription();
		Bloc unDeuxiemeBloc = new Bloc("Ceci est le deuxième bloc.");
		unDeuxiemeBloc.afficherDescription();
		
		unBloc.getDescription();
		unBloc.setDescription(null);
	}
	
}
