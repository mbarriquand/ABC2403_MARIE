package laFactorielle;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long x;
		long factorielle;
		
		System.out.println("3.5 : La factorielle.");
		System.out.println("Saisissez un nombre :");
		
		x = sc.nextLong();
		factorielle = 1;
		
		for (int i = 1; i <= x; i++) {
            factorielle *= i;
        }

        System.out.println("La factorielle de " + x + " est: " + factorielle);

        sc.close();

			sc.close();
	}

}
