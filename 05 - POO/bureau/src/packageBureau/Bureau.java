package packageBureau;

import java.math.BigDecimal;

public class Bureau {
	
	private BigDecimal hauteurEnCM;
	
	public Bureau() {
		
		hauteurEnCM= BigDecimal.valueOf(80);
	}

	public Bureau(BigDecimal _hauteurEnCM) {
		hauteurEnCM = _hauteurEnCM;
	}
}
