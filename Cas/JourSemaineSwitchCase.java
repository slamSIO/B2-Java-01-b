public class JourSemaineSwitchCase {

	public static void main( String[] args ){
		
		int numeroJour ;
		String nomJour ;
		
		System.out.println( "Saisir le numéro du jour dans la semaine :" ) ;
		
		numeroJour = Clavier.lireEntier() ;
		
		
		switch( numeroJour ){
			
			case 1 :
					nomJour = "Lundi" ;
					break ;
					
			case 2 :
					nomJour = "Mardi" ;
					break ;
					
			case 3 :
					nomJour = "Mercredi" ;
					break ;
					
			case 4 :
					nomJour = "Jeudi" ;
					break ;
					
			case 5 :
					nomJour = "Vendredi" ;
					break ;
					
			case 6 :
					nomJour = "Samedi" ;
					break ;
					
			case 7 :
					nomJour = "Dimanche" ;
					break ;
					
			default :
					nomJour = "" ;
					
		}
		
		
		if( ! nomJour.equals( "" ) ){
			
			System.out.println( nomJour ) ;
		}
		else {
			
			System.out.println( "Numéro de jour incohérent." ) ;
		}
		
	}

}
