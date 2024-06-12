package bureau;

public class App {

	public static void main(String[] args) {

		Desk desk1 = new Desk(100f, 90f, 120f, 150f, true);
		
		boolean goesToHeight1 = desk1.goesToHeight1();
		
		Desk desk2 = new Desk(90f, 90f, 120f, 150f, true);
		
		boolean goesToHeight2 = desk2.goesToHeight1();

	}

}
