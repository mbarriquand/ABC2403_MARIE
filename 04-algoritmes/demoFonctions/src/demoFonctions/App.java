package demoFonctions;

public class App {
	


	public static void main(String[] args) 
	{
		System.out.println("Démo sur les fonctions");
		
		App.afficherHelloWorld();
		App.afficherHelloPrenom("Mary");
		App.afficherHelloPrenom("Mare");
		
		int somme = App.calculerSomme(7, 3);
		
		System.out.println(somme);
		
			}
	
	/**
	 * Affiche "Hello World ! " dans la console
	 * Utilisation : App.helloWorld();
	 */
		public static void afficherHelloWorld() // SIGNATURE
	{
				// System.out.println("Hello World !");
			App.afficherHelloPrenom("World"); // Exemple d'une fonction appelée à l'intérieur d'une autre fonction
		}
	
	/**
	 * Affiche le prénom foruni en argument dans la console
	 * @param prenom Le prénom à afficher
	 */
	public static void afficherHelloPrenom(String prenom)
	{
		System.out.println("Hello " + prenom);
	}
	
	/**
	 * Affiche la somme de a et b dans la console
	 * @param a le premier nombre
	 * @param b le second nombre
	 * @return le résultat du calcul
	 */
		public static int calculerSomme(int a, int b)
	{
		int resultat = a + b;
		return resultat;
	}

}
