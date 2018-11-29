/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
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
	 *            
	 *
	 */

	public ArriveeMedecin( Clinique clinique ) {
		// Constantes du constructeur.
		
		final String TITRE = "\nArrivée d'un médecin.\n";

		final String AUTRE_AJOUT = "\nVoulez-vous ajouter "
				+ "un autre médecin (O ou N) ? ";

		// Code du constructeur.
		
		char rep = NON;
		
		int indice;

		do {
			System.out.println( TITRE );
			
			ElementMedecin element = new ElementMedecin();
			
			element.getMedecin().lireNoMedecin();
			
			indice = clinique.getListeMedecins().obtenirIndice(element);
			
			if(indice >= 0) {
				
				System.out.println("\nLe médecin numéro " + element.getMedecin().getNoMedecin() + " est déjà dans la clinique.");
				
			}else {
				
				element.getMedecin().lireAutresRenseignements();
				
				clinique.getListeMedecins().ajouter(element);
				
				System.out.println("\nLe médecin numéro " + element.getMedecin().getNoMedecin() + " à été ajouté.");
				
			}
			rep = OutilsLecture.lireOuiNon( AUTRE_AJOUT );
		} while ( rep == OUI );
	}
}