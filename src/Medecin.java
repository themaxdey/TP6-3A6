/**
 * Auteur  : Soti
 * Fichier : Medecin.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonnière)
 * Date    : 28 novembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe Medecin contient les informations et les méthodes pour un médecin.
 * La classe Medecin implémente l'interface Comparable.
 */

public class Medecin implements Comparable<Medecin> {
	// Champs d'instance privés de la classe Medecin.

	private String noMedecin; // Sert de clé.
	private String nomMedecin;
	private String codeSpecialite;

	/**
	 * Le constructeur Medecin() permet de construire un médecin de base.
	 */

	public Medecin() {
		this( "", "", "" );
	}

	/**
	 * Le constructeur Medecin() permet de construire un médecin avec des
	 * valeurs.
	 * 
	 * @param no
	 *            Un numéro de médecin.
	 * @param nom
	 *            Un nom de médecin.
	 * @param code
	 *            Un code de spécialité.
	 */

	public Medecin( String no, String nom, String code ) {
		this.setNoMedecin( no );
		this.setNomMedecin( nom );
		this.setCodeSpecialite( code );
	}

	/**
	 * Le mutateur setNoMedecin() permet d'initialiser le champ privé noMedecin.
	 * 
	 * @param no
	 *            Un numéro de médecin.
	 */

	public void setNoMedecin( String no ) {
		this.noMedecin = no;
	}

	/**
	 * Le mutateur setNomMedecin() permet d'initialiser le champ privé
	 * nomMedecin.
	 * 
	 * @param nom
	 *            Un nom de médecin.
	 */

	public void setNomMedecin( String nom ) {
		this.nomMedecin = nom;
	}

	/**
	 * Le mutateur setCodeSpecialite() permet d'initialiser le champ privé
	 * codeSpecialite.
	 * 
	 * @param code
	 *            Un code de spécialité.
	 */

	public void setCodeSpecialite( String code ) {
		this.codeSpecialite = code;
	}

	/**
	 * L'accesseur getNoMedecin() permet de retourner le numéro du médecin.
	 * 
	 * @return Le numéro du médecin.
	 */

	public String getNoMedecin() {
		return this.noMedecin;
	}

	/**
	 * L'accesseur getNomMedecin() permet de retourner le nom du médecin.
	 * 
	 * @return Le nom du médecin.
	 */

	public String getNomMedecin() {
		return this.nomMedecin;
	}

	/**
	 * L'accesseur getCodeSpecialite() permet de retourner le code de specialité
	 * du médecin.
	 * 
	 * @return Le code de spécialité du médecin.
	 */

	public String getCodeSpecialite() {
		return this.codeSpecialite;
	}

	/**
	 * La méthode publique lireNoMedecin() permet de lire un numéro de médecin
	 * et de modifier le champ privé noMedecin.
	 */

	public void lireNoMedecin() {
		final int MAX_CAR_NO_MEDECIN = 5;

		String no;

		no = OutilsLecture.lireChaineExacte( "Entrez le numéro du médecin ("
				+ MAX_CAR_NO_MEDECIN + " car.) : ", MAX_CAR_NO_MEDECIN );

		this.setNoMedecin( no );
	}

	/**
	 * La méthode publique lireNomMedecin() permet de lire un nom de médecin et
	 * de modifier le champ privé nomMedecin.
	 */

	public void lireNomMedecin() {
		final int MAX_CAR_NOM_MEDECIN = 40;

		String nom;

		nom = OutilsLecture.lireChaineValide( "Entrez le nom du médecin ("
				+ MAX_CAR_NOM_MEDECIN + " car. maximum) : ", 1,
				MAX_CAR_NOM_MEDECIN );

		this.setNomMedecin( nom );
	}

	/**
	 * La méthode publique lireCodeSpecialite() permet de lire un code de
	 * spécialité pour un médecin et de modifier le champ privé codeSpecialite.
	 */

	public void lireCodeSpecialite() {
		final int MAX_CAR_CODE_SPECIALITE = 3;

		String code;

		code = OutilsLecture.lireChaineExacte( "Entrez le code de spécialité ("
				+ MAX_CAR_CODE_SPECIALITE + " car.) : ",
				MAX_CAR_CODE_SPECIALITE );

		this.setCodeSpecialite( code );
	}

	/**
	 * La méthode publique lireAutresRenseignements() permet de lire un nom et
	 * un code de spécialité pour un médecin connaissant son numéro de médecin.
	 */

	public void lireAutresRenseignements() {
		System.out.println( "\nEntrez les autres renseignements du médecin "
				+ this.getNoMedecin() );

		this.lireNomMedecin();
		this.lireCodeSpecialite();
	}

	/**
	 * La méthode publique afficherMedecin() permet d'afficher les différents
	 * champs d'un médecin.
	 */

	public void afficherMedecin() {
		System.out.println( "\nRenseignements sur un médecin\n" );

		System.out.println( "Numéro du médecin : \t\t\t" 
				+ this.getNoMedecin() );
		System.out.println( "Nom du médecin : \t\t\t" + this.getNomMedecin() );
		System.out.println( "Code de spécialité : \t\t\t"
				+ this.getCodeSpecialite() );
	}

	/**
	 * Redéfinition de la méthode equals() de la classe Object. Deux objets de
	 * type Medecin sont égaux lorsque leurs noMedecin sont égaux. On ne fait
	 * pas de différence entre les caractères minuscules et les caractères
	 * majuscules.
	 * 
	 * @param autreObjet
	 *            L'autre objet avec lequel on vérifie l'égalité.
	 * @return true si l'objet courant et l'autre objet sont égaux et false dans
	 *         le cas contraire.
	 */

	public boolean equals( Object autreObjet ) {
		boolean egalite = false;

		if ( this == autreObjet ) {
			egalite = true;

		} else if ( autreObjet != null ) {

			if ( autreObjet instanceof Medecin ) {
				Medecin autre = (Medecin) autreObjet;

				if ( this.getNoMedecin()
						.equalsIgnoreCase( autre.getNoMedecin() ) ) {
					egalite = true;
				}
			}
		}

		return egalite;
	}

	/**
	 * Implémentation de la méthode compareTo() de l'interface Comparable. Un
	 * objet de type Medecin est plus petit qu'un autre objet de type Medecin
	 * lorsque le noMedecin du premier objet est alphabétiquement plus petit que
	 * le noMedecin du deuxième objet. On ne fait pas de différence entre les
	 * caractères minuscules et les caractères majuscules.
	 * 
	 * @param autreObjet
	 *            L'autre objet à comparer.
	 * @return <0 si l'objet courant est plus petit que l'autre objet, >0 si
	 *         l'objet courant est plus grand que l'autre objet et 0 si l'objet
	 *         courant est égal à l'autre objet.
	 */

	public int compareTo( Medecin autreObjet ) {
		int valCompare;

		valCompare = this.getNoMedecin().compareToIgnoreCase(
				autreObjet.getNoMedecin() );

		return valCompare;
	}
}