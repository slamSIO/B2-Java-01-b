public class ReponseIfElse {

	public static void main( String[] args ){
		
		char reponse ;
		String texteReponse ;
		
		System.out.println( "Saisir votre réponse :" ) ;
		
		reponse = Clavier.lireChaine().charAt( 0 ) ;
		
		
		if( reponse == 'o' || reponse == 'O' || reponse == 'y' || reponse == 'Y' ){
			
			texteReponse = "Oui" ;
		}		
		else if( reponse == 'n' || reponse == 'N' ){
			
			texteReponse = "Non" ;
		}
		else {
			
			texteReponse = "" ;
		}
		
		
		if( ! texteReponse.equals( "" ) ){
			
			System.out.println( "Votre réponse est " + texteReponse + "." ) ;
		}
		else {
			
			System.out.println( "Pas compris." ) ;
		}
		
	}

}
