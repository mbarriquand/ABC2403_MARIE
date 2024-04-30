package airesEtVolumes;

import java.util.Scanner;

import java.lang.Math;

public class App {

	// exercice 1.4
	
	public static void main(String[] args) {
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		double R;
		
		double aire;
		
		double volume;
		
		
		System.out.println("Veuillez saisir un rayon");
		
		R = sc.nextDouble();
		
		aire = (4.0 * Math.PI * (Math.pow(R,  2)));
			
		volume =  (4.0 * Math.PI * (Math.pow(R,  3)));
		
		System.out.println("L'aire de la sphère de rayon " + R + " est " + aire + " et son volume est " + volume + ".");
		
		sc.close();
		
	}

}
