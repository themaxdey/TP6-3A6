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
		
		final String TITRE = "\nArrivée d'un patient.\n";

		final String AUCUN_MEDECIN = "\nErreur, impossible d'ajouter "
				+ "un patient, car il n'y a pas de médecin de disponible.";

		final String AUTRE_AJOUT = "\nVoulez-vous ajouter "
				+ "un autre patient (O ou N) ? ";

		// Code du constructeur.

		char rep = NON;
		
		int indice;

		if ( clinique.getListeMedecins().estVide() ) {
			System.out.println( AUCUN_MEDECIN );
		} else {
			do {
				System.out.println( TITRE );
				
				ElementMedecin element = new ElementMedecin();
				
				element.getMedecin().lireNoMedecin();
				
				indice = clinique.getListeMedecins().obtenirIndice(element);
				
				if(indice < 0) {
					
					System.out.println("\nLe médecin du patient, numéro " + element.getMedecin().getNoMedecin() + ", n'est pas encore arrivé.");
					
				}else {
					
					Patient patient = new Patient();
					
					patient.lireNoAssMaladie();
					
					if(clinique.getListeMedecins().chercherPatientListeMedecin(patient)) {
						
						System.out.println("\nLe patient avec le numéro d'assurance maladie suivant: " + patient.getNoAssMaladie() + ", attend déjà pour se faire vacciner.");;
						
					}else {
						
						patient.lireAutresRenseignements();
						
						element = clinique.getListeMedecins().obtenirObjet(indice);
						
						element.getFilePatients().ajouterFin(patient);
						
						System.out.println("\nLe patient, " + patient.getNomPatient() + ", au numéro d'assurance maladie suivant: " + patient.getNoAssMaladie() + ", attend pour se faire vacciner.");
						
					}
					
				}

				rep = OutilsLecture.lireOuiNon( AUTRE_AJOUT );
			} while ( rep == OUI );
		}
	}
}