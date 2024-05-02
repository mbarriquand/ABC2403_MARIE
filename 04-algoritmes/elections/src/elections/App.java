package elections;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double c1;
		double c2;
		double c3;
		double c4;
		double resultat;
		double triche;
		
		System.out.println("Saisir le score en pourcentage du candidat numéro 1");
		c1 = sc.nextDouble();
			
		System.out.println("Saisir le score en pourcentage du candidat numéro 2");
		c2 = sc.nextDouble();
			
		System.out.println("Saisir le score en pourcentage du candidat numéro 3");
		c3 = sc.nextDouble();
		
		System.out.println("Saisir le score en pourcentage du candidat numéro 4");
		c4 = sc.nextDouble();
		
		triche = c1 + c2 + c3 + c4;
		
		if ( triche > 100) {
			System.out.println("Quelqu'un tente de voler les élections!");
			System.exit(0);
		}
		else {
			
		
			resultat = c1 / 100;
					
			if (resultat > 0.5) {
				System.out.println("Le candidat numéro 1 est élu");
			}
			
			else if (resultat < 0.125) {
				System.out.println("Le candidat numéro 1 est battu");
				}
			
			else if (c1 > c2 && c1 > c3 && c1 > c4) {
				System.out.println("Le candidat numéro 1 va au second tour en ballotage favorable");
				}
			
			else {
				System.out.println("Le candidat numéro 1 va au second tour en ballotage défavorable");
			}
		
	}
		
			
		
		sc.close();
	}

}
