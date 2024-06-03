package evaluationAlgorithmes;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {

		int [] numbers = new int[] {2, 4, 1, 8, 6, 14, 23, 25, 7, 42};
		Arrays.sort(numbers);
		int total = 0;
		float moyenne = 0;
		int plusGrand = 0;
		int carre = 0;
		
		System.out.println("Bienvenue dans le programme de calcul du tableau d'entier");
		
		for (int i = 0; i < numbers.length; i++) {
			total += (float)numbers[i];
			moyenne = (float)total / numbers.length;

		}
		plusGrand = numbers[9];
		carre = plusGrand * plusGrand;
		
		
		System.out.println("Moyenne des valeurs du tableau : " + moyenne);
		System.out.println("Valeur la plus grande :" + plusGrand + " élevée au carré : " + carre);
	}

}
