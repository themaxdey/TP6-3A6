/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
 * Fichier : ArriveeMedecin.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
 * Date    : 28 novembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe ArriveeMedecin permet de g�rer les ajouts de m�decins dans la
 * clinique.
 */

public class ArriveeMedecin implements OutilsConstantes {
	/**
	 * Le constructeur ArriveeMedecin() permet de g�rer les ajouts de m�decins
	 * dans la clinique.
	 * 
	 * @param clinique
	 *            La clinique.
	 *            
	 *
	 */

	public ArriveeMedecin( Clinique clinique ) {
		// Constantes du constructeur.
		
		final String TITRE = "\nArrivée d'un médecin.\n";

		final String AUTRE_AJOUT = "\nVoulez-vous ajouter "
				+ "un autre médecin (O ou N) ? ";

		// Code du constructeur.
		
		char rep = NON;

		do {
			System.out.println( TITRE );

			
			/**
			 * TODO (� COMPL�TER). 
			 * 
			 * Voir page 10 de l'�nonc� du TP6.
			 */


			rep = OutilsLecture.lireOuiNon( AUTRE_AJOUT );
		} while ( rep == OUI );
	}
}