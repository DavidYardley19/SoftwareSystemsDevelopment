package AlgorithmComplexity;

public class NumberGrid {

	/**
	 * Outputs a number of rows and columns via nested loop
	 * As determined by the range value
	 * Each row displays current row number: range times
	 * 
	 * Example output:
	 * 1 1 1 1 1
	 * 2 2 2 2 2
	 * 3 3 3 3 3
	 * 4 4 4 4 4
	 * 5 5 5 5 5
	 * 
	 * Nested for meaning O(n^2)
	 * 
	 * @param range the size of the grid width and height.
	 */
	public void output(int range) {
		for (int i = 1; i<=range; i++) {
			for (int j = 1; j<=range; j++) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
		}
	}
	
}
