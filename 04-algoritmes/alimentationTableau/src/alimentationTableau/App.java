package alimentationTableau;

import java.util.Scanner;

public class App {
	
	public static int ma1erFonction(String question)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
				
		int valeur = sc.nextInt();
		
		sc.close();
		
		return valeur;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int taille;
		int i;
		int[] tableau;
		int positifs;
		int negatifs;
		
		positifs = 0;
		negatifs = 0;
		
		System.out.println("Exercice 4.3 : Alimenter un tableau");
		
		/* System.out.println("Entrez le nombre de valeurs que vous souhaitez saisir :");
		taille = sc.nextInt(); */
		
		taille = App.ma1erFonction("Entrez le nombre de valeurs que vous souhaitez saisir :");
		
		tableau = new int [taille];

		for (i = 0; i < taille; i++) {
		
			/* System.out.println("Saisissez la valeur " + (i+1) + " / " + taille + " :");
			tableau[i] = sc.nextInt(); */
			
			tableau[i] = App.ma1erFonction("Saisissez la valeur " + (i+1) + " / " + taille + " :");
						
			if (tableau[i] >= 0) {
				positifs++;
			}
			else {
				negatifs++;
			}
		}
		
				
		System.out.println("Vous avez saisi " + positifs + " nombres positifs");
		System.out.println("Vous avez saisi " + negatifs + " nombres négatifs");
		
		sc.close();
		
	}

}
