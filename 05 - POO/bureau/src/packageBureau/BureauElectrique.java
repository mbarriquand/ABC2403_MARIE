package packageBureau;

import java.math.BigDecimal;

public class BureauElectrique extends Bureau {
	
private static BigDecimal BigDecimal(int i) {
		
		return BigDecimal.valueOf(i);
	}
	
	// VARIABLES 

	private boolean branche;
	private BigDecimal hauteur1EnCM;
	private BigDecimal hauteur2EnCM;
	private BigDecimal hauteur3EnCM;
	private final BigDecimal hauteurMaxEnCM;
	private final BigDecimal hauteurMinEnCM;
	
	// CONSTRUCTORS
	
	public BureauElectrique() {
		super();
		branche = true;
		hauteur1EnCM = BigDecimal(85);
		hauteur2EnCM = BigDecimal(95);
		hauteur3EnCM = BigDecimal (110);				
		hauteurMaxEnCM = BigDecimal(120);
		hauteurMinEnCM = BigDecimal(70);
	}

	
	public BureauElectrique(boolean _branche, BigDecimal _hauteurEnCM, BigDecimal _largeurEnCM, BigDecimal _longueurEnCM,
			BigDecimal _hauteur1EnCm, BigDecimal _hauteur2EnCM, BigDecimal _hauteur3EnCM,
			BigDecimal _hauteurMaxEnCM, BigDecimal _hauteurMinEnCM) {
		
			
		super(_hauteurEnCM, _largeurEnCM, _longueurEnCM);
		this.branche = _branche;
		this.hauteur1EnCM = _hauteur1EnCm;
		this.hauteur2EnCM = _hauteur2EnCM;
		this.hauteur3EnCM = _hauteur3EnCM;
		this.hauteurMaxEnCM = _hauteurMaxEnCM;
		this.hauteurMinEnCM = _hauteurMinEnCM;
	
	}
	
	public BureauElectrique(BureauElectrique bureauACopier) {
		super(bureauACopier);
		this.branche = bureauACopier.branche;
		this.hauteur1EnCM = bureauACopier.hauteur1EnCM;
		this.hauteur2EnCM = bureauACopier.hauteur2EnCM;
		this.hauteur3EnCM = bureauACopier.hauteur3EnCM;
		this.hauteurMaxEnCM = bureauACopier.hauteurMaxEnCM;
		this.hauteurMinEnCM = bureauACopier.hauteurMinEnCM;
		
	}
	
	// METHODS
	
	public boolean aDuCourant() {

		return branche;
	
	}
	
	public boolean monter(BigDecimal hauteur) {
		boolean versLeHaut = false;
		if ((super.hauteurEnCM.add(hauteur)).compareTo(this.hauteurMaxEnCM) < 0 && hauteur.compareTo(BigDecimal.ZERO) >= 0 && this.branche == true) {
			super.hauteurEnCM = super.hauteurEnCM.add(hauteur);
			versLeHaut = true;
		}
		return versLeHaut;
	}
	
	@Override 
	public boolean positionnerALaHauteur(BigDecimal hauteur) {
		boolean versHauteurCustom = false;
		if (branche == true && hauteur.compareTo(hauteurMaxEnCM) >=0 && hauteur.compareTo(hauteurMinEnCM) <=0) {
			boolean r= super.positionnerALaHauteur(hauteur);
			// dire s'il a réussi à le faire
			versHauteurCustom = r;
		}
		return versHauteurCustom;
	}
}

