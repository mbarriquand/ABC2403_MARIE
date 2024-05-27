package alimentationTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int taille;
		int i;
		int positifs = 0;
		int negatifs = 0;
		
		System.out.println("Exercice 4.3 : Alimenter un tableau");
		
		System.out.println("Combien de valeurs souhaitez vous saisir ?");
		taille = sc.nextInt();

		int [] tableau = new int[taille];
		
		for (i = 0; i < taille; i++) {
		
			System.out.println("Saisissez la valeur " + (i+1) + " :");
			tableau[i] = sc.nextInt();
						
			if (tableau[i] >= 0) {
				positifs++;
			}
			else {
				negatifs++;
			}
		}
		
		System.out.println("Vous avez saisi " + positifs + " valeurs positives et " + negatifs + " valeurs négatives.");
		
		sc.close();
	}

}
