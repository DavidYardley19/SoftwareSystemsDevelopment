/**
 * Week 1 work.
 * Working with inheritence to create different types of shapes.
 * Utilising modifiers like private and public
 * Enforcing documentation where I can.
 */
public class Driver {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();
		
		r1.setWidth(2);
		r1.setHeight(2);
		System.out.println("r1 area: " + r1.getArea());
		
		r2.setWidth(1);
		r2.setHeight(100);
		System.out.println("r2 width = " + r2.getWidth() + " and r2 height = " + r2.getHeight());
		
		r3 = r1;
		System.out.println("r3 info: " + r3.toString());
		
		// 2. creating circles to test
		
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.setRadius(10);
		c2.setRadius(5);
		
		System.out.println("c1 radius = " + c1.getRadius() + " which produces an area of: " + c1.getArea());
		System.out.println("c2 radius = " + c2.getRadius() + " which produces an area of: " + c2.getArea());

		// Testing ellipse
		Ellipse e1 = new Ellipse();
		e1.setWidth(2);
		e1.setHeight(2);
		System.out.println(e1.getArea());
		
		// Testing toString
		System.out.println(r1.toString());
		System.out.println(c1.toString());
		System.out.println(e1.toString());
	}

}
