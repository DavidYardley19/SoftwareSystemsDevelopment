/**
 * Circle Class, creating an implementation based on the {@link Shape} class.
 */
public class Circle extends Shape {

	private int radius;
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	/**
	 * Constructor
	 */
	Circle() {
		super(1);
	}

	@Override
	public double getArea() {
		// This cannot be an int since it retuns a float/double... Ive had to change the type in the super class
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Sides = " + this.getSides() + ". I am a Circle with radius: " + this.radius;
	}

}
