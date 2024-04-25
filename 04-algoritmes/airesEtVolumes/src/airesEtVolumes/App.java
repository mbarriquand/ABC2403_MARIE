package airesEtVolumes;

import java.util.Scanner;

public class App {

	// exercice 1.4
	
	public static void main(String[] args) {
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		double rayon;
		
		double aire;
		
		double volume;
		
		System.out.println("Veuillez saisir un rayon");
		
		rayon = sc.nextInt();
							
		aire = (4 * 3.14 * (rayon * rayon));
		
		volume =  ((4 * 3.14 * (rayon*rayon*rayon)) / 3);
		
		sc.close();
		
		System.out.println("L'aire du cercle de rayon " + rayon + " est " + aire + " et son volume est " + volume + ".");

	}

}
