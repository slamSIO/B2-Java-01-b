public class FormulesAbonnementIfElse {

	public static void main( String[] args ){
		
		char formule ;
		double montant ;
		
		System.out.println( "Saisir le nom de la formule choisie :" ) ;
		
		formule = Clavier.lireChaine().charAt( 0 ) ;
		
		
		if( formule == 'A' ){
			
			montant = 29.99 ;
		}
		else if( formule == 'B' ){
			
			montant = 19.99 ;
		}
		else if( formule == 'C' ){
			
			montant = 9.99 ;
		}
		else {
			
			montant = -1 ;
		}
		
		
		if( montant >= 0.0 ){
			
			System.out.println( montant + " € par mois pour la formule " + formule ) ;
		}
		else {
			
			System.out.println( "Formule inconnue." ) ;
		}
		
	}

}
