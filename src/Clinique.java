/**
 * Auteurs : Maxime Dery, Jean-S�bastien Beaulne et Soti
 * Fichier : Clinique.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
 * Date    : 28 novembre 2018
 */

/**
 * La classe Clinique permet de g�rer une clinique.
 */

public class Clinique {
	/* Une clinique est compos� d'un nom et d'une liste de m�decins. */

	private String nomClinique;

	private ListeOrdonneeMedecin<ElementMedecin> listeMedecins;

	/**
	 * Le constructeur Clinique() permet de construire une clinique connaissant
	 * son nom. Au d�but, la clinique ne contient aucun m�decin et aucun
	 * patient.
	 * 
	 * @param nom
	 *            Le nom de la clinique.
	 */
	
	public Clinique( String nom ) {
		
		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 8 de l'�nonc� du TP6.
		 */

	}

	/**
	 * L'accesseur getNomClinique() permet de retourner le nom de la clinique.
	 * 
	 * @return Le nom de la clinique.
	 */

	public String getNomClinique() {
		return this.nomClinique;
	}

	/**
	 * Le mutateur setNomClinique() permet de modifier le nom de la clinique.
	 * 
	 * @param nom
	 *            Le nom de la clinique.
	 */

	public void setNomClinique( String nom ) {
		this.nomClinique = nom;
	}

	/**
	 * L'accesseur getListeMedecins() permet de retourner la liste des m�decins.
	 * 
	 * @return La liste des m�decins.
	 */

	public ListeOrdonneeMedecin<ElementMedecin> getListeMedecins() {
		return this.listeMedecins;
	}

	/**
	 * La m�thode publique afficherClinique() permet d'afficher les diff�rentes
	 * informations de la clinique.
	 */

	public void afficherClinique() {
		// Constantes de la m�thode.
		
		final String TITRE = "\nInformations sur la clinique.";

		final String MESS_FIN_INFO = "\nFin des informations sur la clinique.";

		// Code de la m�thode.
		
		System.out.println( TITRE );


		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 8 de l'�nonc� du TP6.
		 */

		System.out.println( MESS_FIN_INFO );
	}

	/**
	 * La m�thode publique terminerJournee() permet de vider la liste des
	 * m�decins. Ce traitement est effectu� � la fin de la journ�e.
	 */

	public void terminerJournee() {
		// Constantes de la m�thode.
		
		final String MESS_PATIENTS = "\nIl y a encore des patients qui "
				+ "attendent pour se faire vacciner.";

		final String MESS_MEDECINS = "\nIl y a encore des m�decins "
				+ "dans la clinique.";

		final String MESS_VIDE = "\nLa clinique est vide. "
				+ "Bonne fin de journ�e !";

		// Code de la m�thode.
		
		boolean viderClinique = false;


		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 9 de l'�nonc� du TP6.
		 */

		System.out.println( MESS_VIDE );
	}
}