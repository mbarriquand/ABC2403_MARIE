package moyenneDe2Nombres;

import java.util.Scanner;

public class App {

	// exercice 1.3
	
	public static void main(String[] args) {
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		float nombre1;
		
		float nombre2;
		
		float moyenne;
		
		System.out.println("Veuillez saisir un nombre entier :");
		
		nombre1 = sc.nextInt();
		
		System.out.println("Veuillez saisir un nombre entier :");
		
		nombre2 = sc.nextInt();

		sc.close();
		
		moyenne = ((nombre1 + nombre2) /2);
		
		System.out.println("La moyenne de " + nombre1 + " et " + nombre2 + " est " + moyenne + ".");
		
	}

}
