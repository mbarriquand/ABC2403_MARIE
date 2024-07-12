package projetCanards;

public class App {

	public static void main(String[] args) {


	String[] bandeAPicsou = new String[] {"Riri", "Fifi", "Loulou", "et", "Picsou"};
	String[] superNanas = new String[] {"Belle", "Bulle", "Rebelle"};
	String[] mysteryMachine = new String[] {"Fred", "Daphne", "Velma", "Shaggy", "Scoobydoo", "et", "les Scooby Snacks"};
	
	String resultat1 = concatDessinAnimes(bandeAPicsou);
	String resultat2 = concatDessinAnimes(superNanas);
	String resultat3 = concatDessinAnimes(mysteryMachine);
	System.out.println(resultat1);
	System.out.println(resultat2);
	System.out.println(resultat3);
}
	
	public static String concatDessinAnimes (String[] tab) {
		

		String retour = "- ";
		
		for(int i = 0; i < tab.length; i++) {
		retour += tab[i] + " ";
		}
		
		return retour;
		
		} 
	


}
