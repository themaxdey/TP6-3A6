/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
 * Fichier : ArriveePatient.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
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
	 * Le constructeur ArriveePatient() permet de g�rer les arriv�es de patients
	 * dans la clinique.
	 * 
	 * @param clinique
	 *            La clinique.
	 */

	public ArriveePatient( Clinique clinique ) {
		// Constantes du constructeur.
		
		final String TITRE = "\nArriv�e d'un patient.\n";

		final String AUCUN_MEDECIN = "\nErreur, impossible d'ajouter "
				+ "un patient, car il n'y a pas de m�decin de disponible.";

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
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 12 de l'�nonc� du TP6.
				 */


				rep = OutilsLecture.lireOuiNon( AUTRE_AJOUT );
			} while ( rep == OUI );
		}
	}
}