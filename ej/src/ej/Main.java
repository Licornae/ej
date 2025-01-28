package ej;

public class Main {
	
	public static void main(String[] args) {  
		Bloc unBlocMur = new Mur(10,10,5,true);
		//unBlocMur.afficherBloc(); //comme typé par Bloc non accès à afficherBloc présent dans Mur
		
		unBlocMur.afficheUneDescription();
	}
	
}
