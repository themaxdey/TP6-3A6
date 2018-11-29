
/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
 * Fichier : ElementMedecin.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
 * Date    : 28 novembre 2018
 */

/**
 * La classe ElementMedecin permet de g�rer un �l�ment de la liste cha�n�e
 * ordonn�e des m�decins. Cette classe impl�mente l'interface Comparable.
 */

public class ElementMedecin implements Comparable<ElementMedecin> {
	// Un �l�ment de la liste ordonn�e des m�decins est compos� d'un m�decin
	// et d'une file d'attente des patients pour ce m�decin.

	private Medecin medecin;
	private FileAttente<Patient> filePatients;

	/**
	 * Le premier constructeur ElementMedecin() permet de construire un objet de
	 * la liste ordonn�e des m�decins. C'est la construction d'un m�decin de
	 * base avec aucun patient.
	 */

	public ElementMedecin() {

		/**
		 * 
		 * Voir page 5 de l'�nonc� du TP6.
		 */
		
		this(new Medecin());

	}

	/**
	 * Le deuxi�me constructeur ElementMedecin() permet de construire un objet
	 * de la liste ordonn�e des m�decins. C'est la construction d'un m�decin
	 * re�u en param�tre avec aucun patient.
	 * 
	 * @param med
	 *            Un m�decin.
	 */

	public ElementMedecin( Medecin med ) {

		/**
		 * 
		 * Voir page 5 de l'�nonc� du TP6.
		 */
		
		this.medecin = med;
		
		filePatients = new FileAttente<Patient>();

	}

	/**
	 * L'accesseur getMedecin() permet de retourner le m�decin d'un �l�ment de
	 * la liste ordonn�e des m�decins.
	 * 
	 * @return Le m�decin.
	 */

	public Medecin getMedecin() {
		return this.medecin;
	}

	/**
	 * Le mutateur setMedecin() permet d'initialiser le champ priv� medecin.
	 * 
	 * @param med
	 *            Un m�decin.
	 */

	public void setMedecin( Medecin med ) {
		this.medecin = med;
	}

	/**
	 * L'accesseur getFilePatients() permet de retourner la file d'attente des
	 * patients pour un m�decin d'un �l�ment de la liste ordonn�e des m�decins.
	 * 
	 * @return La file d'attente des patients.
	 */

	public FileAttente<Patient> getFilePatients() {
		return this.filePatients;
	}

	/**
	 * La m�thode publique afficherElementMedecin() permet d'afficher les
	 * diff�rents champs d'un �l�ment de la liste ordonn�e des m�decins.
	 */

	public void afficherElementMedecin() {

		/**
		 * 
		 * Voir page 5 de l'�nonc� du TP6.
		 */
		
		medecin.afficherMedecin();
		
		System.out.println( "Nombre de patients pour ce médecin : " + filePatients.taille());

	}

	/**
	 * Red�finition de la m�thode equals() de la classe Object. Deux objets de
	 * type ElementMedecin sont �gaux lorsque leurs m�decins (Medecin) sont
	 * �gaux.
	 * 
	 * @param autreObjet
	 *            L'autre objet avec lequel on v�rifie l'�galit�.
	 * @return true si l'objet courant et l'autre objet sont �gaux et false dans
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
	 * Impl�mentation de la m�thode compareTo() de l'interface Comparable. Un
	 * objet de type ElementMedecin est plus petit qu'un autre objet de type
	 * ElementMedecin lorsque le m�decin (Medecin) du premier objet est plus
	 * petit que le m�decin (Medecin) du deuxi�me objet.
	 * 
	 * @param autreObjet
	 *            L'autre objet � comparer.
	 * @return <0 si l'objet courant est plus petit que l'autre objet, >0 si
	 *         l'objet courant est plus grand que l'autre objet et 0 si l'objet
	 *         courant est �gal � l'autre objet.
	 */

	@Override
	public int compareTo( ElementMedecin autreObjet ) {
		int valCompare;

		valCompare = this.getMedecin().compareTo( autreObjet.getMedecin() );

		return valCompare;
	}
}