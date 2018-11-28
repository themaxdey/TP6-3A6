/**
 * Auteur  : Soti
 * Fichier : FileAttente.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
 * Date    : 28 novembre 2018
 */

// Packages.

import java.util.*;

/**
 * La classe FileAttente permet de g�rer une file d'attente.
 * Cette classe impl�mente l'interface Enfilage.
 * Comme vu en classe (Doc. 6, pages 12 et 13.
 */

public class FileAttente<E> implements Enfilage<E> {
	// La classe FileAttente est compos�e d'un objet LinkedList.

	private LinkedList<E> file;

	/**
	 * Le constructeur FileAttente() permet de construire une file d'attente
	 * vide.
	 */

	public FileAttente() {
		file = new LinkedList<E>();
	}

	/**
	 * La m�thode publique estVide() permet de v�rifier si la file est vide.
	 * 
	 * @return true si la file est vide et false dans le cas contraire.
	 */

	public boolean estVide() {
		return file.isEmpty();
	}

	/**
	 * La m�thode publique taille() permet de retourner le nombre d'�l�ments de
	 * la file.
	 * 
	 * @return Le nombre d'�l�ments de la file.
	 */

	public int taille() {
		return file.size();
	}

	/**
	 * La m�thode publique estPresent() permet de v�rifier si un �l�ment fait
	 * partie de la file d'attente.
	 * 
	 * @return true si un �l�ment fait partie de la file et false dans le cas
	 *         contraire.
	 */

	public boolean estPresent( E obj ) {
		return file.contains( obj );
	}

	/**
	 * La m�thode publique obtenirDebut() permet de retourner l'�l�ment qui est
	 * au d�but de la file. L'�l�ment n'est pas retir� de la file.
	 * 
	 * @return L'�l�ment qui est au d�but de la file.
	 */

	public E obtenirDebut() {
		return file.getFirst();
	}

	/**
	 * La m�thode publique ajouterFin() permet d'ajouter un �l�ment � la fin de
	 * la file d'attente.
	 * 
	 * @param obj
	 *            L'�l�ment � ajouter.
	 */

	public void ajouterFin( E obj ) {
		file.addLast( obj );
	}

	/**
	 * La m�thode publique retirerDebut() permet de retirer l'�l�ment qui est au
	 * d�but de la file d'attente.
	 * 
	 * @return L'�l�ment qui est au d�but de la file.
	 */

	public E retirerDebut() {
		return file.removeFirst();
	}

	/**
	 * La m�thode publique vider() permet de retirer tous les �l�ments de la
	 * file d'attente.
	 * 
	 */

	public void vider() {
		file.clear();
	}
}
