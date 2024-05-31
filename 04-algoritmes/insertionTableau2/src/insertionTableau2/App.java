package insertionTableau2;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String saisieUtilisateur;
		
		String[] legumesPrix = new String[1];
		
		String[] legumesPrix2;
		
		do {
			System.out.println("Saisissez un fruit ou un légume : ");
			
			saisieUtilisateur = sc.nextLine();
			
			if (!saisieUtilisateur.equals("go")) {
			
			legumesPrix[legumesPrix.length -1] = saisieUtilisateur;
				
			legumesPrix2 = new String[legumesPrix.length+1];
			
			System.arraycopy(legumesPrix, 0, legumesPrix2, 0, legumesPrix2.length);
			
			legumesPrix = legumesPrix2;
			
			}
			
		}
			while (!saisieUtilisateur.equals("go")); // comparaison de chaine de caractère, dans Java on passe par une fonction, equals. le ! est là pour demander l'inverse
		
		for (int i = 0; i < legumesPrix.length; i++) {
			System.out.println(legumesPrix[i]);
		}
		
		/* PARCOURIR UN TABLEAU A L'ENVERS
		 * 
		for (int i = legumesPrix.length-1; i >= 0; i--) {
			
		}
		*/
		
		sc.close();
		
			
		
	/*	tentatives infructueuses
	 * 
	 * Map<String, Double> tata;
		
		Scanner sc = new Scanner(System.in);
		
		String legume1 = ("");
				
		System.out.println("Exercice 2 : les fruit et légumes");
		
		ArrayList<String> legume = new ArrayList<String>();
		
		while (!legume1.contains("go")) {
			
			System.out.println("Saisir le légume et le prix/kg");
			legume1 = sc.nextLine();	
			String[] toto = legume1.split(" ");
			
			if (toto.length == 2) {
			legume.add(legume1);
			double prix1 = Double.parseDouble(toto[1]);
				
			}
		}
		
		System.out.println(legume);
		
		Collections.sort(legume);
		
		System.out.println("Le moins cher est : " + legume.get(0));
					
		sc.close(); */
	}
}

	
