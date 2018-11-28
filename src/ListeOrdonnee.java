/**
 * Auteur  : Soti
 * Fichier : ListeOrdonnee.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonnière)
 * Date    : 28 novembre 2018
 */

// Packages.

import java.util.*;

/**
 * La classe ListeOrdonnee permet de gérer une liste chaînée ordonnée. Cette
 * classe est composée d'une LinkedList. 
 * Comme vu en classe (Doc. 4, pages 34 à 36).
 */

public class ListeOrdonnee<E extends Comparable<? super E>> {
	// La classe ListeOrdonnee est composée d'un objet LinkedList.

	private LinkedList<E> listeEnOrdre;

	/**
	 * Le constructeur ListeOrdonnee() permet de construire une liste chaînée
	 * ordonnée vide.
	 */

	public ListeOrdonnee() {
		this.listeEnOrdre = new LinkedList<E>();
	}

	/**
	 * La méthode publique estVide() permet de vérifier si la liste chaînée
	 * ordonnée est vide.
	 * 
	 * @return true si la liste ordonnée est vide et false dans le cas
	 *         contraire.
	 */

	public boolean estVide() {
		return this.listeEnOrdre.isEmpty();
	}

	/**
	 * La méthode publique taille() permet de retourner le nombre d'éléments de
	 * la liste chaînée ordonnée.
	 * 
	 * @return Le nombre d'éléments de la liste ordonnée.
	 */

	public int taille() {
		return this.listeEnOrdre.size();
	}

	/**
	 * La méthode publique obtenirDebut() permet de retourner l'élément qui est
	 * au début de la liste chaînée ordonnée. L'élément n'est pas retiré de la
	 * liste.
	 * 
	 * @return L'élément qui est au début de la liste ordonnée.
	 */

	public E obtenirDebut() {
		return this.listeEnOrdre.getFirst();
	}

	/**
	 * La méthode publique obtenirFin() permet de retourner l'élément qui est à
	 * la fin de la liste chaînée ordonnée. L'élément n'est pas retiré de la
	 * liste.
	 * 
	 * @return L'élément qui est à la fin de la liste ordonnée.
	 */

	public E obtenirFin() {
		return this.listeEnOrdre.getLast();
	}

	/**
	 * La méthode publique estPresent() permet de chercher un élément dans la
	 * liste chaînée ordonnée.
	 * 
	 * @param obj
	 *            L'élément à chercher.
	 * @return true si l'élément fait partie de la liste ordonnée et false dans
	 *         le cas contraire.
	 */

	public boolean estPresent( E obj ) {
		return this.listeEnOrdre.contains( obj );
	}

	/**
	 * La méthode publique obtenirIndice() retourne l'indice d'un élément si
	 * celui-ci fait partie de la liste chaînée ordonnée et une valeur négative
	 * si l'élément ne fait pas partie de la liste. Les indices de la liste
	 * débutent à 0.
	 * 
	 * @param obj
	 *            L'élément à chercher.
	 * @return L'indice de l'élément s'il fait partie de la liste ordonnée et
	 *         une valeur négative (<0) s'il ne fait pas partie de la liste
	 *         ordonnée.
	 */

	public int obtenirIndice( E obj ) {
		return Collections.binarySearch( this.listeEnOrdre, obj );
	}

	/**
	 * La méthode publique obtenirObjet() retourne l'élément qui est à un
	 * certain indice dans la liste et la valeur null si l'indice ne fait pas
	 * partie des limites de la liste. Les indices de la liste débutent à 0.
	 * 
	 * @param indice
	 *            L'indice de l'élément.
	 * @return L'élément qui est à l'indice indiqué et null si l'indice ne fait
	 *         pas partie des limites de la liste.
	 */

	public E obtenirObjet( int indice ) {
		E obj = null;

		if ( indice >= 0 && indice < this.taille() ) {
			obj = this.listeEnOrdre.get( indice );
		}

		return obj;
	}

	/**
	 * La méthode publique supprimerDebut() permet de supprimer le premier
	 * élément de la liste chaînée ordonnée.
	 * 
	 * @return Le premier élément de la liste ordonnée.
	 */

	public E supprimerDebut() {
		return this.listeEnOrdre.removeFirst();
	}

	/**
	 * La méthode publique supprimerFin() permet de supprimer le dernier élément
	 * de la liste chaînée ordonnée.
	 * 
	 * @return Le dernier élément de la liste ordonnée.
	 */

	public E supprimerFin() {
		return this.listeEnOrdre.removeLast();
	}

	/**
	 * La méthode publique ajouter() permet d'ajouter un élément dans la liste
	 * chaînée ordonnée. L'ordre de tri est conservé.
	 * 
	 * @param obj
	 *            L'élément à ajouter.
	 * @return true si la liste chaînée a été modifiée et false dans le cas
	 *         contraire.
	 */

	public boolean ajouter( E obj ) {
		int indTrouve;
		boolean modif = false;

		indTrouve = Collections.binarySearch( this.listeEnOrdre, obj );

		if ( indTrouve < 0 ) { // pas deux objets avec même clé.
			modif = true;

			int indInsertion = -indTrouve - 1;

			this.listeEnOrdre.add( indInsertion, obj );
		}

		return modif;
	}

	/**
	 * La méthode publique supprimer() permet de supprimer un élément dans la
	 * liste chaînée ordonnée. L'ordre de tri est conservé.
	 * 
	 * @param obj
	 *            L'objet à supprimer.
	 * @return true si la liste chaînée contient l'objet et false dans le cas
	 *         contraire.
	 */

	public boolean supprimer( E obj ) {
		return this.listeEnOrdre.remove( obj );
	}

	/**
	 * La méthode publique supprimer() permet de supprimer un élément dans la
	 * liste chaînée ordonnée qui est à un certain indice. L'ordre de tri est
	 * conservé. Les indices débutent à 0.
	 * 
	 * @param indice
	 *            L'indice de l'élément à supprimer.
	 * @return L'élément supprimé et null si l'indice ne fait pas partie des
	 *         limites de la liste ordonnée.
	 */

	public E supprimer( int indice ) {
		E obj = null;

		if ( indice >= 0 && indice < this.taille() ) {
			obj = this.listeEnOrdre.remove( indice );
		}

		return obj;
	}

	/**
	 * La méthode publique vider() permet de supprimer tous les éléments de la
	 * liste chaînée ordonnée.
	 */

	public void vider() {
		this.listeEnOrdre.clear();
	}

	/**
	 * La méthode publique listIterateur() permet de retourner un itérateur pour
	 * se promener dans la liste.
	 * 
	 * @return L'itérateur.
	 */

	public ListIterator<E> listeIterateur() {
		return this.listeEnOrdre.listIterator();
	}
}
