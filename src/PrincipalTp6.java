/**
 * Auteurs : Maxime Dery, Jean-Sébastien Beaulne et Soti
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
				"janvier", "février", "mars", "avril", "mai", "juin", 
				"juillet", "août", "septembre", "octobre", "novembre",
				"décembre" };

		final String MESS_BIENVENUE = "\nBienvenue au programme de "
				+ "vaccination contre la grippe saisonnère";
		
		// Code du constructeur.

		// Obtenir la date d'aujourd'hui.

		GregorianCalendar aujourdhui = new GregorianCalendar();

		int annee = aujourdhui.get( GregorianCalendar.YEAR );
		int mois = aujourdhui.get( GregorianCalendar.MONTH );
		int jour = aujourdhui.get( GregorianCalendar.DAY_OF_MONTH );

		String menuPrincipal = 
				"\nMenu pour la gestion des vaccins"
				+ " contre la grippe saisonnière\nDe la clinique "
				+ NOM_CLINIQUE + "\n" 
				+ "Date : " + jour + " " + TAB_MOIS[mois]
				+ " " + annee + "\n\n" 
				+ "1 : Arrivée d'un médecin\n"
				+ "2 : Départ d'un médecin\n" 
				+ "3 : Consulter un médecin\n"
				+ "4 : Arrivée d'un patient\n" 
				+ "5 : Vacciner un patient\n"
				+ "6 : Informations sur la clinique\n"
				+ "7 : Terminer la journée";

		char choix;

		System.out.println( MESS_BIENVENUE );
		
		Clinique clinique = new Clinique(NOM_CLINIQUE);

		
		do {
			choix = OutilsAffichage.afficherChoisirMenu( menuPrincipal,
					ARRIVEE_MEDECIN, TERMINER_JOURNEE );

			switch ( choix ) {
			case ARRIVEE_MEDECIN:
				ArriveeMedecin(clinique);
				break;

			case DEPART_MEDECIN:
				DepartMedecin(clinique);
				break;

			case CONSULTER_MEDECIN:
				ConsulterMedecin(clinique);
				break;

			case ARRIVEE_PATIENT:
				ArriveePatient(clinique);
				break;

			case VACCINER_PATIENT:
				VaccinerPatient(clinique);
				break;

			case INFOS_CLINIQUE:
				clinique.afficherClinique();
				break;

			case TERMINER_JOURNEE:
				clinique.terminerJournee();
				break;
			}
		} while ( choix != TERMINER_JOURNEE );

		System.out.println( MESS_FIN_PROG );
	}
}