package produitPositifOuNegatif;

import java.util.Scanner; // needed to read user input

public class App {

	public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);
		
		int A;
		int B;
		long C;
		
		System.out.println("Veuillez saisir un nombre entier");
		
		A = sc.nextInt();
		
		System.out.println("Veuillez saisir un nombre entier");
		
		B = sc.nextInt();
		
		C = A * B;
		
		if(C > 0) {
			System.out.println("Le produit de " + A + " et " + B + " est positif.");
		}
		else {
			System.out.println("Le produit de " + A + " et " + B + " est négatif.");
		}
		sc.close();
	}

}
