/**
 * Auteurs : TODO et Soti
 * Fichier : PrincipalTp6.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonni�re)
 * Date    : 28 novembre 2018
 */

// Packages.

import java.util.*;

import outilsjava.*;

/**
 * La classe PrincipalTp6 permet de g�rer un menu principal pour pour le TP6.
 * Programme de vaccination contre la grippe saisonni�re pour illustrer le
 * concept de liste cha�n�e ordonn�e et de file d'attente.
 * 
 * Cette classe impl�mente l'interface OutilsConstantes.
 */

public class PrincipalTp6  implements OutilsConstantes {
	
	// Constante de la classe.
	
	private static final String NOM_CLINIQUE = "Montmopital";

	/**
	 * Le constructeur PrincipalTp6 permet de g�rer un menu principal pour
	 * faire la vaccination contre la grippe saisonni�re.
	 */

	public PrincipalTp6() {
		// Constantes du constructeur.

		// Les constantes pour le menu principal.

		final char ARRIVEE_MEDECIN   = '1';
		final char DEPART_MEDECIN    = '2';
		final char CONSULTER_MEDECIN = '3';
		final char ARRIVEE_PATIENT   = '4';
		final char VACCINER_PATIENT  = '5';
		final char INFOS_CLINIQUE    = '6';
		final char TERMINER_JOURNEE  = '7';

		// Noms des mois.

		final String[] TAB_MOIS = { 
				"janvier", "f�vrier", "mars", "avril", "mai", "juin", 
				"juillet", "ao�t", "septembre", "octobre", "novembre",
				"d�cembre" };

		final String MESS_BIENVENUE = "\nBienvenue au programme de "
				+ "vaccination contre la grippe saisonni�re";
		
		// Code du constructeur.

		// Obtenir la date d'aujourd'hui.

		GregorianCalendar aujourdhui = new GregorianCalendar();

		int annee = aujourdhui.get( GregorianCalendar.YEAR );
		int mois = aujourdhui.get( GregorianCalendar.MONTH );
		int jour = aujourdhui.get( GregorianCalendar.DAY_OF_MONTH );

		String menuPrincipal = 
				"\nMenu pour la gestion des vaccins"
				+ " contre la grippe saisonni�re\nDe la clinique "
				+ NOM_CLINIQUE + "\n" 
				+ "Date : " + jour + " " + TAB_MOIS[mois]
				+ " " + annee + "\n\n" 
				+ "1 : Arriv�e d'un m�decin\n"
				+ "2 : D�part d'un m�decin\n" 
				+ "3 : Consulter un m�decin\n"
				+ "4 : Arriv�e d'un patient\n" 
				+ "5 : Vacciner un patient\n"
				+ "6 : Informations sur la clinique\n"
				+ "7 : Terminer la journ�e";

		char choix;

		System.out.println( MESS_BIENVENUE );

		
		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 9 de l'�nonc� du TP6.
		 */

		
		do {
			choix = OutilsAffichage.afficherChoisirMenu( menuPrincipal,
					ARRIVEE_MEDECIN, TERMINER_JOURNEE );

			switch ( choix ) {
			case ARRIVEE_MEDECIN:

				/**
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 9 de l'�nonc� du TP6.
				 */
				
				break;

			case DEPART_MEDECIN:

				/**
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 9 de l'�nonc� du TP6.
				 */
				
				break;

			case CONSULTER_MEDECIN:

				/**
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 9 de l'�nonc� du TP6.
				 */
				
				break;

			case ARRIVEE_PATIENT:

				/**
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 9 de l'�nonc� du TP6.
				 */
				
				break;

			case VACCINER_PATIENT:

				/**
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 9 de l'�nonc� du TP6.
				 */
				
				break;

			case INFOS_CLINIQUE:

				/**
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 9 de l'�nonc� du TP6.
				 */
				
				break;

			case TERMINER_JOURNEE:

				/**
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 9 de l'�nonc� du TP6.
				 */
				
				break;
			}
		} while ( choix != TERMINER_JOURNEE );

		System.out.println( MESS_FIN_PROG );
	}
}