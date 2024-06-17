package bureau;

public class Desk {

	// ATTRIBUTES
	
	private float hauteurEnCM;
	private float hauteurMaxEnCM;
	private float hauteurMinEnCM;
	private float hauteur1EnCM;
	private float hauteur2EnCM;
	private float hauteur3EnCM;
	private boolean branche;
	
	// CONSTRUCTORS
	
	//default desk
	public Desk() {
		hauteurEnCM = 80;
		hauteurMaxEnCM = 120;
		hauteurMinEnCM = 65;
		hauteur1EnCM = 80;
		hauteur2EnCM = 100;
		hauteur3EnCM = 120;
		branche = true;
	}

	public Desk(float _hauteurEnCM, float _hauteurMaxEnCM,
			float _hauteurMinEnCM, float _hauteur1EnCM, float _hauteur2EnCM,
			float _hauteur3EnCM, boolean _branche) {
		this.hauteurEnCM = _hauteurEnCM;
		this.hauteurMaxEnCM = _hauteurMaxEnCM;
		this.hauteurMinEnCM = _hauteurMinEnCM;
		this.hauteur1EnCM = _hauteur1EnCM;
		this.hauteur2EnCM = _hauteur2EnCM;
		this.hauteur3EnCM = _hauteur3EnCM;
		this.branche = _branche;
	}
		
	// METHODS
	
	public boolean aDuCourant() {
		boolean estBranche = false;
		if (this.branche == true) {
			estBranche = true;
	}
	return estBranche;
	
	}
		
	public boolean peutMonter() {
		boolean versLeHaut = false;
		if (this.branche == true && this.hauteurEnCM < this.hauteurMaxEnCM) {
			versLeHaut = true;
		}
		return versLeHaut;
	}
	
	public boolean peutDescendre () {
		boolean versLeBas = false;
		if (this.branche == true && this.hauteurEnCM > this.hauteurMinEnCM); {
			versLeBas = true;
		}
		return versLeBas;
	}
	
	
	
}

	

