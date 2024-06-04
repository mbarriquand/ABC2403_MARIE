package methodeCours1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class App {

	 public static void main(String[] args) {
		 
		 String prenom = "Jane";
		 String nom = "Doe";
		 String phrase = App.ConcatenerPrenomNom(prenom, nom);
		 double resultat = App.additionner(17, 4.5);
	
		 
		 System.out.println(resultat);
		 System.out.println(phrase);
		 App.AfficherJourHeureDuMoment();
	 }
	 
	 public static double additionner(double valeur1, double valeur2) {
		 double somme = 0;
		 somme = valeur1 + valeur2;
		 return somme;
	 }
	  	
	public static String ConcatenerPrenomNom(String prenom, String nom) {
		
		String retour;
		retour = prenom + "." + nom;
		return retour;
			
	}
	
	public static void AfficherJourHeureDuMoment() {
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    Date date = new Date();
	    System.out.println(s.format(date));
	}
	

}
