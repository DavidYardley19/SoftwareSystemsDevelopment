package AlgorithmComplexity;

public class NumberChecker {

	/**
	 * Runs a loop through the list to find the largest number
	 * O(n) for now.
	 * @param numbers
	 * @return the largest value
	 */
	public int findMax(Integer [] numbers) {
		int max = numbers[0];
		for (int val : numbers) {
			if (val > max) {
				max = val;
			}
		}
		return max;
	}
	
}
