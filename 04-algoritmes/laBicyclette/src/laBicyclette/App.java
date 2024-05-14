package laBicyclette;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc; 
		sc = new Scanner (System.in);
		
		Boolean beauTemps;
		Boolean veloOk;
		Boolean reparationsImmediates;
		Boolean livrePossede;
		Boolean livreDispoBibliotheque;
		
	System.out.println("La Bicyclette");
	System.out.println("Est-ce qu'il fait beau ?");
	beauTemps = sc.nextBoolean();
	
	if (beauTemps == true) {
		System.out.println("Est-ce que le vélo est en bon état ?");
		veloOk = sc.nextBoolean();

		if (veloOk == true) {
			System.out.println("J'irai me ballader à bicyclette");
		}
			else {
				System.out.println("Le garagiste peut-il s'en occuper immédiatement ?");
				 reparationsImmediates = sc.nextBoolean();
				 
				 if (reparationsImmediates == true) {
					 System.out.println("J'irai me ballader à bicyclette");
				 }
				 	else {
			System.out.println("J'irai cueillir des joncs");	
				 	}
			}
	}
		
	else {
		System.out.println("Je vais lire un livre");
		System.out.println("Est-ce que j'ai GoT ?");
		livrePossede = sc.nextBoolean();
		
	
		if (livrePossede == false) {
			System.out.println("Je vais à la bibliothèqe");
			System.out.println("Est-ce que GoT est disponible ?");
			livreDispoBibliotheque = sc.nextBoolean();
		
			if (livreDispoBibliotheque == true) {
				System.out.println("J'emprunte GoT");

			}
			
				else {
					System.out.println("J'emprunte un roman policier");
					}
				
		
		System.out.println("Je rentre chez moi");
	}
			
			else {
			System.out.println("Je lis GoT");
		
			}
		
		System.out.println("Lecture de mon livre dans mon fauteuil");
			}
		
	sc.close();
		}
	}


	

