
public class Driver {

	public static void main(String[] args) {
		
		PTStaff pt1 = new PTStaff("Pat", "456 add lane", "Director", "Block B Room 2");
		ExecutiveStaff es1 = new ExecutiveStaff("Pat2", "456 add lane", "Director", "Block B Room 2");
		
		// Same method name but due to the data type, it will use the method declared in its scope
		pt1.getPay();
		es1.getPay();

		Staff pt2 = new PTStaff("Pat", "456 add lane", "Director", "Block B Room 2");
		Staff es2 = new ExecutiveStaff("Pat2", "456 add lane", "Director", "Block B Room 2");
		
		// This will then use the method defined in the staff class. Compiler can not tell which version must be called
		// Version called is deffered until runtime, it will then call the correct version
		pt2.getPay();
		es2.getPay();
		/**
		 * What is the point.
		 * Program can dynamically decide what version to call on the fly
		 * Example: if a foreach loop is used for a mixture of the two classes.
		 */
	}

}
