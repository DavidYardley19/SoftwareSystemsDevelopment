package Exercises;

//Stats.java file
import java.util.Arrays;

public class Stats {
	private int[] numbers;
	private int count;

	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}

	public int getCount() {
		return numbers.length;
	}

	public int getMaxValue() {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)
				max = numbers[i];
		}
		return max;
	}

	public int getMinValue() {
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min)
				min = numbers[i];
		}
		return min;
	}

	public int getTotal() {
		int total = 0;
//total all values within the array
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}

	public double get() {
		int x = 0;
		for (int i = 0; i < numbers.length; i++) {
			x += numbers[i];
		}
		double y = x / (double) numbers.length;
		return y;
	}

	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}

	public Stats(int capacity) {
		numbers = new int[capacity];
	}
}