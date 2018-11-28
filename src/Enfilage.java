/**
 * Auteur  : Soti 
 * Fichier : Enfilage.java 
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonnière)
 * Date    : 28 novembre 2018
 */

/**
 * L'interface Enfilage indique comment une file d'attente doit se comporter.
 * Comme vu en classe (Doc. 6, page 8).
 */

public interface Enfilage<E> {
	
	public abstract boolean estVide();

	public abstract int taille();

	public abstract boolean estPresent( E obj );

	public abstract E obtenirDebut();

	public abstract void ajouterFin( E obj );

	public abstract E retirerDebut();

	public abstract void vider();
}
