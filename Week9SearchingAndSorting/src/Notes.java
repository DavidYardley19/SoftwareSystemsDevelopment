//SEARCHING AND SORTING

public class Notes {
	
	// Searching collections, sorting algos, comparing performance
	
	/**
	 * Two most common operations
	 * Search > id presense of a val
	 * Sort > order vals within a collection using 1/more criteria
	 * Both aim for efficiency
	 */
	
	/*
	 * Searching
	 * Calling appropriate method, .contains is used often
	 * .indexOf within lists, search for an elem and returns position
	 * Map supports .get > key value returns value associated
	 */
	
	/**
	 * Linear search
	 * linear struct like an array or linked list
	 * Steps through each element in turn til required elem is found
	 * As collection grows, performance drops. Small is okay. O(n)
	 */
	
	/*
	 * Binary search
	 * Under a tree struct, treeset/treemap
	 * Works as elems are ordered. Can cut large parts of search pool.
	 * Much more efficient than a search for larger collections. O(log n)
	 */
	
	/**
	 * Hash based
	 * hashset/hashmap. Calculates hash value, used to index directly into hash table
	 * Extremely efficient, marginally influenced by size of collection.
	 */
	
	/*
	 * SORTING
	 * calling .sort method, provided by arrays and collections
	 * Later vers of java use insertion sort or merge sort
	 * insertion > simple and fast. Element numbers affect this a lot if >32
	 * Merge sort more complex and uses more memory, good for large collections
	 * Java implementation uses simple if statement to determine which to use
	 */
	
	/**
	 * SUPPORT
	 * some methods necessary to make objects searchable and sortable
	 * .hashCode and .equals may be overriden to allow search type operations to be based on custom attributes
	 * .compareTo defined in comparable interface can be implemented for control over relative ordering during sorts
	 * .sort allows custom sort criteria, by passing implementation of Comparator interface
	 */
	
	/*
	 * CLASSIFYING EFFICIENCY
	 * Big O notation > Order of a function (the growth function)
	 * Problem size shown as n, number of elems to be processed
	 * Defines relation between problem size and its effect
	 * What happens as n increases. What is the worst case scenario.
	 */
	
	/**
	 * Indexing = O(1)
	 * Single non-nested loop = O(n)
	 * Nested loop, iterates over n every n times = O(n^2)
	 * Others:
	 * O(logn) = logarithmic (Think of splitting a dictionary book each time)
	 * O(nlogn) = linearithmic
	 * (n^2 , n^3) drops in performance here
	 * O(2^n) = exponential
	 */
	
	/*
	 * Insertion/ remving from linked list/ hashtable is O(1)
	 * Insertion/ removing from array is O(n)
	 * Searching element in array is O(n) but O(1) in hash table
	 * Insertion/ removing/ searching in bin tree is logarithmic O(logn)
	 * Insertion/ Selection/ Bubble sort = quadratic O(n^2)
	 * 		But merge sorts are linearithmic O(nlogn)
	 */
	
	/**
	 * Big O concerns the time complecity, worst case scenario execution time
	 * It can also refer to space complexity (mem usage)
	 * Time and space are often a tradeoff, more memory needed for less time
	 * 		Lookup tables increase time efficiency but lower memory efficiency
	 * 			Think of how cache is used to access frequent websites quicker
	 */
	
	
	
}
