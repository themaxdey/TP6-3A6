/**
 * Auteur  : Soti
 * Fichier : MainTp6.java
 * Cours   : 420-3A6-MO (TP6, Vaccination grippe saisonnière)
 * Date    : 28 novembre 2018
 */

// Packages.

import java.io.*;

import outilsjava.*;

/**
 * La classe MainTp6 contient la classe principale pour le TP6.
 * Programme de gestion de la vaccination contre la grippe saisonnière.
 */

public class MainTp6 {

	public static void main( String[] args ) {
		boolean peutContinuer = true;

		String nomFicTest;
		// Assume lire les données du clavier.
		BufferedReader fic =
				new BufferedReader( new InputStreamReader( System.in ) );

		OutilsLecture.fic = fic;

		char type =
				OutilsLecture.lireCaractereDisparate( "\nEntrez le type "
						+ "de test du programme "
						+ "(C avec clavier, F avec Fichier) : ", "CF" );

		if ( type == OutilsLecture.LECTURE_FICHIER ) {

			nomFicTest =
					OutilsFichier.lireNomFichier( "\nEntrez le nom "
							+ "du fichier qui contient les jeux d'essai : " );

			fic = OutilsFichier.ouvrirFicTexteLecture( nomFicTest );

			if ( fic == null ) {
				peutContinuer = false;
			}
		}

		if ( peutContinuer ) {

			// Lire du clavier ou d'un fichier.
			OutilsLecture.fic = fic;
			OutilsLecture.type = type;

			/**
			 * Une instance de la classe PrincipalTp6 permet de gérer la
			 * vaccination contre la grippe saisonnière.
			 */

			new PrincipalTp6();

		} else {
			System.out.println( "\nImpossible de tester le programme." );
		}
	}
}
