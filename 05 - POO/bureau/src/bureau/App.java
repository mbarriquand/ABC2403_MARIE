package bureau;

public class App {

	public static void main(String[] args) {

				
		Desk bureauDeBase = new Desk();
		
		// test de la méthode aDuCourant
		
		// test de la méthode peutMonter
		Desk bureau1 = new Desk(80f, 150f, 65f, 80f, 100f, 120f, true);
		boolean monte1 = bureau1.peutMonter();
		Desk bureau2 = new Desk(80f, 150f, 65f, 80f, 100f, 120f, false);
		boolean monte2 = bureau2.peutMonter();
		Desk bureau3 = new Desk(150f, 150f, 65f, 80f, 100f, 120f, true);
		boolean monte3 = bureau3.peutMonter();
		
		// test de la méthode peutDescendre

	
	}

}
