/**
 * Ellipse Class providing an implementation of an ellipse based on the {@link Rectangle} class.
 * 
 * The above was a copy of the solutions, but get used to documentation
 */
public class Ellipse extends Rectangle {

	// This was confusing to me at first since I felt like it would extend a circle instead
	// But the area = pi * width/2 * height/2
	
	@Override
	public double getArea() {
		double rectangleArea = super.getArea();
		return (rectangleArea/4) * Math.PI;
	}
	
	// Going to test with just this, to see if I can use the private attributes in rectangle...
	// Maybe they need to be protected instead, UPDATE: seems okay so far.
	
	@Override
	public String toString() {
		return "Sides = " + this.getSides() + ". I am an Ellipse with a width of: " + this.getWidth() + " and a height of: " + this.getHeight();
	}
	
	// This still needs to give the appropriate number of sides...
	// Its 1 side, but we extend rectangle that assumes 4 sides.
	// I dont think we can call super twice over?
	
	/**
	 * Constructor
	 */
	Ellipse(){
		super.setSides(1);
		// Need to try doing this without using setSides?
		// Solution has .setSides so all is well
	}
	
	
}
