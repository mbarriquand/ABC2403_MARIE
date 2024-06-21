package packageBureau;

import java.math.BigDecimal;

public class BureauElectrique extends Bureau {
	
	private boolean branche;
	
	public BureauElectrique() {
		super();
		branche = false;
	}

	
	public BureauElectrique(boolean _branche, BigDecimal _hauteurEnCM) {
		super(_hauteurEnCM);
		branche = _branche;
	
	}
}
