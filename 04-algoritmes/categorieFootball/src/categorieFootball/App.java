package categorieFootball;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		Scanner sc;
		sc = new Scanner(System.in);

		int age;
		String cat;
		
		// TRAITEMENT
		System.out.println("Catégorie Football");
		
		System.out.println("Saisissez votre âge.");
		
		age = sc.nextInt();
		
		
		if (age < 5) { 
			
			cat = "trop jeune";
			
		}
		
		else if (age < 6) {
			cat = "un débutant";
		}
		
		
		else if (age < 8) {
			cat = "un poussin";
		}
		
		
		else if (age < 10) {
		cat = "un benjamin";		
		}
		
		
		else if (age < 12) {
			cat = "un pupille";
		}
		
		
		else if (age < 14) {
			cat = "un minime";
		}
		
		
		else if (age < 16) {
			cat = "un cadet";
		}
		
		
		else if (age < 18) {
			cat = "un junior";
		}
		
		
		else if (age < 34) {
			cat = "un senior";
		}
		
		
		else {
			cat = "un vétéran";
		}
		
		
		System.out.println("Vous êtes " + cat + "."); 
		
		
		
	sc.close();
	}
}
