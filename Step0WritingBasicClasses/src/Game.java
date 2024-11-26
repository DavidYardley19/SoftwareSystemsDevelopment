/**
 * Represents a simple computer game
 * 
 * @author DavidYardley
 */
public class Game {

	/**
	 * Adding some attributes
	 */
	
	/*
	 * Seting to priv and public enforces encapsulation
	 * 
	 * Attributes tend to be private and the methods are public
	 * Keep the control of the data value within the class.
	 */
	private int players;
	private String gameName;
	private String developerName;
	private float gamePrice;

	/**
	 * Adding some methods
	 * Data is associated with operations (methods)
	 * Access and mutators used often, getters and setters
	 */
	
	String getName() {
		return gameName;
	}
	
	void setName(String name) {
		this.gameName = name;
		/**
		 * Make sure you do not do name = name... This wont flag an error but will be wrong.
		 * 
		 * the keyword 'this' can be used to refer to the attribute in the calling class.
		 */
	}
	
	/**
	 * Mistake made: public is always lower case!
	 */
	public String toString() {
		
		return  "Name: " + gameName +
				", Developer: " + developerName +
				", Cost: £" + gamePrice +
				", Number of players: " + players;
	}
	
	/**
	 * Adding a mutator to change the number of players
	 */
	
	void setPlayers(int players) {
		this.players = players;
	}
	
	/**
	 * You might want to increment or decrement instead
	 */
	
	void incPlayers() {
		players++;
	}
	
	void decPlayers() {
		/*
		 * Need to make sure that you do not have a negative number of players
		 */
		if (players > 0)
			players--;
	}
	
	/**
	 * Going to create a constructor.. This is the first thing that is called when initialising an object.
	 * No output needs to be defined.
	 */
	Game(String name, String developer, float cost){
		this.gameName = name;
		this.developerName = developer;
		this.gamePrice = cost;
		
		players = 0;
	}
	
}
