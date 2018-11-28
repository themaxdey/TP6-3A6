/**
 * Auteurs : TODO et Soti
 * Fichier : DepartMedecin.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
 * Date    : 28 novembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe DepartMedecin permet de g�rer les d�parts de m�decins de la
 * clinique.
 */

public class DepartMedecin implements OutilsConstantes {
	/**
	 * Le constructeur DepartMedecin() permet de g�rer les d�parts de m�decins
	 * de la clinique.
	 * 
	 * @param clinique
	 *            La clinique.
	 */

	public DepartMedecin( Clinique clinique ) {
		// Constantes du constructeur.
		
		final String TITRE = "\nD�part d'un m�decin.\n";

		final String AUCUN_MEDECIN = "\nErreur, impossible d'effectuer le "
				+ "d�part d'un m�decin, car il n'y a pas de m�decin dans "
				+ "la clinique.";

		final String MEDECIN_QUITTE = "\nCe m�decin a quitt� la clinique.";

		final String DEVENU_VIDE = "\nImpossible d'effectuer d'autres"
				+ " d�parts de m�decins, car il n'y a plus de m�decins"
				+ " dans la clinique.";

		final String AUTRE_DEPART = "\nVoulez-vous effectuer "
				+ "le d�part d'un autre m�decin (O ou N) ? ";

		// Code du constructeur.

		char rep = NON;

		if ( clinique.getListeMedecins().estVide() ) {
			System.out.println( AUCUN_MEDECIN );
		} else {
			do {
				System.out.println( TITRE );


				/**
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 11 de l'�nonc� du TP6.
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