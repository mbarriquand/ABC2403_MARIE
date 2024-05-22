package renduMonnaie;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		
		// VARIABLES
		
		double total;
		double prix;
		int nbrBillet;
		double totalBillet;
		double rendu;
		int deuxE;
		int unE;
		int cinquanteC;
		int vingtC;
		int dixC;
		
		// TRAITEMENT
		
		total = 0;
		
		System.out.println("3.8 : Paiement et rendu monnaie");
		
		do {
			System.out.println("Saisir un prix :");
			prix = sc.nextDouble();
			total += prix;
			
		} while (prix > 0);
		
		System.out.println("Le client doit payer : " + total + " Euros." );
		
		nbrBillet = (int)(total / 5);
		
			if ( total % 5 != 0 ) {
				nbrBillet = ((int)total / 5) + 1;
			}
					
			totalBillet = nbrBillet * 5;
		
		System.out.println("Le client doit donner " + nbrBillet + " billets de 5 euros soit " + totalBillet + " Euros." );
		
		rendu = (totalBillet - total);
		
		if (rendu == 0) {
			System.out.println("Pas de pièces à rendre");
			System.exit(0); }
		
		System.out.println("Rendu monnaie : " + rendu + " Euros");
		System.out.println("Répartition de la monnaie à restituer au client :");
		
				// ça marche jusqu'ici, ensuite rip
			
		dixC = ((int)rendu * 10);
		rendu -= dixC * 10;
	
		if (dixC > 0) {
			System.out.println("- " + dixC + " pièces de 0.10€");
		}
	
		sc.close();

		}
	}
	

