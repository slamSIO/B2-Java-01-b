public class Incrementations {

	public static void main( String[] args ){
		
		int nbLecteursInitial ;
		int nbLecteursFinal ;
		
		System.out.println( "Saisir le nombre de lecteurs : " ) ;
		
		int nbLecteurs = Clavier.lireEntier() ;
		
		
		System.out.println( "-----------------------------------" ) ;
		System.out.println( "POST-Incrémation :\n" ) ;
		
		nbLecteursInitial = nbLecteurs ;
		
		nbLecteursFinal = nbLecteursInitial++ ;
		
		System.out.println( "Nb Lecteurs Initial : " + nbLecteursInitial + "\t\tNb Lecteurs Final : " + nbLecteursFinal ) ;
		
		
		
		System.out.println( "-----------------------------------" ) ;
		System.out.println( "PRÉ-Incrémation :\n" ) ;
		
		nbLecteursInitial = nbLecteurs ;
		
		nbLecteursFinal = ++nbLecteursInitial ;
		
		System.out.println( "Nb Lecteurs Initial : " + nbLecteursInitial + "\t\tNb Lecteurs Final : " + nbLecteursFinal ) ;
		
	}

}
