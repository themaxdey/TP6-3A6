/**
 * Auteur  : Soti
 * Fichier : FileAttente.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonnière)
 * Date    : 28 novembre 2018
 */

// Packages.

import java.util.*;

/**
 * La classe FileAttente permet de gérer une file d'attente.
 * Cette classe implémente l'interface Enfilage.
 * Comme vu en classe (Doc. 6, pages 12 et 13.
 */

public class FileAttente<E> implements Enfilage<E> {
	// La classe FileAttente est composée d'un objet LinkedList.

	private LinkedList<E> file;

	/**
	 * Le constructeur FileAttente() permet de construire une file d'attente
	 * vide.
	 */

	public FileAttente() {
		file = new LinkedList<E>();
	}

	/**
	 * La méthode publique estVide() permet de vérifier si la file est vide.
	 * 
	 * @return true si la file est vide et false dans le cas contraire.
	 */

	public boolean estVide() {
		return file.isEmpty();
	}

	/**
	 * La méthode publique taille() permet de retourner le nombre d'éléments de
	 * la file.
	 * 
	 * @return Le nombre d'éléments de la file.
	 */

	public int taille() {
		return file.size();
	}

	/**
	 * La méthode publique estPresent() permet de vérifier si un élément fait
	 * partie de la file d'attente.
	 * 
	 * @return true si un élément fait partie de la file et false dans le cas
	 *         contraire.
	 */

	public boolean estPresent( E obj ) {
		return file.contains( obj );
	}

	/**
	 * La méthode publique obtenirDebut() permet de retourner l'élément qui est
	 * au début de la file. L'élément n'est pas retiré de la file.
	 * 
	 * @return L'élément qui est au début de la file.
	 */

	public E obtenirDebut() {
		return file.getFirst();
	}

	/**
	 * La méthode publique ajouterFin() permet d'ajouter un élément à la fin de
	 * la file d'attente.
	 * 
	 * @param obj
	 *            L'élément à ajouter.
	 */

	public void ajouterFin( E obj ) {
		file.addLast( obj );
	}

	/**
	 * La méthode publique retirerDebut() permet de retirer l'élément qui est au
	 * début de la file d'attente.
	 * 
	 * @return L'élément qui est au début de la file.
	 */

	public E retirerDebut() {
		return file.removeFirst();
	}

	/**
	 * La méthode publique vider() permet de retirer tous les éléments de la
	 * file d'attente.
	 * 
	 */

	public void vider() {
		file.clear();
	}
}
