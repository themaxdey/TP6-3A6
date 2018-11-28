/**
 * Auteurs : Maxime Dery, Jean-S�bastien Beaulne et Soti
 * Fichier : ListeOrdonneeMedecin.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
 * Date    : 28 novembre 2018
 */

// Packages.

import java.util.*;

import outilsjava.*;

/**
 * La classe ListeOrdonneeMedecin permet de g�rer une liste cha�n�e ordonn�e de
 * m�decins. Chaque �l�ment de la liste cha�n�e est de type ElementMedecin. La
 * liste est en ordre des num�ros de m�decins. Cette classe h�rite de la classe
 * ListeOrdonnee. Cette classe impl�mente l'interface OutilsConstantes.
 */

public class ListeOrdonneeMedecin<E> extends ListeOrdonnee<ElementMedecin>
		implements OutilsConstantes {

	/**
	 * Le constructeur ListeOrdonneeMedecin() permet de construire une liste
	 * cha�n�e ordonn�e vide de ElementMedecin.
	 */

	public ListeOrdonneeMedecin() {
		
		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 5 de l'�nonc� du TP6.
		 */

	}

	/**
	 * La m�thode publique obtenirNbTotalPatients() permet de retourner le
	 * nombre total de patients de la liste ordonn�e des m�decins.
	 * 
	 * @return Le nombre total de patients.
	 */

	public int obtenirNbTotalPatients() {
		int nbTotalPatients = 0;

		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 5 de l'�nonc� du TP6.
		 */

		return nbTotalPatients;
	}

	/**
	 * La m�thode public chercherPatientListeMedecin() permet de chercher un
	 * patient dans la liste des m�decins. Elle cherche dans la file d'attente
	 * de chaque �l�ment de la liste des m�decins.
	 * 
	 * @param patient
	 *            Le patient � chercher.
	 * @return true si le patient a �t� trouv� quelque part et false dans le cas
	 *         contraire.
	 */

	public boolean chercherPatientListeMedecin( Patient patient ) {
		boolean trouve = false;

		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 6 de l'�nonc� du TP6.
		 */

		return trouve;
	}

	/**
	 * La m�thode publique viderListeMedecins() permet pour chaque �l�ment de la
	 * liste des m�decins de retirer (vacciner) tous les patients un par un et
	 * ensuite de supprimer l'�l�ment. Ce traitement est effectu� � la fin de la
	 * journ�e.
	 */

	public void viderListeMedecins() {
		// Constantes de la m�thode.
		
		final String MESS_PEUT_QUITTER = "\nCe m�decin n'a plus de patients "
				+ "� vacciner. Ce m�decin peut donc quitter la clinique.";

		final String MESS_DOIT_VACCINER = "\nCe m�decin doit vacciner tous ses"
				+ " patients avant de quitter la clinique.";

		final String MESS_VACCINE = "\nCe patient a �t� vaccin�.";

		// Code de la m�thode.
		
		
		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir pages 6 et 7 de l'�nonc� du TP6.
		 */
		
	}

	/**
	 * La m�thode publique afficherListeMedecins() permet pour chaque �l�ment de
	 * la liste, d'afficher les renseignements de cet �l�ment.
	 */

	public void afficherListeMedecins() {
		// Constantes de la m�thode.

		final String TITRE = "\nListe des m�decins disponibles"
				+ " dans la clinique.";

		final String MESS_FIN_LISTE = "\nFin de la liste des m�decins.";

		// Code du constructeur.
		
		
		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 8 de l'�nonc� du TP6.
		 */
		
	}
}