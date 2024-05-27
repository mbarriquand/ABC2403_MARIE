package sommeValeursTableau;

public class App {

	public static void main(String[] args) {
 
		float somme;

		System.out.println("Exercice 4.4 : Somme des valeurs d'un tableau");
		
		float [] tableau = new float[] {1, 2, 3, 4, 4, 0, 7, 65, 7, 20 };
		
		somme = 0;
		
		
		for ( float i : tableau) {
	          somme = somme + i;
	      }
		
		System.out.println("Somme des valeurs du tableau : " + somme);
	}

}
