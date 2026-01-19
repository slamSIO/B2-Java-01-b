public class JourSemaineIfElse {

	public static void main( String[] args ){
		
		int numeroJour ;
		String nomJour ;
		
		System.out.println( "Saisir le numéro du jour dans la semaine :" ) ;
		
		numeroJour = Clavier.lireEntier() ;
		
		
		if( numeroJour == 1 ){
			
			nomJour = "Lundi" ;
		}
		else if( numeroJour == 2 ){
			
			nomJour = "Mardi" ;
		}
		else if( numeroJour == 3 ){
			
			nomJour = "Mercredi" ;
		}
		else if( numeroJour == 4 ){
			
			nomJour = "Jeudi" ;
		}
		else if( numeroJour == 5 ){
			
			nomJour = "Vendredi" ;
		}
		else if( numeroJour == 6 ){
			
			nomJour = "Samedi" ;
		}
		else if( numeroJour == 7 ){
			
			nomJour = "Dimanche" ;
		}
		else {
			
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
