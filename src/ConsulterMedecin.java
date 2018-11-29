/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
 * Fichier : ConsulterMedecin.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
 * Date    : 28 novembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe ConsulterMedecin permet de g�rer les consultations de m�decins de
 * la clinique.
 */

public class ConsulterMedecin implements OutilsConstantes {
	/**
	 * Le constructeur ConsulterMedecin() permet de g�rer les consultations de
	 * m�decins de la clinique.
	 * 
	 * @param clinique
	 *            La clinique.
	 */

	public ConsulterMedecin( Clinique clinique ) {
		// Constantes du constructeur.
		
		final String TITRE = "\nConsultation d'un médecin.\n";

		final String AUCUN_MEDECIN = "\nErreur, impossible de consulter un "
				+ "médecin, car il n'y a pas de médecin dans la clinique.";

		final String AUTRE_CONSULTATION = "\nVoulez-vous consulter "
				+ "un autre médecin (O ou N) ? ";

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
					
					System.out.println("\nLe médecin numéro " + element.getMedecin().getNoMedecin() + " n'est pas dans la clinique.");
					
				}else {
					
					element = clinique.getListeMedecins().obtenirObjet(indice);
					
					element.afficherElementMedecin();
					
				}

				rep = OutilsLecture.lireOuiNon( AUTRE_CONSULTATION );
			} while ( rep == OUI );
		}
	}
}