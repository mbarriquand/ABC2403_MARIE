package bouteille;

public class Bouteille {

	// ATTRIBUTES

	private float contenanceMaxEnL;
	private float contenuEnL;
	private boolean estOuvert;
	private String typeDeContenu;

	// ACCESS AND MODIFIERS

	// CONSTRUCTORS

	/* default constructor where values are forced */
	public Bouteille() {
		contenanceMaxEnL = 1;
		contenuEnL = 1;
		estOuvert = false;
		typeDeContenu = "H20";
	} 
	
	/* classic constructor */
	// the user will provide the details
		
	public Bouteille(float _contenanceMaxEnL,float _contenuEnL,boolean _estOuvert,String _typeDeContenu) {
		
		/* this refers to the object, not the class */
		this.contenanceMaxEnL=_contenanceMaxEnL;
		this.contenuEnL=_contenuEnL;
		this.estOuvert=_estOuvert;
		this.typeDeContenu=_typeDeContenu;
		
	}
	
	/* cloning constructor */
	
	public Bouteille(Bouteille _bouteilleARecopier) {
		this.contenanceMaxEnL= _bouteilleARecopier.contenanceMaxEnL;
		this.contenuEnL= _bouteilleARecopier.contenuEnL;
		this.estOuvert= _bouteilleARecopier.estOuvert;
		this.typeDeContenu= _bouteilleARecopier.typeDeContenu;
		
		// changing the content : 
		// _bouteilleARecopier.typeDeContenu="Champagne";
		
	}
	
	// METHODS
	
	public boolean open() {
		boolean managedToOpen;
		if (this.estOuvert = true) {
				managedToOpen = false;
		}
		else {
				this.estOuvert = true;
				managedToOpen = true;
		}
		return managedToOpen;
	}
	
	public boolean close() {
		boolean managedToClose;
		if (this.estOuvert = false) {
			managedToClose = true;
		}
		else {
				this.estOuvert = false;
				managedToClose = false;
		}
		return managedToClose;
	}
	
	public boolean fill() {
		boolean managedToFill;
		if (this.contenuEnL != this.contenanceMaxEnL) {
			managedToFill = true;
			this.contenuEnL = this.contenanceMaxEnL;
		}
		else {
			managedToFill = false;
		}
		return managedToFill;
	}
		
	/*
	
	public boolean fill () {
		boolean managedToFill;
		managedToFill = this.contenanceMaxEnL;
		return managedToFill;
	}
	
	
	public float donneContenanceEnCL() {
		float result;
		result = this.contenanceMaxEnL * 100;
		return result;
	} */
	
	
	}

