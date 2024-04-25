package inversionDeValeurs;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		double A;
		double B;
		double C;
		
		System.out.println("Veuillez saisir un nombre entier");
		
		A = sc.nextInt();
		
		System.out.println("Veuillez saisir un autre nombre entier");

		B = sc.nextInt();
		
		System.out.println("Vos valeurs sont " + A + " et " + B);
		
		C = B;
		B = A;
		
		System.out.println("Vos valeurs inversées sont " + C + " et " + B);
		
		
		
		sc.close();
	}

}
