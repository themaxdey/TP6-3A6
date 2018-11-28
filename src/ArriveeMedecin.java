/**
 * Auteurs : TODO et Soti
 * Fichier : ArriveeMedecin.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonnière)
 * Date    : 28 novembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe ArriveeMedecin permet de gérer les ajouts de médecins dans la
 * clinique.
 */

public class ArriveeMedecin implements OutilsConstantes {
	/**
	 * Le constructeur ArriveeMedecin() permet de gérer les ajouts de médecins
	 * dans la clinique.
	 * 
	 * @param clinique
	 *            La clinique.
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
			 * TODO (À COMPLÉTER). 
			 * 
			 * Voir page 10 de l'énoncé du TP6.
			 */


			rep = OutilsLecture.lireOuiNon( AUTRE_AJOUT );
		} while ( rep == OUI );
	}
}