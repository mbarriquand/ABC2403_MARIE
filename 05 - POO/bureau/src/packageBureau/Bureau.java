package packageBureau;

import java.math.BigDecimal;

public class Bureau {

	protected BigDecimal hauteurEnCM;
	private BigDecimal largeurEnCM;
	private BigDecimal longueurEnCM;
	
	
	// CONSTRUCTORS
	
	public Bureau() {
		
		hauteurEnCM = BigDecimal.valueOf(80);
		largeurEnCM = BigDecimal.valueOf(100);
		longueurEnCM = BigDecimal.valueOf(120);
	}

	// CONSTRUCTORS W/ USER

	
	public Bureau(BigDecimal _hauteurEnCM, BigDecimal _largeurEnCM, BigDecimal _longueurEnCM) {
		this.hauteurEnCM = _hauteurEnCM;
		this.largeurEnCM = _largeurEnCM;
		this.longueurEnCM = _longueurEnCM;
	}
	
	
	// CLONING CONSTRUCTORS
	
	public Bureau(Bureau bureauACopier) {

		this.hauteurEnCM = bureauACopier.hauteurEnCM;
		this.largeurEnCM = bureauACopier.largeurEnCM;
		this.longueurEnCM = bureauACopier.longueurEnCM;
		
	}

		
	// METHODS


	private BigDecimal BigDecimal(int i) {

		return BigDecimal.valueOf(i);
	}
	
	
	
	public boolean positionnerALaHauteur(BigDecimal hauteur) {
		boolean versHauteurFixe = false;
		if (hauteur.compareTo(BigDecimal.ZERO) >= 0) {
		hauteurEnCM = hauteur;
		versHauteurFixe = true;
			
		}

		return versHauteurFixe;
	
	
	}


}
