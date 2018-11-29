/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
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

		final String PATIENT_VACCINE = "\nCe patient a été vacciné.";

		final String DEVENU_VIDE = "\nImpossible d'effectuer d'autres"
						+ " vaccins, car il n'y a plus de patients dans "
						+ "la clinique.";

		final String AUTRE_VACCIN =	"\nVoulez-vous vacciner" 
						+ " un autre patient (O ou N) ? ";

		// Code du constructeur.

		char rep = NON;
		
		int indice;

		if ( clinique.getListeMedecins().obtenirNbTotalPatients() == 0 ) {
			System.out.println( AUCUN_PATIENT );
		} else {
			do {
				System.out.println( TITRE );
				
				ElementMedecin element = new ElementMedecin();
				
				element.getMedecin().lireNoMedecin();
				
				indice = clinique.getListeMedecins().obtenirIndice(element);
				
				if(indice < 0) {
					
					System.out.println("\nLe médecin numéro " + element.getMedecin().getNoMedecin() + " ne peut pas vacciner un patient, car il n'est pas dans la clinique.");
					
				}else {
					
					element = clinique.getListeMedecins().obtenirObjet(indice);
					
					if(element.getFilePatients().estVide()) {
						
						System.out.println("\nIl n'y aucun patient qui attend pour se faire vacciner par le médecin numéro " + element.getMedecin().getNoMedecin() + ".");
						
					}else{
						
						element.getFilePatients().retirerDebut();
						
						
						
						System.out.println(PATIENT_VACCINE);
						
					}
					
				}

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