package AlgorithmComplexity;

public class Driver {

	public static void main(String[] args) {
		NumberChecker numChecker = new NumberChecker ();
		int max = numChecker.findMax(new Integer[] {5,2,7,9,10,1,2});
		System.out.println("Max number is " + max);
		
		System.out.println();
		
		NumberGrid numGrid = new NumberGrid();
		numGrid.output(5);
		System.out.println();
		
		numGrid.output(0);
		System.out.println();
		
		numGrid.output(1);
		System.out.println();
		
		numGrid.output(20);
		System.out.println();
	}

}
