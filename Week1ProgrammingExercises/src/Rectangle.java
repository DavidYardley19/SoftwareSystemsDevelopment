
public class Rectangle extends Shape{

	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	@Override
	public String toString() {
		return "Sides = " + this.getSides() + ". I am a rectangle with width: " + this.width + " and a height of: " + this.height;
	}
	
	/**
	 * Constructor
	 */
	Rectangle() {
		super(4);
	}

}
