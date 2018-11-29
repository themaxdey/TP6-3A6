/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
 * Fichier : Clinique.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonnière)
 * Date    : 28 novembre 2018
 */

/**
 * La classe Clinique permet de gèrer une clinique.
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
		 * 
		 * Voir page 8 de l'�nonc� du TP6.
		 */

		nomClinique = nom;

		listeMedecins = new ListeOrdonneeMedecin<>();

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
		 * 
		 * Voir page 8 de l'�nonc� du TP6.
		 */

		System.out.println( "\nInformations pour la clinique " + getNomClinique() );
		System.out.println( "\nNombre de médecin : " + listeMedecins.taille() );
		System.out.println( "\nNombre total de patiens : " + listeMedecins.obtenirNbTotalPatients() );
		listeMedecins.afficherListeMedecins();

		System.out.println( MESS_FIN_INFO );
	}

	/**
	 * La méthode publique terminerJournee() permet de vider la liste des
	 * médecins. Ce traitement est effectué à la fin de la journée.
	 */

	public void terminerJournee() {
		// Constantes de la m�thode.

		final String MESS_PATIENTS = "\nIl y a encore des patients qui " + "attendent pour se faire vacciner.";

		final String MESS_MEDECINS = "\nIl y a encore des médecins " + "dans la clinique.";

		final String MESS_VIDE = "\nLa clinique est vide. " + "Bonne fin de journée !";

		// Code de la m�thode.

		boolean viderClinique = false;

		/**
		 * 
		 * Voir page 9 de l'�nonc� du TP6.
		 */
		
		if(listeMedecins.obtenirNbTotalPatients() != 0){
			System.out.println(MESS_PATIENTS);
		} else if (!listeMedecins.estVide()){
			System.out.println(MESS_MEDECINS);
		}

		if(viderClinique){
			listeMedecins.viderListeMedecins();
		}



		System.out.println( MESS_VIDE );
	}
}