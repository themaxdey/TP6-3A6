/**
 * Auteur  : Soti
 * Fichier : ListeOrdonnee.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
 * Date    : 28 novembre 2018
 */

// Packages.

import java.util.*;

/**
 * La classe ListeOrdonnee permet de g�rer une liste cha�n�e ordonn�e. Cette
 * classe est compos�e d'une LinkedList. 
 * Comme vu en classe (Doc. 4, pages 34 � 36).
 */

public class ListeOrdonnee<E extends Comparable<? super E>> {
	// La classe ListeOrdonnee est compos�e d'un objet LinkedList.

	private LinkedList<E> listeEnOrdre;

	/**
	 * Le constructeur ListeOrdonnee() permet de construire une liste cha�n�e
	 * ordonn�e vide.
	 */

	public ListeOrdonnee() {
		this.listeEnOrdre = new LinkedList<E>();
	}

	/**
	 * La m�thode publique estVide() permet de v�rifier si la liste cha�n�e
	 * ordonn�e est vide.
	 * 
	 * @return true si la liste ordonn�e est vide et false dans le cas
	 *         contraire.
	 */

	public boolean estVide() {
		return this.listeEnOrdre.isEmpty();
	}

	/**
	 * La m�thode publique taille() permet de retourner le nombre d'�l�ments de
	 * la liste cha�n�e ordonn�e.
	 * 
	 * @return Le nombre d'�l�ments de la liste ordonn�e.
	 */

	public int taille() {
		return this.listeEnOrdre.size();
	}

	/**
	 * La m�thode publique obtenirDebut() permet de retourner l'�l�ment qui est
	 * au d�but de la liste cha�n�e ordonn�e. L'�l�ment n'est pas retir� de la
	 * liste.
	 * 
	 * @return L'�l�ment qui est au d�but de la liste ordonn�e.
	 */

	public E obtenirDebut() {
		return this.listeEnOrdre.getFirst();
	}

	/**
	 * La m�thode publique obtenirFin() permet de retourner l'�l�ment qui est �
	 * la fin de la liste cha�n�e ordonn�e. L'�l�ment n'est pas retir� de la
	 * liste.
	 * 
	 * @return L'�l�ment qui est � la fin de la liste ordonn�e.
	 */

	public E obtenirFin() {
		return this.listeEnOrdre.getLast();
	}

	/**
	 * La m�thode publique estPresent() permet de chercher un �l�ment dans la
	 * liste cha�n�e ordonn�e.
	 * 
	 * @param obj
	 *            L'�l�ment � chercher.
	 * @return true si l'�l�ment fait partie de la liste ordonn�e et false dans
	 *         le cas contraire.
	 */

	public boolean estPresent( E obj ) {
		return this.listeEnOrdre.contains( obj );
	}

	/**
	 * La m�thode publique obtenirIndice() retourne l'indice d'un �l�ment si
	 * celui-ci fait partie de la liste cha�n�e ordonn�e et une valeur n�gative
	 * si l'�l�ment ne fait pas partie de la liste. Les indices de la liste
	 * d�butent � 0.
	 * 
	 * @param obj
	 *            L'�l�ment � chercher.
	 * @return L'indice de l'�l�ment s'il fait partie de la liste ordonn�e et
	 *         une valeur n�gative (<0) s'il ne fait pas partie de la liste
	 *         ordonn�e.
	 */

	public int obtenirIndice( E obj ) {
		return Collections.binarySearch( this.listeEnOrdre, obj );
	}

	/**
	 * La m�thode publique obtenirObjet() retourne l'�l�ment qui est � un
	 * certain indice dans la liste et la valeur null si l'indice ne fait pas
	 * partie des limites de la liste. Les indices de la liste d�butent � 0.
	 * 
	 * @param indice
	 *            L'indice de l'�l�ment.
	 * @return L'�l�ment qui est � l'indice indiqu� et null si l'indice ne fait
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
	 * La m�thode publique supprimerDebut() permet de supprimer le premier
	 * �l�ment de la liste cha�n�e ordonn�e.
	 * 
	 * @return Le premier �l�ment de la liste ordonn�e.
	 */

	public E supprimerDebut() {
		return this.listeEnOrdre.removeFirst();
	}

	/**
	 * La m�thode publique supprimerFin() permet de supprimer le dernier �l�ment
	 * de la liste cha�n�e ordonn�e.
	 * 
	 * @return Le dernier �l�ment de la liste ordonn�e.
	 */

	public E supprimerFin() {
		return this.listeEnOrdre.removeLast();
	}

	/**
	 * La m�thode publique ajouter() permet d'ajouter un �l�ment dans la liste
	 * cha�n�e ordonn�e. L'ordre de tri est conserv�.
	 * 
	 * @param obj
	 *            L'�l�ment � ajouter.
	 * @return true si la liste cha�n�e a �t� modifi�e et false dans le cas
	 *         contraire.
	 */

	public boolean ajouter( E obj ) {
		int indTrouve;
		boolean modif = false;

		indTrouve = Collections.binarySearch( this.listeEnOrdre, obj );

		if ( indTrouve < 0 ) { // pas deux objets avec m�me cl�.
			modif = true;

			int indInsertion = -indTrouve - 1;

			this.listeEnOrdre.add( indInsertion, obj );
		}

		return modif;
	}

	/**
	 * La m�thode publique supprimer() permet de supprimer un �l�ment dans la
	 * liste cha�n�e ordonn�e. L'ordre de tri est conserv�.
	 * 
	 * @param obj
	 *            L'objet � supprimer.
	 * @return true si la liste cha�n�e contient l'objet et false dans le cas
	 *         contraire.
	 */

	public boolean supprimer( E obj ) {
		return this.listeEnOrdre.remove( obj );
	}

	/**
	 * La m�thode publique supprimer() permet de supprimer un �l�ment dans la
	 * liste cha�n�e ordonn�e qui est � un certain indice. L'ordre de tri est
	 * conserv�. Les indices d�butent � 0.
	 * 
	 * @param indice
	 *            L'indice de l'�l�ment � supprimer.
	 * @return L'�l�ment supprim� et null si l'indice ne fait pas partie des
	 *         limites de la liste ordonn�e.
	 */

	public E supprimer( int indice ) {
		E obj = null;

		if ( indice >= 0 && indice < this.taille() ) {
			obj = this.listeEnOrdre.remove( indice );
		}

		return obj;
	}

	/**
	 * La m�thode publique vider() permet de supprimer tous les �l�ments de la
	 * liste cha�n�e ordonn�e.
	 */

	public void vider() {
		this.listeEnOrdre.clear();
	}

	/**
	 * La m�thode publique listIterateur() permet de retourner un it�rateur pour
	 * se promener dans la liste.
	 * 
	 * @return L'it�rateur.
	 */

	public ListIterator<E> listeIterateur() {
		return this.listeEnOrdre.listIterator();
	}
}
