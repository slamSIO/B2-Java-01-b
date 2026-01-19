public class Iterations {

	public static void main( String[] args ){
		
		int numLecteur ;
		
		System.out.println( "Saisir le nombre de lecteurs :" ) ;
		
		int nbLecteurs = Clavier.lireEntier() ;
		
		System.out.println( "-----------------------------------" ) ;
		System.out.println( "Boucle while :\n" ) ;
		
		numLecteur =  1 ;
		
		while( numLecteur <= nbLecteurs ){
			
			System.out.println( "\tLecteur numéro " + numLecteur ) ;
			
			numLecteur += 1 ;
		}
		
		System.out.println( "\n\n-----------------------------------" ) ;
		System.out.println( "Boucle do...while :\n" ) ;
		
		numLecteur =  1 ;
		
		do {
			System.out.println( "\tLecteur numéro " + numLecteur ) ;
			
			numLecteur += 1 ;
			
		} while( numLecteur <= nbLecteurs ) ;
		

	}

}
