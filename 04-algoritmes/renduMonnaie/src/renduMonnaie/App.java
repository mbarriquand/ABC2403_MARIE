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
		int deuxE = 0;
		int unE = 0;
		int cinquanteC = 0;
		int vingtC = 0;
		int dixC = 0;
		
		// TRAITEMENT
		
		total = 0;
		
		System.out.println("3.8 : Paiement et rendu monnaie");
		
		do {
			System.out.println("Saisir un prix :");
			prix = sc.nextDouble();
			total += prix;
			
		} while (prix > 0);
		
		total = Math.round(total*100)/100.0;
		
		System.out.println("Le client doit payer : " + total + " Euros." );
		
		nbrBillet = (int)(total / 5);
		
			if ( total % 5 != 0 ) {
				nbrBillet++;
			}
					
			totalBillet = nbrBillet * 5;
		
		System.out.println("Le client doit donner " + nbrBillet + " billets de 5 euros soit " + totalBillet + " Euros." );
		
		rendu = (totalBillet - total);
		rendu = Math.round(rendu*100)/100.0;
		
		if (rendu == 0) {
			System.out.println("Pas de pièces à rendre");
			System.exit(0); }
		
		System.out.println("Rendu monnaie : " + rendu + " Euros");
		System.out.println("Répartition de la monnaie à restituer au client :");
		
					
				
		while (rendu >= 2 ) {
			rendu -= 2;
			rendu = Math.round(rendu*100)/100.0;
			deuxE++;
			System.out.println("- " + deuxE + " pièces de 2€");
		}
		
		while (rendu >= 1) {
			rendu -= 1;
			rendu = Math.round(rendu*100)/100.0;
			unE++;
			System.out.println("- " + unE + " pièces de 1€");
		}
		
		while (rendu >= 0.50) {
			rendu -= 0.50;
			rendu = Math.round(rendu*100)/100.0;
			cinquanteC++;
			System.out.println("- " + cinquanteC + " pièces de 0.50€");
		}
		
		while (rendu >= 0.20) {
			rendu -= 0.20;
			rendu = Math.round(rendu*100)/100.0;
			vingtC++;
			System.out.println("- " + vingtC + " pièces de 0.20€");
		}
		
		while (rendu >= 0.09) {
			rendu -= 0.09;
			rendu = Math.round(rendu*100)/100.0;
			dixC++;
			System.out.println("- " + dixC + " pièces de 0.10€");
		}
		
		
		sc.close();

		}
	}
	

