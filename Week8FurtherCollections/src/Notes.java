
public class Notes {
	
	// FURTHER COLLECTIONS
	
	/**
	 * Covers
	 * Sets support
	 * Map support and traversal
	 */
	
	/*
	 * More specific semantics than lists
	 * Sets: No duplicates, unordered > Thus indexing is not present
	 * Efficient with membership testing
	 * Maps: Allows pairs of elements to be stored with a key
	 * Both share common properties since keys in maps are represented using a set
	 */
	
	/**
	 * Interface extends collection interface.
	 * 		Thus all methods are available
	 * 	Add, remove, isempty, size, contains, clear
	 */
	
	/*
	 * Classes that implement sets:
	 * 		TreeSet, HashSet
	 * TreeSet > binary tree to handle storage. Contained elems are ordered (Naturally or by comparator)
	 * HashSet > Hash table used for storage. contianed elems are not ordered and order may change
	 * 		Hashset often more efficient in performance
	 * LinkedHashSet also exists, maintaining insertion order by combining linked lists and hash tables.
	 */
	
	/**
	 * Points to note
	 * Set > List when it comes to performance > Amazing for membership
	 * Set interfaces REQUIRE generic typing to identify the type of stored element
	 * Code to traverse/ convert a set is the same as a list
	 * Changing the attribute vals of objects already stored in a set can lead to bugs!
	 * With issues in ordering, using a Hashset instead of a LinkedHashSet can lead to bugs!
	 */
	
	/*
	 * Maintaining Set Insertion Order
	 * Instead of a HashSet, use a LinkedHashSet
	 * Guarantees insertion order, is reflected in traversal
	 * Slightly more overheads in performance since more memory is required to track this.
	 */
	
	/**
	 * MAPS
	 * Store associated information, known as keys and values
	 * Keys are only associated with single values, must be unique within the map.
	 * 		However duplicate values are allowed.
	 * Think of it as a type of dictionary (Name used to lookup a definition)
	 * Interface varies from collections interface
	 * 		Methods allowed >> clear, size, isempty
	 */
	
	/*
	 * MAP METHODS
	 * put(key, value) >> used for insertion... replaces any value associated with the key if already there
	 * get(key) >> Access the value associated, null returned if key is not present
	 * remove(key) >> Removes key and associated value
	 * Other methods: allow access to just the key set, or just values independantly
	 */
	
	/**
	 * MAP SUPPORTING CLASSES
	 * TreeMap: underlying binary tree, ordered elems
	 * HashMap: Utilises hash table, unordered and storage order may change
	 * LinkedHashMap: Maintains insertion order by combining hash table and linked list.
	 */
	
	/*
	 * POINTS TO NOTE WITH MAPS
	 * Great performance when checking for presence of a key or getting a value
	 * Map works with two elements so generic typing required to assert data types
	 * Code to traverse is different, recall using Entry<>
	 * Calling keySet() and values() methods allow you to look at just the keys and values
	 * Using a HashMap rather than a LinkedHashMap can lead to minor bugs (due to ordering)
	 */

}
