package positifOuNegatif;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc;
		sc = new Scanner(System.in);
		int nombre;

		System.out.println("Veuillez saisir un nombre entier");
		
		nombre = sc.nextInt();
		
		if(nombre > 0) {
			System.out.println(nombre + " est positif.");
		}
		else {
			System.out.println(nombre + " est négatif.");
		}
		
		sc.close();
	}

}
