package sommeValeursTableau;

public class App {

	public static void main(String[] args) {
 
		float somme;
		somme = 0;

		System.out.println("Exercice 4.4 : Somme des valeurs d'un tableau");
		
		
		float [] tableau = new float[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		
					
		for ( int i = 0; i < tableau.length; i++) {
	          somme = somme + tableau[i];
	      }
		
		System.out.println("La somme des valeurs du tableau : " + somme);
	}

}
