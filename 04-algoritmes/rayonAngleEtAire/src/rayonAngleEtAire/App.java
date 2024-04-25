package rayonAngleEtAire;

import java.util.Scanner;

import java.lang.Math;

public class App {

	// exercice 1.3
	
	public static void main(String[] args) {
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		double rayon;
		
		double angle;
		
		double aire;
		
		System.out.println("Veuillez saisir le rayon de votre secteur circulaire :");
		
		rayon = sc.nextInt();
		
		System.out.println("Veuillez saisir l'angle de votre secteur circulaire :");
		
		angle = sc.nextInt();
				
		aire = ((Math.PI * (Math.pow(rayon,  2)) * angle) / 360);
		
		System.out.println("L'aire du secteur circulaire de rayon " + rayon + " et d'angle " + angle + " est " + aire + ".");
		
		sc.close();
		
	}

}
