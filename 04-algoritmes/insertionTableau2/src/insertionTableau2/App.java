package insertionTableau2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		Map<String, Double> tata;
		
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
					
		sc.close();
	}
}

	
