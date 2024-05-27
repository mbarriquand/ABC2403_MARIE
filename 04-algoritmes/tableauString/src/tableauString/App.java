package tableauString;

public class App {

	public static void main(String[] args) {

		// solution 1
		// déclare un tableau de 6 cases que l'on remplit manuellement
		
		char[] tableau = new char[6];
		
		
		
		tableau[0] = 'a';
		tableau[1] = 'e';
		tableau[2] = 'i';
		tableau[3] = 'o';
		tableau[4] = 'u';
		tableau[5] = 'y';
		
		// solution 2
		// déclare un tableau et l'initialise avec 6 valeurs
		
		char [] tableauBis = new char [] {'a', 'e', 'i', 'o', 'u', 'y'};
		
		System.out.println("Exercice 4.2 : Créer un tableau de chaines de caractères");
		
		System.out.println(tableau[0]);
		System.out.println(tableauBis);

	}

}
