/**
 * Shape class. Designed to act as an abstract base class to other shapes.
 * Shows good use of Javadoc comments, annotations, visibility scope, modifiers and class hierarchies.
 * Class marked as abstract since it is not designed to be instantiated directly.
 * @author david
 */
abstract class Shape {
	/**
	 * Number of sides within the shape
	 * Uses private visibility modifier, could also be protected so it can be accessed by subclasses.
	 */
	private int sides;
	
	/**
	 * Gets number of sides within the shape
	 * @return The number of sides within the shape
	 */
	public int getSides() {
		return sides;
	}
	
	/**
	 * Sets the number of sides within the shape
	 * @param sides : The number of Sides within the shape
	 */
	public void setSides(int sides) {
		this.sides = sides; //keyword 'this' is used to distinguish parameter from attribute.
	}
	
	/**
	 * Gets the size of he shapes area
	 * @return The size of the shapes area
	 */
	abstract public double getArea();
	
	/**
	 * Constructor
	 * @param sides : The number of sides within the shape
	 */
	Shape(int sides){
		this.sides = sides;
	}
}
