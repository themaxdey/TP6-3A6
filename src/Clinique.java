/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
 * Fichier : Clinique.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonnière)
 * Date    : 28 novembre 2018
 */

/**
 * La classe Clinique permet de gérer une clinique.
 */

public class Clinique {
	/* Une clinique est composé d'un nom et d'une liste de médecins. */

	private String nomClinique;

	private ListeOrdonneeMedecin<ElementMedecin> listeMedecins;

	/**
	 * Le constructeur Clinique() permet de construire une clinique connaissant
	 * son nom. Au début, la clinique ne contient aucun médecin et aucun
	 * patient.
	 * 
	 * @param nom
	 *            Le nom de la clinique.
	 */
	
	public Clinique( String nom ) {
		
		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 8 de l'énoncé du TP6.
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
	 * L'accesseur getListeMedecins() permet de retourner la liste des médecins.
	 * 
	 * @return La liste des médecins.
	 */

	public ListeOrdonneeMedecin<ElementMedecin> getListeMedecins() {
		return this.listeMedecins;
	}

	/**
	 * La méthode publique afficherClinique() permet d'afficher les différentes
	 * informations de la clinique.
	 */

	public void afficherClinique() {
		// Constantes de la méthode.
		
		final String TITRE = "\nInformations sur la clinique.";

		final String MESS_FIN_INFO = "\nFin des informations sur la clinique.";

		// Code de la méthode.
		
		System.out.println( TITRE );


		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 8 de l'énoncé du TP6.
		 */

		System.out.println( MESS_FIN_INFO );
	}

	/**
	 * La méthode publique terminerJournee() permet de vider la liste des
	 * médecins. Ce traitement est effectué à la fin de la journée.
	 */

	public void terminerJournee() {
		// Constantes de la méthode.
		
		final String MESS_PATIENTS = "\nIl y a encore des patients qui "
				+ "attendent pour se faire vacciner.";

		final String MESS_MEDECINS = "\nIl y a encore des médecins "
				+ "dans la clinique.";

		final String MESS_VIDE = "\nLa clinique est vide. "
				+ "Bonne fin de journée !";

		// Code de la méthode.
		
		boolean viderClinique = false;


		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 9 de l'énoncé du TP6.
		 */

		System.out.println( MESS_VIDE );
	}
}