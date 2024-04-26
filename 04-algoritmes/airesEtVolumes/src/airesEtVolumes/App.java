package airesEtVolumes;

import java.util.Scanner;

import java.lang.Math;

public class App {

	// exercice 1.4
	
	public static void main(String[] args) {
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		double rayon;
		
		double aire;
		
		double volume;
		
		
		System.out.println("Veuillez saisir un rayon");
		
		System.out.println("");
		
		rayon = sc.nextDouble();
		
		System.out.println("");

		aire = (4.0 * Math.PI * (Math.pow(rayon,  2)));
			
		volume =  (4.0 * Math.PI * (Math.pow(rayon,  3)));
		
		sc.close();
		
		System.out.println("L'aire de la sphère de rayon " + rayon + " est " + aire + " et son volume est " + volume + ".");
		
		sc.close();
		
	}

}
