package dateValide;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// VARIABLES
		Scanner sc;
		sc = new Scanner(System.in);
		int jour;
		int mois;
		int annee;
		
		// TRAITEMENT
		
		System.out.println("Veuillez saisir le jour");
		jour = sc.nextInt();
		
		System.out.println("Veuillez saisir le mois");
		mois = sc.nextInt();
		
		System.out.println("Veuillez saisir l'année");
		annee = sc.nextInt();
		
			if (jour > 31) {
				System.out.println("Cette date n'est pas valide");
			}
		
			else if	(jour > 29 && mois == 2) {
				System.out.println("Cette date n'est pas valide");
			}
			
			else if (jour == 29 && mois == 2 && (annee % 4 == 0)) {

				System.out.println("Cette date est valide");
			}
			
			else if (jour == 31 && (mois == 4 || mois == 6 || mois == 9 || mois == 11)) {
				System.out.println("Cette date n'est pas valide");
				
			}
			
			else {
				System.out.println("Cette date est valide");
			}
			
		sc.close();
			
		}
	}
