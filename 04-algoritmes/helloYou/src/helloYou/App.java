package helloYou;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String prenom; // Déclaration d'une variable "prenom" de type "chaine de caractères"
		
		Scanner sc; // Déclaration d'une variable de type Scnner (penser à ajouter la ligne d'import (cf ligne 3))
		
		sc = new Scanner(System.in); // Initialisation d'un nouveau Scanner
		
		System.out.println("Bonjour, veuillez saisir votre prénom: "); // Affichage
		
		prenom = sc.nextLine(); // Demande à l'utilisateur une saisie. 
		// Lorsque l'utilisateur validera avec la touche entrée, la saisie est récupérée dans la variable à gauche du signe"=")
		
		System.out.println("Bonjour " + prenom);
		

		sc.close(); // Fermeture du Scanner (OBLIGATOIRE)
		
	}

}
