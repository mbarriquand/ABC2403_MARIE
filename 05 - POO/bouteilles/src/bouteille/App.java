package bouteille;

public class App {

	public static void main(String[] args) {
		
		/* Bouteille bouteille1 = new Bouteille();
		
		float a=1.2f;
		
		Bouteille bouteille2 = new Bouteille(a, 0.8f, true, "h2o");
		
		Bouteille bouteille3 = new Bouteille(bouteille2);
		
		// float contenanceEnCLDeBouteille2 = bouteille2.donneContenanceEnCL(); */
		
		Bouteille bouteilleCoca = new Bouteille(0.5f, 0.5f, false, "Coca");
		
		boolean openOK = bouteilleCoca.open();
		
		boolean openOK2 = bouteilleCoca.open();
		
		boolean closeOK = bouteilleCoca.close();
		
		boolean closeOK2 = bouteilleCoca.close();
		
		boolean fillOK = bouteilleCoca.fill();
		
		boolean fillOK2 = bouteilleCoca.fill();
		
	}

}
