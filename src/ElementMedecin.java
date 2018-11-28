/**
 * Auteurs : TODO et Soti
 * Fichier : ElementMedecin.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonnière)
 * Date    : 28 novembre 2018
 */

/**
 * La classe ElementMedecin permet de gérer un élément de la liste chaînée
 * ordonnée des médecins. Cette classe implémente l'interface Comparable.
 */

public class ElementMedecin implements Comparable<ElementMedecin> {
	// Un élément de la liste ordonnée des médecins est composé d'un médecin
	// et d'une file d'attente des patients pour ce médecin.

	private Medecin medecin;
	private FileAttente<Patient> filePatients;

	/**
	 * Le premier constructeur ElementMedecin() permet de construire un objet de
	 * la liste ordonnée des médecins. C'est la construction d'un médecin de
	 * base avec aucun patient.
	 */

	public ElementMedecin() {

		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 5 de l'énoncé du TP6.
		 */

	}

	/**
	 * Le deuxième constructeur ElementMedecin() permet de construire un objet
	 * de la liste ordonnée des médecins. C'est la construction d'un médecin
	 * reçu en paramètre avec aucun patient.
	 * 
	 * @param med
	 *            Un médecin.
	 */

	public ElementMedecin( Medecin med ) {

		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 5 de l'énoncé du TP6.
		 */

	}

	/**
	 * L'accesseur getMedecin() permet de retourner le médecin d'un élément de
	 * la liste ordonnée des médecins.
	 * 
	 * @return Le médecin.
	 */

	public Medecin getMedecin() {
		return this.medecin;
	}

	/**
	 * Le mutateur setMedecin() permet d'initialiser le champ privé medecin.
	 * 
	 * @param med
	 *            Un médecin.
	 */

	public void setMedecin( Medecin med ) {
		this.medecin = med;
	}

	/**
	 * L'accesseur getFilePatients() permet de retourner la file d'attente des
	 * patients pour un médecin d'un élément de la liste ordonnée des médecins.
	 * 
	 * @return La file d'attente des patients.
	 */

	public FileAttente<Patient> getFilePatients() {
		return this.filePatients;
	}

	/**
	 * La méthode publique afficherElementMedecin() permet d'afficher les
	 * différents champs d'un élément de la liste ordonnée des médecins.
	 */

	public void afficherElementMedecin() {

		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 5 de l'énoncé du TP6.
		 */

	}

	/**
	 * Redéfinition de la méthode equals() de la classe Object. Deux objets de
	 * type ElementMedecin sont égaux lorsque leurs médecins (Medecin) sont
	 * égaux.
	 * 
	 * @param autreObjet
	 *            L'autre objet avec lequel on vérifie l'égalité.
	 * @return true si l'objet courant et l'autre objet sont égaux et false dans
	 *         le cas contraire.
	 */

	@Override
	public boolean equals( Object autreObjet ) {
		boolean egalite = false;

		if ( this == autreObjet ) {
			egalite = true;

		} else if ( autreObjet != null ) {

			if ( autreObjet instanceof ElementMedecin ) {
				ElementMedecin autre = (ElementMedecin) autreObjet;

				if ( this.getMedecin().equals( autre.getMedecin() ) ) {
					egalite = true;
				}
			}
		}

		return egalite;
	}

	/**
	 * Implémentation de la méthode compareTo() de l'interface Comparable. Un
	 * objet de type ElementMedecin est plus petit qu'un autre objet de type
	 * ElementMedecin lorsque le médecin (Medecin) du premier objet est plus
	 * petit que le médecin (Medecin) du deuxième objet.
	 * 
	 * @param autreObjet
	 *            L'autre objet à comparer.
	 * @return <0 si l'objet courant est plus petit que l'autre objet, >0 si
	 *         l'objet courant est plus grand que l'autre objet et 0 si l'objet
	 *         courant est égal à l'autre objet.
	 */

	@Override
	public int compareTo( ElementMedecin autreObjet ) {
		int valCompare;

		valCompare = this.getMedecin().compareTo( autreObjet.getMedecin() );

		return valCompare;
	}
}