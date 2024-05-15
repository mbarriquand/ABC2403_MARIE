package plageSable;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc;
		int nombre;
		
		sc = new Scanner(System.in);

		System.out.println("3.1 : La bonne plage de sable");
		System.out.println("Saisissez un nombre entre 1 et 3");
		nombre = sc.nextInt();
		
			do  {
				System.out.println("La réponse ne convient pas");
				System.out.println("Saisissez un nombre entre 1 et 3");
				nombre = sc.nextInt();
			}
			while (nombre < 1 || nombre > 3);
					
					
			System.out.println("Bravo, vous avez réussi !");
			sc.close();
		}
	}


