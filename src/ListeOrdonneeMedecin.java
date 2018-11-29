/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
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
		
		super();

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
		
		ElementMedecin element;
		
		if(!super.estVide()) {
			
			ListIterator<ElementMedecin> iterateurTemp = super.listeIterateur();
			
			while(iterateurTemp.hasNext()) {
				
				element = iterateurTemp.next();
				
				nbTotalPatients += element.getFilePatients().taille();
				
			}
			
		}

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
		
		ElementMedecin element;
		
		if(!super.estVide()) {
			
			ListIterator<ElementMedecin> iterateurTemp = super.listeIterateur();
			
			while(iterateurTemp.hasNext() && !trouve) {
				
				element = iterateurTemp.next();
				
				if(element.getFilePatients().estPresent(patient)) {
					
					trouve = true;
					
				}
				
			}
			
		}

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
		
		final String MESS_PEUT_QUITTER = "\nCe médecin n'a plus de patients "
				+ "à vacciner. Ce médecin peut donc quitter la clinique.";

		final String MESS_DOIT_VACCINER = "\nCe médecin doit vacciner tous ses"
				+ " patients avant de quitter la clinique.";

		final String MESS_VACCINE = "\nCe patient a été vacciné.";

		// Code de la m�thode.
		
		
		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir pages 6 et 7 de l'�nonc� du TP6.
		 */
		
		ElementMedecin element;
		Patient patient;
		
		if(!super.estVide()) {
			
			ListIterator<ElementMedecin> iterateurTemp = super.listeIterateur();
			
			while(iterateurTemp.hasNext()) {
				
				element = iterateurTemp.next();
				
				if(element.getFilePatients().estVide()) {
					
					element.afficherElementMedecin();
					
					iterateurTemp.remove();
					
					System.out.println(MESS_PEUT_QUITTER);
					
					OutilsLecture.lireEntree(QUEST_CONTINUER);
					
				}
				
			}
			
			iterateurTemp = super.listeIterateur();
			
			while(iterateurTemp.hasNext()) {
				
				element = iterateurTemp.next();
				
				if(!element.getFilePatients().estVide()) {
					
					element.afficherElementMedecin();
					
					System.out.println(MESS_DOIT_VACCINER);
					
					while(!element.getFilePatients().estVide()) {
						
						patient = element.getFilePatients().retirerDebut();
						
						patient.afficherPatient();
						
						System.out.println(MESS_VACCINE);
						
						OutilsLecture.lireEntree(QUEST_CONTINUER);
						
					}
					
					element.afficherElementMedecin();
					
				}
				
				iterateurTemp.remove();
				
				System.out.println(MESS_PEUT_QUITTER);
				
				OutilsLecture.lireEntree(QUEST_CONTINUER);
				
			}
			
		}
		
	}

	/**
	 * La m�thode publique afficherListeMedecins() permet pour chaque �l�ment de
	 * la liste, d'afficher les renseignements de cet �l�ment.
	 */

	public void afficherListeMedecins() {
		// Constantes de la m�thode.

		final String TITRE = "\nListe des médecins disponibles"
				+ " dans la clinique.";

		final String MESS_FIN_LISTE = "\nFin de la liste des médecins.";

		// Code du constructeur.
		
		
		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 8 de l'�nonc� du TP6.
		 */
		
		ElementMedecin element;
		
		if(!super.estVide()) {
			
			ListIterator<ElementMedecin> iterateurTemp = super.listeIterateur();
			
			System.out.println(TITRE);
			
			while(iterateurTemp.hasNext()) {
				
				element = iterateurTemp.next();
				
				element.afficherElementMedecin();
				
				OutilsLecture.lireEntree(QUEST_CONTINUER);
				
			}
			
			System.out.println(MESS_FIN_LISTE);
			
		}
		
	}
}