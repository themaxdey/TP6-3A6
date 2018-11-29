/**
 * Auteur  : Soti
 * Fichier : Medecin.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
 * Date    : 28 novembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe Medecin contient les informations et les m�thodes pour un m�decin.
 * La classe Medecin impl�mente l'interface Comparable.
 */

public class Medecin implements Comparable<Medecin> {
	// Champs d'instance priv�s de la classe Medecin.

	private String noMedecin; // Sert de cl�.
	private String nomMedecin;
	private String codeSpecialite;

	/**
	 * Le constructeur Medecin() permet de construire un m�decin de base.
	 */

	public Medecin() {
		this( "", "", "" );
	}

	/**
	 * Le constructeur Medecin() permet de construire un m�decin avec des
	 * valeurs.
	 * 
	 * @param no
	 *            Un num�ro de m�decin.
	 * @param nom
	 *            Un nom de m�decin.
	 * @param code
	 *            Un code de sp�cialit�.
	 */

	public Medecin( String no, String nom, String code ) {
		this.setNoMedecin( no );
		this.setNomMedecin( nom );
		this.setCodeSpecialite( code );
	}

	/**
	 * Le mutateur setNoMedecin() permet d'initialiser le champ priv� noMedecin.
	 * 
	 * @param no
	 *            Un num�ro de m�decin.
	 */

	public void setNoMedecin( String no ) {
		this.noMedecin = no;
	}

	/**
	 * Le mutateur setNomMedecin() permet d'initialiser le champ priv�
	 * nomMedecin.
	 * 
	 * @param nom
	 *            Un nom de m�decin.
	 */

	public void setNomMedecin( String nom ) {
		this.nomMedecin = nom;
	}

	/**
	 * Le mutateur setCodeSpecialite() permet d'initialiser le champ priv�
	 * codeSpecialite.
	 * 
	 * @param code
	 *            Un code de sp�cialit�.
	 */

	public void setCodeSpecialite( String code ) {
		this.codeSpecialite = code;
	}

	/**
	 * L'accesseur getNoMedecin() permet de retourner le num�ro du m�decin.
	 * 
	 * @return Le num�ro du m�decin.
	 */

	public String getNoMedecin() {
		return this.noMedecin;
	}

	/**
	 * L'accesseur getNomMedecin() permet de retourner le nom du m�decin.
	 * 
	 * @return Le nom du m�decin.
	 */

	public String getNomMedecin() {
		return this.nomMedecin;
	}

	/**
	 * L'accesseur getCodeSpecialite() permet de retourner le code de specialit�
	 * du m�decin.
	 * 
	 * @return Le code de sp�cialit� du m�decin.
	 */

	public String getCodeSpecialite() {
		return this.codeSpecialite;
	}

	/**
	 * La m�thode publique lireNoMedecin() permet de lire un num�ro de m�decin
	 * et de modifier le champ priv� noMedecin.
	 */

	public void lireNoMedecin() {
		final int MAX_CAR_NO_MEDECIN = 5;

		String no;

		no = OutilsLecture.lireChaineExacte( "Entrez le numéro du médecin ("
				+ MAX_CAR_NO_MEDECIN + " car.) : ", MAX_CAR_NO_MEDECIN );

		this.setNoMedecin( no );
	}

	/**
	 * La m�thode publique lireNomMedecin() permet de lire un nom de m�decin et
	 * de modifier le champ priv� nomMedecin.
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
	 * La m�thode publique lireCodeSpecialite() permet de lire un code de
	 * sp�cialit� pour un m�decin et de modifier le champ priv� codeSpecialite.
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
	 * La m�thode publique lireAutresRenseignements() permet de lire un nom et
	 * un code de sp�cialit� pour un m�decin connaissant son num�ro de m�decin.
	 */

	public void lireAutresRenseignements() {
		System.out.println( "\nEntrez les autres renseignements du médecin "
				+ this.getNoMedecin() );

		this.lireNomMedecin();
		this.lireCodeSpecialite();
	}

	/**
	 * La m�thode publique afficherMedecin() permet d'afficher les diff�rents
	 * champs d'un m�decin.
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
	 * Red�finition de la m�thode equals() de la classe Object. Deux objets de
	 * type Medecin sont �gaux lorsque leurs noMedecin sont �gaux. On ne fait
	 * pas de diff�rence entre les caract�res minuscules et les caract�res
	 * majuscules.
	 * 
	 * @param autreObjet
	 *            L'autre objet avec lequel on v�rifie l'�galit�.
	 * @return true si l'objet courant et l'autre objet sont �gaux et false dans
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
	 * Impl�mentation de la m�thode compareTo() de l'interface Comparable. Un
	 * objet de type Medecin est plus petit qu'un autre objet de type Medecin
	 * lorsque le noMedecin du premier objet est alphab�tiquement plus petit que
	 * le noMedecin du deuxi�me objet. On ne fait pas de diff�rence entre les
	 * caract�res minuscules et les caract�res majuscules.
	 * 
	 * @param autreObjet
	 *            L'autre objet � comparer.
	 * @return <0 si l'objet courant est plus petit que l'autre objet, >0 si
	 *         l'objet courant est plus grand que l'autre objet et 0 si l'objet
	 *         courant est �gal � l'autre objet.
	 */

	public int compareTo( Medecin autreObjet ) {
		int valCompare;

		valCompare = this.getNoMedecin().compareToIgnoreCase(
				autreObjet.getNoMedecin() );

		return valCompare;
	}
}