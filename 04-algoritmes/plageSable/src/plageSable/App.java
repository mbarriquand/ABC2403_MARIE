package plageSable;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		int nombre;
		int compteur = 1;
			
		
		System.out.println("3.1 : La bonne plage de sable");
			do  {
			
				if (compteur <= 1) {
					System.out.println("Saisissez un nombre entre 1 et 3");
				nombre = sc.nextInt();
				}
				else {
					System.out.println("Erreur ! Resaisissez un nombre entre 1 et 3");
					nombre = sc.nextInt();				
					}
				
				compteur++;
			
			//	System.out.println("La réponse ne convient pas");
			
			}
			while (nombre < 1 || nombre > 3);
					
					
			System.out.println("Bravo, vous avez réussi ! " + nombre);
			sc.close();
		}
	}


