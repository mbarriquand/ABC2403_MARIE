package lePlusGrandBis;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int ligne = 0;
		int fin = 0;
		
		System.out.println("3.7 : Et le plus grand est... encore");
		
		int i = 0;
		
		x = 0;
		
		do {
			
			System.out.print("Entrez le nombre numéro " + (i+1) + ": ");
			x = sc.nextInt();
			i++;
			
			if (x > fin) {
				fin = x;
				ligne = i;
			}
		}
			
			while (x != 0); 
		
			
			System.out.println("Le plus grand des nombres saisis est : " + fin + ". " + fin + " était le nombre numéro " + ligne + "." );
			sc.close();
	}

}

