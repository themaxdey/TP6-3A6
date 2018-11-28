/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
 * Fichier : ListeOrdonneeMedecin.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonnière)
 * Date    : 28 novembre 2018
 */

// Packages.

import java.util.*;

import outilsjava.*;

/**
 * La classe ListeOrdonneeMedecin permet de gérer une liste chaînée ordonnée de
 * médecins. Chaque élément de la liste chaînée est de type ElementMedecin. La
 * liste est en ordre des numéros de médecins. Cette classe hérite de la classe
 * ListeOrdonnee. Cette classe implémente l'interface OutilsConstantes.
 */

public class ListeOrdonneeMedecin<E> extends ListeOrdonnee<ElementMedecin>
		implements OutilsConstantes {

	/**
	 * Le constructeur ListeOrdonneeMedecin() permet de construire une liste
	 * chaînée ordonnée vide de ElementMedecin.
	 */

	public ListeOrdonneeMedecin() {
		
		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 5 de l'énoncé du TP6.
		 */

	}

	/**
	 * La méthode publique obtenirNbTotalPatients() permet de retourner le
	 * nombre total de patients de la liste ordonnée des médecins.
	 * 
	 * @return Le nombre total de patients.
	 */

	public int obtenirNbTotalPatients() {
		int nbTotalPatients = 0;

		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 5 de l'énoncé du TP6.
		 */

		return nbTotalPatients;
	}

	/**
	 * La méthode public chercherPatientListeMedecin() permet de chercher un
	 * patient dans la liste des médecins. Elle cherche dans la file d'attente
	 * de chaque élément de la liste des médecins.
	 * 
	 * @param patient
	 *            Le patient à chercher.
	 * @return true si le patient a été trouvé quelque part et false dans le cas
	 *         contraire.
	 */

	public boolean chercherPatientListeMedecin( Patient patient ) {
		boolean trouve = false;

		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 6 de l'énoncé du TP6.
		 */

		return trouve;
	}

	/**
	 * La méthode publique viderListeMedecins() permet pour chaque élément de la
	 * liste des médecins de retirer (vacciner) tous les patients un par un et
	 * ensuite de supprimer l'élément. Ce traitement est effectué à la fin de la
	 * journée.
	 */

	public void viderListeMedecins() {
		// Constantes de la méthode.
		
		final String MESS_PEUT_QUITTER = "\nCe médecin n'a plus de patients "
				+ "à vacciner. Ce médecin peut donc quitter la clinique.";

		final String MESS_DOIT_VACCINER = "\nCe médecin doit vacciner tous ses"
				+ " patients avant de quitter la clinique.";

		final String MESS_VACCINE = "\nCe patient a été vacciné.";

		// Code de la méthode.
		
		
		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir pages 6 et 7 de l'énoncé du TP6.
		 */
		
	}

	/**
	 * La méthode publique afficherListeMedecins() permet pour chaque élément de
	 * la liste, d'afficher les renseignements de cet élément.
	 */

	public void afficherListeMedecins() {
		// Constantes de la méthode.

		final String TITRE = "\nListe des médecins disponibles"
				+ " dans la clinique.";

		final String MESS_FIN_LISTE = "\nFin de la liste des médecins.";

		// Code du constructeur.
		
		
		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 8 de l'énoncé du TP6.
		 */
		
	}
}