package NumberSorter;

/**
 * TODO: Need to write some documentation. Will work on Week3 content
 */

public class SorterDriver {

	public static void main(String[] args) {
		
		NumberSorter sorter = new NumberSorter();
		
		sorter.sort(new int[] {1,9,2,3,10,8,12,1,99,2,43,68,109,0}, false);
		System.out.println();
		sorter.sort(new int[] {1,2,3,4}, false);
		System.out.println();
		sorter.sort(new int[] {4,3,2,1}, false);
		System.out.println();
	}

}
