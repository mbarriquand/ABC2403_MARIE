package categorieFootball;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc;
		sc = new Scanner(System.in);

		int age;
		String cat;
				
		System.out.println("Veuillez saisir votre âge.");
		
		age = sc.nextInt();
		
		if (age < 5) {
			System.out.println("Vous êtes trop jeune.");
		}
		else if (age < 6) {
			cat = "Débutant";
			//System.out.println(cat + "'Débutant'.");
		}
		
		else if (age < 8) {
			cat = "Poussin";
		}
		
		else if (age < 10) {
			cat = "Benjamin";
		}
		
		else if (age < 12) {
			cat = "Pupille";
		}
		
		else if (age < 14) {
			cat = "Minime";
		}
		
		else if (age < 17) {
			cat = "Cadet";
		}
		
		else if (age < 19) {
			cat = "Junior";
		}
		
		else if (age < 34) {
			cat = "Senior";
		}
			
		else {
			cat = "Vétéran";
		}
		
		// affichage
			System.out.println("Vous appartenez à la catégorie " + cat + ".");
		
		
		sc.close();
	}

}
