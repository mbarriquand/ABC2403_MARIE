package methodeCours1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class App {

	 public static void main(String[] args) {
		 
		 String prenom = "Jane";
		 String nom = "Doe";
		 String phrase = App.concatenerPrenomNom(prenom, nom);
		 double resultat = App.additionner(17, 4.5);
	
		 
		 System.out.println(resultat);
		 System.out.println(phrase);
		 App.afficherJourHeureDuMoment();
	 }
	 
	 public static double additionner(double valeur1, double valeur2) {
		 double somme = 0;
		 somme = valeur1 + valeur2;
		 return somme;
	 }
	  	
	public static String concatenerPrenomNom(String prenom, String nom) {
		
		String retour;
		retour = prenom + "." + nom;
		return retour;
			
	}
	
	public static void afficherJourHeureDuMoment() {
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    Date date = new Date();
	    System.out.println(formatDate.format(date));
	}
	

}
