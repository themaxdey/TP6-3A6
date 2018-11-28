/**
 * Auteurs : TODO et Soti
 * Fichier : DepartMedecin.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonnière)
 * Date    : 28 novembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe DepartMedecin permet de gérer les départs de médecins de la
 * clinique.
 */

public class DepartMedecin implements OutilsConstantes {
	/**
	 * Le constructeur DepartMedecin() permet de gérer les départs de médecins
	 * de la clinique.
	 * 
	 * @param clinique
	 *            La clinique.
	 */

	public DepartMedecin( Clinique clinique ) {
		// Constantes du constructeur.
		
		final String TITRE = "\nDépart d'un médecin.\n";

		final String AUCUN_MEDECIN = "\nErreur, impossible d'effectuer le "
				+ "départ d'un médecin, car il n'y a pas de médecin dans "
				+ "la clinique.";

		final String MEDECIN_QUITTE = "\nCe médecin a quitté la clinique.";

		final String DEVENU_VIDE = "\nImpossible d'effectuer d'autres"
				+ " départs de médecins, car il n'y a plus de médecins"
				+ " dans la clinique.";

		final String AUTRE_DEPART = "\nVoulez-vous effectuer "
				+ "le départ d'un autre médecin (O ou N) ? ";

		// Code du constructeur.

		char rep = NON;

		if ( clinique.getListeMedecins().estVide() ) {
			System.out.println( AUCUN_MEDECIN );
		} else {
			do {
				System.out.println( TITRE );


				/**
				 * TODO (À COMPLÉTER). 
				 * 
				 * Voir page 11 de l'énoncé du TP6.
				 */


				if ( clinique.getListeMedecins().estVide() ) {
					System.out.println( DEVENU_VIDE );
					rep = NON;
				} else {
					rep = OutilsLecture.lireOuiNon( AUTRE_DEPART );
				}
			} while ( rep == OUI );
		}
	}
}