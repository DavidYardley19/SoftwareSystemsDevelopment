
public class CondensedNotes {

	//Collections: Sets and Maps
	
	/**
	 * Sets, unordered and no dupes... great for membership testing
	 * Maps, Pairs of elements: key and value. Each unique but two values can be present
	 */
	
	/*
	 * Set Class: TreeSet > Bin tree, elements are ordered naturally/ by comparator
	 * Set Class: HashSet > Hash table, (+ efficient) elems unordered and order may change
	 * Set Class: LinkedHashSet > maintain insertion order (linked list and hash table)
	 */
	
	/**
	 * Sets require generic typing, traversal is the same as a list
	 * Bugs can occur: Changing values of set objects/ LinkedHashSets can alleviate ordering issues.
	 */
	
	/*
	 * LinkedHashSet can maintain insertion order, more overheads in performance as more memory is required
	 */
	
	/**
	 * Maps: Keys are associated with single vals, must be unique. But dupe vals allowed
	 * Like a type of dictionary, methods from collections allowed = clear, size, isempty
	 */
	
	/* 
	 * Map methods: put(key,val) .. get(key) .. remove(key) .. Can also access just keys or values
	 */
	
	/**
	 * Map Class: TreeMap > bin tree storage, ordered elems
	 * Map Class: HashMap > hash table, unordered and storage order may vary
	 * Map Class: LinkedHashMap > Maintains insertion order: combining hash table and linked list
	 */
	
	/*
	 * Maps = Great when checking key presence or getting a value
	 * Generic typing required, traversal is different (with entry<>)
	 * Calling keyset() and values() looks at just keys and values respectively
	 * LinkedHashMap can lead to less bugs due to ordering
	 */
	
}
