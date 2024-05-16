package plageGalets;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		
		Scanner sc;
		sc = new Scanner (System.in);
		int nombre;
		
		System.out.println("3.2 : La bonne plage de galets");
		
			do {
				System.out.println("Saisissez un nombre");
				nombre = sc.nextInt();
				
				if (nombre < 10) {
					System.out.println("Plus grand!");
			
				}
				
				else if (nombre > 20) {
					System.out.println("Plus petit!");
				
				}
			
			}
			while (nombre < 10 || nombre > 20);
			
			
			System.out.println("Yes, you did it !");
			sc.close(); 
	}
}
