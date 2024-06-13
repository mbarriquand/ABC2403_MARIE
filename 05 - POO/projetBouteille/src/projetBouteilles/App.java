package projetBouteilles;

import packageBouteilles.Bouteilles;

public class App {

	public static void main(String[] args) {

		
				/* Bouteilles bouteille1 = new Bouteilles();
				
				float a=1.2f;
				
				Bouteille bouteille2 = new Bouteille(a, 0.8f, true, "h2o");
				
				Bouteille bouteille3 = new Bouteille(bouteille2);
				
				// float contenanceEnCLDeBouteille2 = bouteille2.donneContenanceEnCL(); */
				
				Bouteilles bouteilleCoca = new Bouteilles(0.5f, 0.5f, true, "Coca");
				
				// Bouteille bouteilleCoca = new Bouteille(0.5f, 0.5f, false, "Coca");
					
				// Bouteille bouteilleCoca = new Bouteille(1f, 0.5f, true, "Coca");
				
				// Bouteille bouteilleCoca = new Bouteille(1f, 0.5f, false, "Coca");
				
				// Bouteille bouteilleCoca = new Bouteille(1f, 1f, true, "Coca");
				
				// Bouteille bouteilleCoca = new Bouteille(1f, 1f, false, "Coca");
				
				// Bouteille bouteilleCoca = new Bouteille(0f, 0f, true, "Coca");
				
				// Bouteille bouteilleCoca = new Bouteille(0f, 0f, false, "Coca");
						
				/* boolean openOK = bouteilleCoca.open();
				
				boolean openOK2 = bouteilleCoca.open();
				
				boolean closeOK = bouteilleCoca.close();
				
				boolean closeOK2 = bouteilleCoca.close();
				
				boolean fillOK = bouteilleCoca.fill();
				
				boolean fillOK2 = bouteilleCoca.fill();
				
				float contentOK = bouteilleCoca.convertContent();
				
				float contentOK2 = bouteilleCoca.convertContent(); */
				
				// boolean fillPartiallyOK = bouteilleCoca.fillPartially(0.4f);
				
				// boolean fillPartiallyOK = bouteilleCoca.fillPartially(0.4f);
				
				// boolean fillPartiallyOK = bouteilleCoca.fillPartially(0f);
				
				boolean emptyPartialOK = bouteilleCoca.emptyPartially(0.4f);
				
				 //boolean emptyPartialOK = bouteilleCoca.emptyPartially(0.4f);
				
				
				
			}


	}
