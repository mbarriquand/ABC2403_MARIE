package bureau;

public class App {

	public static void main(String[] args) {

				
		Desk bureauDeBase = new Desk();
		
		 		
		// test de la méthode aDuCourant
		
		Desk bureauOn = new Desk(150f, 150f, 65f, 80f, 100f, 120f, true);
		boolean on = bureauOn.aDuCourant();
		
		Desk bureauOff = new Desk(150f, 150f, 65f, 80f, 100f, 120f, false);
		boolean off = bureauOff.aDuCourant();
		
		// test de la méthode peutMonter
		
		Desk bureau1 = new Desk(80f, 150f, 65f, 80f, 100f, 120f, true);
		boolean monte1 = bureau1.monter(100f);
		
		Desk bureau2 = new Desk(80f, 150f, 65f, 80f, 100f, 120f, false);
		boolean monte2 = bureau2.monter(100f);
		
		Desk bureau3 = new Desk(150f, 150f, 65f, 80f, 100f, 120f, true);
		boolean monte3 = bureau3.monter(100f);
		
		// test de la méthode peutDescendre
		
		Desk bureau4 = new Desk(80f, 150f, 65f, 80f, 100f, 120f, true);
		boolean descend1 = bureau4.descendre(100f);
		
		Desk bureau5 = new Desk(80f, 150f, 65f, 80f, 100f, 120f, false);
		boolean monte5 = bureau5.descendre(100f);
		
		Desk bureau6 = new Desk(150f, 150f, 65f, 80f, 100f, 120f, true);
		boolean monte6 = bureau6.descendre(100f);

		// test de la méthode allerAHauteur1
		
		Desk bureau7 = new Desk(150f, 150f, 65f, 80f, 100f, 120f, true);
		boolean hauteur11 = bureau7.allerAHauteur1();
		
		Desk bureau8 = new Desk(80f, 150f, 65f, 80f, 100f, 120f, false);
		boolean hauteur12 = bureau8.allerAHauteur1();
		
		Desk bureau9 = new Desk(150f, 150f, 65f, 80f, 100f, 120f, true);
		boolean hauteur13 = bureau9.allerAHauteur1();
		
		// test de la méthode allerAHauteur2
		
		Desk bureau10 = new Desk(150f, 150f, 65f, 80f, 100f, 120f, true);
		boolean hauteur21 = bureau10.allerAHauteur2();
		
		Desk bureau11 = new Desk(80f, 150f, 65f, 80f, 100f, 120f, false);
		boolean hauteur22 = bureau11.allerAHauteur2();
		
		Desk bureau12 = new Desk(150f, 150f, 65f, 80f, 100f, 120f, true);
		boolean hauteur23 = bureau12.allerAHauteur2();
		
		// test de la méthode allerAHauteur3
		
		Desk bureau13 = new Desk(150f, 150f, 65f, 80f, 100f, 120f, true);
		boolean hauteur31 = bureau13.allerAHauteur3();
		
		Desk bureau14 = new Desk(80f, 150f, 65f, 80f, 100f, 120f, false);
		boolean hauteur32 = bureau14.allerAHauteur3();
		
		Desk bureau15 = new Desk(150f, 150f, 65f, 80f, 100f, 120f, true);
		boolean hauteur33 = bureau15.allerAHauteur3();
		
		// test de la méthode positionnerALaHauteur
		 
		Desk bureau16 = new Desk(150f, 150f, 65f, 80f, 100f, 120f, true);
		boolean hauteurCustom1 = bureauDeBase.positionnerALaHauteur(105);
		
		Desk bureau17 = new Desk(80f, 150f, 65f, 80f, 100f, 120f, false);
		boolean hauteurCustom2 = bureauDeBase.positionnerALaHauteur(85);
		
		Desk bureau18 = new Desk(150f, 150f, 65f, 80f, 100f, 120f, true);
		boolean hauteurCustom = bureauDeBase.positionnerALaHauteur(60);
	}

}
