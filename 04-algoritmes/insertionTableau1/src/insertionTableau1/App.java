package insertionTableau1;

import java.util.Scanner;
import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int i;
		int nouveauNbr;
		
		int [] tableau1 = new int[] {1,  4,  5,  10,  20,  22,  25,  30,  32};
		int [] tableau2 = new int[tableau1.length + 1];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercice 1 : insertion dans un tableau ordonné");
		
		System.out.println("Tableau initial : " + Arrays.toString(tableau1));
						
		System.out.println("Saisissez un nombre à insérer dans le tableau :");
		nouveauNbr = sc.nextInt();
		
		for (i = 0; i < tableau2.length-1; i++) {
			tableau2[i] = tableau1[i];
			
			tableau2[tableau1.length] = nouveauNbr;
			
		}
		
		Arrays.sort(tableau2);
		
		System.out.println("Tableau après insertion : " + Arrays.toString(tableau2));
		
		sc.close();
		
		}	
}

