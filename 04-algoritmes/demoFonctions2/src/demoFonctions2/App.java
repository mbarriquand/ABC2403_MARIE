package demoFonctions2;

public class App {

	public static void main(String[] args)
	{
		int a;
		a = 20;
		
		App.changerValeur(a);
		
		System.out.println(a);

	}
	
	// Les deux variables portent le même nom mais elles sont différentes
	
	/**
	 * Passage par valeur
	 * @param a
	 */
	public static void changerValeur(int a)
	{
		a = 30;
		// return a; // en changeant le void en 'int', on pourrait utiliser un return pour que les deux a soient liés
	}

}

