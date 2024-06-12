package bureau;

public class Desk {

	// ATTRIBUTES
	
	private float height;
	private float height1;
	private float height2;
	private float height3;
	private boolean hasPower;
	
	// CONSTRUCTORS
	
	//default desk
	public Desk() {
		height1 = 90;
		height2 = 120;
		height3 = 150;
		hasPower = true;
	}

	public Desk(float _height, float _height1,
			float _height2, float _height3, boolean _hasPower) {
		this.height = _height;
		this.height1 = _height1;
		this.height2 = _height2;
		this.height3 = _height3;
	}
		
	// METHODS
		
	public boolean goesToHeight1() {
		boolean managesToGoToHeight1;
		if (this.hasPower && this.height == this.height1) {
			return managesToGoToHeight1 = false;
		}
		else if ( this.hasPower && this.height != this.height1) {
			
			managesToGoToHeight1 = true;
		}
		return managesToGoToHeight1;
	}
		
	

}
