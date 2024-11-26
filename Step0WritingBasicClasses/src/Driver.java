
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Testing the game class by creating new instances of it.
		 */
		
		/**
		 * Remember that f is needed for floats and d is needed for doubles
		 */
		Game game1 = new Game("Mario Bikes","David",12.21f);
		Game game2 = new Game("BatWoman", "Davide", 10.99f);
		
		System.out.println("Game1" + game1.toString());
		System.out.println("Game2" + game2);
		/**
		 * Both lines will do the same, toString is automatically called when just calling the method
		 */
		
		/*
		 * Using the mutators
		 */
		
		game1.setName("Dota3");
		System.out.println("Game1 Changed:" + game1.toString());
	}

}
