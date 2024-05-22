package lePlusGrand;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y = Integer.MIN_VALUE;
		int ligne = 0;
	
		
		System.out.println("3.6 : Et le plus grand est...");
		
		int i = 0;
		
		for (i = 1; i <= 20 ; i++)
		{
			System.out.print("Entrez le nombre numéro " + i + ": ");
			x = sc.nextInt();
				
		
			if (x > y) {
				y = x;
				ligne = i;
			}
		}
		
		System.out.println("Le plus grand des nombres saisis est : " + y + ". " + y + " était le nombre numéro " + ligne + "." );
		
		sc.close();
	
	}
}
	
	
