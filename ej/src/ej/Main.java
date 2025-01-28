package ej;

public class Main {

	public static void main(String[] args) {
		IBloc unBlocMur = new Mur(10,10,5,true);
		IBloc unBlocPorte = new Porte(1, 1, 1, false);
		
		unBlocMur.afficherDescription();
		unBlocPorte.afficherDescription();
		
	}

}
