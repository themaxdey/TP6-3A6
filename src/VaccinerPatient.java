/**
 * Auteurs : Maxime Dery, Jean-S�bastien Beaulne et Soti
 * Fichier : VaccinerPatient.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
 * Date    : 28 novembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe VaccinerPatient permet de vacciner des patients de la clinique. Le
 * patient quitte la clinique apr�s son vaccin.
 */

public class VaccinerPatient implements OutilsConstantes {
	/**
	 * Le constructeur VaccinerPatient() permet de g�rer les vaccins de patients
	 * de la clinique.
	 * 
	 * @param clinique
	 *            La clinique.
	 */

	public VaccinerPatient( Clinique clinique ) {
		// Constantes du constructeur.
		
		final String TITRE = "\nVacciner un patient.\n";

		final String AUCUN_PATIENT = "\nErreur, impossible de vacciner un "
						+ "patient, car il n'y a pas de patient dans "
						+ "la clinique.";

		final String PATIENT_VACCINE = "\nCe patient a �t� vaccin�.";

		final String DEVENU_VIDE = "\nImpossible d'effectuer d'autres"
						+ " vaccins, car il n'y a plus de patients dans "
						+ "la clinique.";

		final String AUTRE_VACCIN =	"\nVoulez-vous vacciner" 
						+ " un autre patient (O ou N) ? ";

		// Code du constructeur.

		char rep = NON;

		if ( clinique.getListeMedecins().obtenirNbTotalPatients() == 0 ) {
			System.out.println( AUCUN_PATIENT );
		} else {
			do {
				System.out.println( TITRE );

				
				/**
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 13 de l'�nonc� du TP6.
				 */


				if ( clinique.getListeMedecins()
						.obtenirNbTotalPatients() == 0 ) {
					
					System.out.println( DEVENU_VIDE );
					rep = NON;
				} else {
					rep = OutilsLecture.lireOuiNon( AUTRE_VACCIN );
				}
			} while ( rep == OUI );
		}
	}
}