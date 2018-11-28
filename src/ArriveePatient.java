/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
 * Fichier : ArriveePatient.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonnière)
 * Date    : 28 novembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe ArriveePatient permet de faire des ajouts de patients dans la
 * clinique.
 */

public class ArriveePatient implements OutilsConstantes {
	/**
	 * Le constructeur ArriveePatient() permet de gérer les arrivées de patients
	 * dans la clinique.
	 * 
	 * @param clinique
	 *            La clinique.
	 */

	public ArriveePatient( Clinique clinique ) {
		// Constantes du constructeur.
		
		final String TITRE = "\nArrivée d'un patient.\n";

		final String AUCUN_MEDECIN = "\nErreur, impossible d'ajouter "
				+ "un patient, car il n'y a pas de médecin de disponible.";

		final String AUTRE_AJOUT = "\nVoulez-vous ajouter "
				+ "un autre patient (O ou N) ? ";

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
				 * Voir page 12 de l'énoncé du TP6.
				 */


				rep = OutilsLecture.lireOuiNon( AUTRE_AJOUT );
			} while ( rep == OUI );
		}
	}
}