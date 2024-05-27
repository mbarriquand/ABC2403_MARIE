package demoTableau;

public class App {

	public static void main(String[] args) {
		
		// deux façons d'initialiser des tableaux
		
		int [] tableau;
		int [] tableau2;
		
		tableau = new int[3];

		tableau2 = new int[] { 1, 3, 5, 7, 9};
		
		System.out.println("Longueur de tableau : " + tableau.length);
		System.out.println("Longueur de tableau2 : " + tableau2.length);
		
		tableau[0] = 3;
		tableau[1] = 5;
		tableau[2] = 22;
		
		System.out.println("Element 0 de tableau = " + tableau[0]);
		System.out.println("Element 1 de tableau = " + tableau[1]);
		System.out.println("Element 2 de tableau = " + tableau[2]);
		
					
		/*
		 * POUR I de O à longueur(tableau), incrémenter I
		 * FIN POUR
		 */
		
		
		for (int i = 0; i < tableau.length; i++) {
			System.out.println("Element" + i + " de tableau = " + tableau[i]);
			
		}
		
	}

}
