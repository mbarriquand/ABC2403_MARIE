package predictionsInfaillibles;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int heure;
		int minutes;
		int minutesPlus3;
		int heurePlus3;
		
		System.out.print("Saisissez l'heure (entre 0 et 23): ");
        heure = sc.nextInt();
        
        System.out.print("Saisissez les minutes (entre 0 et 59): ");
        minutes = sc.nextInt();
        
        if (heure < 0 || heure > 23 || minutes < 0 || minutes > 59) {
        	System.out.println("Les données saisies sont invalides");
        	System.exit(0);
        }
 
        minutesPlus3 = minutes + 3;
        heurePlus3 = heure;
        
        if (minutesPlus3 >=60 ) {
        	minutesPlus3 -=60;
        	heurePlus3++;
        
        	if (heurePlus3 >23 ) {
        		heurePlus3 -=24;
        	}
        }
        
        System.out.println("Dans trois minutes, il sera " + heurePlus3 + "h" + minutesPlus3);
        		
		sc.close();
}
}
