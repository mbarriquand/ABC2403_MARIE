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
		
	public boolean peutMonter(float hauteur) {
		boolean versLeHaut = false;
		if (this.branche == true && this.hauteurEnCM < this.hauteurMaxEnCM) {
			this.hauteurEnCM = this.hauteurEnCM + hauteur;
			versLeHaut = true;
		}
		return versLeHaut;
	}
	
	public boolean peutDescendre (float hauteur) {
		boolean versLeBas = false;
		if (this.branche == true && this.hauteurEnCM > this.hauteurMinEnCM); {
			this.hauteurEnCM = this.hauteurEnCM - hauteur;
			versLeBas = true;
		}
		return versLeBas;
	}
	
	public boolean peutAllerAHauteur1 () {
		boolean versHauteur1 = false;
		if (this.branche == true && this.hauteurEnCM != this.hauteur1EnCM); {
			this.hauteurEnCM = this.hauteur1EnCM;
			versHauteur1 = true;
		}
		return versHauteur1;
	}
	
	public boolean peutAllerAHauteur2 () {
		boolean versHauteur2 = false;
		if (this.branche == true && this.hauteurEnCM != this.hauteur2EnCM); {
			this.hauteurEnCM = this.hauteur2EnCM;
			versHauteur2 = true;
		}
		return versHauteur2;
	}
	
	public boolean peutAllerAHauteur3 () {
		boolean versHauteur3 = false;
		if (this.branche == true && this.hauteurEnCM != this.hauteur3EnCM); {
			this.hauteurEnCM = this.hauteur3EnCM;
			versHauteur3 = true;
		}
		return versHauteur3;
	}
	
	public boolean positionnerALaHauteur (float hauteur) {
		boolean versHauteurCustom = false;
		if (this.branche == true && this.hauteurEnCM <= this.hauteurMaxEnCM && this.hauteurEnCM >= this.hauteurMinEnCM); {
			this.hauteurEnCM = hauteur;
			versHauteurCustom = true;
		}
		return versHauteurCustom;
		}
	}
	


	

