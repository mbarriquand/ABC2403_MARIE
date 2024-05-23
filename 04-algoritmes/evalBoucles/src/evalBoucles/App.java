package evalBoucles;

import java.util.Scanner; // importation du scanner

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // initialisation du scanner
		
		// VARIABLES
		
		int Position = 2;
		int N;
		String Resultat = "0 1";
		long NbPrecedent = 0;
		long NbCourant = 1;
		long NbSuivant; 
		
		
		
		// TRAITEMENT
		
		System.out.println("Suite de Fibonacci. Combien de nombre de la suite souhaitez-vous afficher?");
		N = sc.nextInt();
		
		if (N > 2) {
			do {
				NbSuivant = NbPrecedent + NbCourant;
				Resultat = Resultat + " " + NbSuivant;
				NbPrecedent = NbCourant;
				NbCourant = NbSuivant;
				Position++;
			}
			
			while (Position < N);

		}
		else {
			N = 2;
		}
		
		System.out.println("Les " + N + " premiers nombre de la suite de Fibonacci sont \n " + Resultat);
		
		
		sc.close(); // fermeture du scanner
		
		// FIN PROGRAMME
	}

} 
