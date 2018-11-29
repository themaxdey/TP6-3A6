/**
 * Auteur  : Soti
 * Fichier : Patient.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
 * Date    : 28 novembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe Patient contient les informations et les m�thodes pour un patient.
 * La classe Patient impl�mente l'interface Comparable.
 */

public class Patient implements Comparable<Patient> {
	// Champs d'instance priv�s de la classe Patient.

	private String noAssMaladie; // Sert de cl�.
	private String nomPatient;

	/**
	 * Le constructeur Patient() permet de construire un patient de base.
	 */

	public Patient() {
		this( "", "" );
	}

	/**
	 * Le constructeur Patient() permet de construire un patient avec des
	 * valeurs.
	 * 
	 * @param no
	 *            Un num�ro d'assurance maladie.
	 * @param nom
	 *            Un nom de patient.
	 */

	public Patient( String no, String nom ) {
		this.setNoAssMaladie( no );
		this.setNomPatient( nom );
	}

	/**
	 * Le mutateur setNoAssMaladie() permet d'initialiser le champ priv�
	 * noAssMaladie.
	 * 
	 * @param no
	 *            Un num�ro d'assurance maladie.
	 */

	public void setNoAssMaladie( String no ) {
		this.noAssMaladie = no;
	}

	/**
	 * Le mutateur setNomPatient() permet d'initialiser le champ priv�
	 * nomPatient.
	 * 
	 * @param nom
	 *            Un nom de patient.
	 */

	public void setNomPatient( String nom ) {
		this.nomPatient = nom;
	}

	/**
	 * L'accesseur getNoAssMaladie() permet de retourner le num�ro d'assurance
	 * maladie du patient.
	 * 
	 * @return Le num�ro d'assurance maladie du patient.
	 */

	public String getNoAssMaladie() {
		return this.noAssMaladie;
	}

	/**
	 * L'accesseur getNomPatient() permet de retourner le nom du patient.
	 * 
	 * @return Le nom du patient.
	 */

	public String getNomPatient() {
		return this.nomPatient;
	}

	/**
	 * La m�thode publique lireNoAssMaladie() permet de lire un num�ro
	 * d'assurance maladie et de modifier le champ priv� noAssMaladie.
	 */

	public void lireNoAssMaladie() {
		final int MAX_CAR_NO_ASS_MALADIE = 12;

		String no;

		no = OutilsLecture.lireChaineExacte(
				"Entrez le numéro d'assurance maladie du patient ("
						+ MAX_CAR_NO_ASS_MALADIE + " car.) : ",
				MAX_CAR_NO_ASS_MALADIE );

		this.setNoAssMaladie( no );
	}

	/**
	 * La m�thode publique lireNomPatient() permet de lire un nom de patient et
	 * de modifier le champ priv� nomPatient.
	 */

	public void lireNomPatient() {
		final int MAX_CAR_NOM_PATIENT = 40;

		String nom;

		nom = OutilsLecture.lireChaineValide( "Entrez le nom du patient ("
				+ MAX_CAR_NOM_PATIENT + " car. maximum) : ", 1,
				MAX_CAR_NOM_PATIENT );

		this.setNomPatient( nom );
	}

	/**
	 * La m�thode publique lireAutresRenseignements() permet de lire un nom 
	 * de patient connaissant son num�ro d'assurance maladie.
	 */

	public void lireAutresRenseignements() {
		System.out.println( "\nEntrez les autres renseignements du patient "
				+ this.getNoAssMaladie() );

		this.lireNomPatient();
	}

	/**
	 * La m�thode publique afficherPatient() permet d'afficher les diff�rents
	 * champs d'un patient.
	 */

	public void afficherPatient() {
		System.out.println( "\nRenseignements sur un patient\n" );

		System.out.println( "Numéro d'assurance maladie du patient : "
				+ getNoAssMaladie() );
		System.out.println( "Nom du patient : \t\t\t" + getNomPatient() );
	}

	/**
	 * Red�finition de la m�thode equals() de la classe Object. Deux objets de
	 * type Patient sont �gaux lorsque leurs noAssMaladie sont �gaux. On ne fait
	 * pas de diff�rence entre les caract�res minuscules et les caract�res
	 * majuscules.
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

			if ( autreObjet instanceof Patient ) {
				Patient autre = (Patient) autreObjet;

				if ( this.getNoAssMaladie().equalsIgnoreCase(
						autre.getNoAssMaladie() ) ) {
					egalite = true;
				}
			}
		}

		return egalite;
	}

	/**
	 * Impl�mentation de la m�thode compareTo() de l'interface Comparable. Un
	 * objet de type Patient est plus petit qu'un autre objet de type Patient
	 * lorsque le noAssMaladie du premier objet est alphab�tiquement plus petit
	 * que le noAssMaladie du deuxi�me objet. On ne fait pas de diff�rence entre
	 * les caract�res minuscules et les caract�res majuscules.
	 * 
	 * @param autreObjet
	 *            L'autre objet � comparer.
	 * @return <0 si l'objet courant est plus petit que l'autre objet, >0 si
	 *         l'objet courant est plus grand que l'autre objet et 0 si l'objet
	 *         courant est �gal � l'autre objet.
	 */

	@Override
	public int compareTo( Patient autreObjet ) {
		int valCompare;

		valCompare = this.getNoAssMaladie().compareToIgnoreCase(
				autreObjet.getNoAssMaladie() );

		return valCompare;
	}
}