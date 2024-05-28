package exoFonctions;

public class App {

	public static void main(String[] args) {
		
		
		// Ecrire une PROCEDURE qui calcule et affiche le périmètre d'un triangle
		
		int a = 20;
		int b = 30;
		int c = 40;
		
		App.calculerPerimetreTriangle(a,b,c);

		// Le programme doit afficher : 90.
		
		// Ecrire une PROCEDURE qui calcule la moyenne des valeurs du tableau

		
		int[] valeurs = new int[] {1, 3, 5, 7, 3, 4, 2, 4, 22};
		
		App.calculerMoyenne(valeurs);
	}
	
	/**
	 * Calcule le périmètre d'un triangle puis affiche le résultat
	 * @param a Le 1er côté
	 * @param b Le 2ème côté
	 * @param c Le 3ème côté
	 * @param perimetre Le resultat du calcul
	 */
		public static void calculerPerimetreTriangle(int a1, int b1, int c1)
	{
		int perimetre = a1 + b1 + c1;
		System.out.println(perimetre);
	}
		
		
		/**
		 * Calcule et affiche la moyenne des valeurs d'un tableau
		 * @param tableau le tableau de valeurs
		 * @param somme la somme des valeurs du tableau
		 * @param moyenne la moyenne des valeurs du tableau
		 * @param i le compteur d'incrémentation
		 */
		public static void calculerMoyenne(int[] tableau)
		{
			int somme = 0;
			for ( int i = 0; i < tableau.length; i++) {
		          somme += tableau[i];
		    }
			
			float moyenne = ((float)somme / (float)tableau.length); 
		         System.out.println(moyenne);
		}

}
