package nombreSuivant;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		int x;
		int y;
		int i; // VERSION POUR
		
		System.out.println("3.3 : Les nombres suivants.");
		
		System.out.println("Saisissez un nombre de départ: ");
        
		x = sc.nextInt();
        System.out.println("Les 10 nombres après " + x + " sont :");
  
        /*
        VERSION TANT QUE
        int compteur;
        compteur = 1;
         while (compteur <= 10) {
            y = x + compteur;
            System.out.println(y);
            compteur++;
        } */
        
        
        for (i = 1; i <= 10; i++)  {
        y = x + i;
        System.out.println(y);
		
        sc.close();
        }
	}
}