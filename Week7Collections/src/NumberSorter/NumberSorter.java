package NumberSorter;

import java.util.Stack;

/**
 * Exercise demonstrates how two stack type collections can be used to implement a simple sorting algorithm
 */
public class NumberSorter {

	/**
	 * A temporary store for a value on the stack
	 */
	private int next;
	
	/**
	 * 
	 * @param numbers A provided array of integers to be sorted
	 * @param isAscending Checks if the user wants the sorted output to be ascending or descending in value
	 */
	void sort(int[] numbers, boolean isAscending) {
		
		//Source stack from which the numbers are popped from
		Stack<Integer> srcStack = new Stack<Integer>();
		
		//Destination stack which the numbers are pushed to
		Stack<Integer> destStack = new Stack<Integer>();
		
		//Adds initial array of numbers to source stack
		for (int number: numbers) {
			srcStack.push(number);
		}
		
		/*
		 * TODO: Find out if there is a more concise way of figuring out the ascending part
		 */
		
		/**
		 * Checks which order the user requires firstly.
		 * Ensures that the stack is not empty to continue running operations like pop and push
		 */
		if (isAscending) {
			while (!srcStack.isEmpty()) {
				next = srcStack.pop();
				while ((destStack.size() > 0 && destStack.peek() > next)) {
					srcStack.push(destStack.pop());
				}
				destStack.push(next);
			}
		}
		else {
			while (!srcStack.isEmpty()) {
				next = srcStack.pop();
				while ((destStack.size() > 0 && destStack.peek() < next)) {
					srcStack.push(destStack.pop());
				}
				destStack.push(next);
			}
		}
		
		/**
		 * Prints out the values in order on the destination stack. Once everything has been sorted.
		 */
		for (int number: destStack) {
			System.out.println(number);
		}
	}
}
