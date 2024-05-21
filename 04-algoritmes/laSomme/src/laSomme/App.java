package laSomme;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// VARIABLES
		Scanner sc;
		sc = new Scanner(System.in);
		int x;
		int somme;
		
		// TRAITEMENT
		System.out.println("3.4 : La somme.");
		System.out.println("Saisissez un nombre");
		
		x = sc.nextInt();
        somme = 0;
        
        for (int i = 1; i <= x; i++) {
            somme += i;
        }

        System.out.println("La somme des nombres jusqu'à " + x + " est : " + somme);
		
		sc.close();
	}

}
