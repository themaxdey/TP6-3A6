/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
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
				 * 
				 * Voir page 11 de l'�nonc� du TP6.
				 */

				ElementMedecin element = new ElementMedecin();

				element.getMedecin().lireNoMedecin();

				int indice = clinique.getListeMedecins().obtenirIndice(element);

				if( indice < 0){
					System.out.println("\nLe médecin " + element.getMedecin().getNoMedecin() + "n'est pas présent dans la clinique.");
				} else {
					element = clinique.getListeMedecins().obtenirObjet(indice);

					if(!element.getFilePatients().estVide()){
						System.out.println("\nLe médecin " + element.getMedecin().getNoMedecin() + " ne peut pas encore quitter. Il lui reste encore des rendez-vous.");
					} else {
						clinique.getListeMedecins().supprimer(indice);

						element.afficherElementMedecin();

						System.out.println(MEDECIN_QUITTE);
					}
				}
				


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