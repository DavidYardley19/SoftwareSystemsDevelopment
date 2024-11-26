
public class Notes {

	/**
	 * COLLECTIONS
	 * Stores multiple vals
	 * similar to an array
	 * Sometimes supported directly by lang like python or in libraries like java
	 * They save dev time, improve quality, allow interoperability various components
	 */
	
	/*
	 * COLLECTIONS FRAMEWORK
	 * Defined in library, interfaces and classes
	 * Core interfaces: lists, stacks, queues, sets, maps
	 * Each type has different rules and semantics.
	 */
	
	/**
	 * OPERATIONS
	 * clear()
	 * isEmpty()
	 * Size()
	 * iteratror()
	 * remove()
	 * Most implement COLLECTION interface
	 */
	
	/*
	 * Generic Types
	 * Allow code to be written that works with a datatype that is unknown until the code is used.
	 * Used to identify the type of objects to be stored within the collection
	 * When creating new collections, we provide type info that identifies this to the compiler
	 * Done with giving data type in angled brackets.
	 */
	
	/**
	 * LIST
	 * number of ordered elements
	 * Type stored are identified using generic type angled bracket syntax
	 * When created, it can add rem insert vals
	 * ArrayList and LinkedList implement the List interface
	 */
	
	/*
	 * LIST EXAMPLE
	 * 		List<String> names = new ArrayList<String>();
	 * 		names.add("Dav");
	 * 		names.add("May");
	 * 		System.out.println("The list has " + names.size() + " names");
	 * 		names.remove(1) // This removes the second element in the list
	 */
	
	/**
	 * ARRAYLIST VS LINKEDLIST
	 * Arraylist implemented using a java array
	 * 		Random access using index value is VERY fast
	 * 		Insertion and removal of elements can be slow
	 * Linkedlist implemented using a linked structure
	 * 		Random access using index value is very slow
	 * 		Insertion and removal of elements can be slow
	 */
	
	/*
	 * LIST INTERFACE
	 * Methods include: add, addAll, contains, get, indexOf, lastIndexOf, set, sort, sublist, etc...
	 * Since lists are ordered, many methods take an index argument to specify a position within the list
	 * SORTING is also possible.
	 */
	
	/**
	 * STACKS AND QUEUES
	 * They are ordered however adding and removing elements are only done from the ends
	 * STACK: LIFO >> push, pop, peek
	 * QUEUE: FIFO >> queue, dequeue, first
	 */
	
	/*
	 * STACK EXAMPLE
	 * 		Stack<Integer> values = new Stack<Integer>();
	 * 		values.push(10);
	 * 		values.push(20);
	 * 		tos = values.pop();		// This will remove the 20 at the top of the stack.
	 * 		System.out.println("Val at the top = " + values.peek());
	 * NOTE: LinkedList can also be used as a stack since it implements the dequeue interface
	 */
	
	/**
	 * TRAVERSAL
	 * Common form of processing is to access each of their elements
	 * most general is for-each loop
	 * 		List<String> names = new ArrayList<String>()
	 * 		for(String name: names)
	 * 			System.out.println("The next name in the list is: " + name);
	 */
	
	/*
	 * ITERATOR
	 * Generic mechanism for finer traversal control
	 * COLLECTIONS provide a method called iterator() which returns object which allows access to each element in turn
	 * 		Iterator<String> iter = names.iterator();
	 * 		while(iter.hasNext()){
	 * 			String name = iter.next();
	 * 			System.out.println("The next name: " + name);
	 * 		}
	 * Bit more flexible
	 * You can use several iterators from different collections.
	 * It also includes a method called remove(), this is a SAFE way to remove elements whilst traversing.
	 */
	
	/**
	 * STREAMS
	 * Newer, typically used to allow use of aggregate operations
	 * These operations are applied to each element of the collection > Can use lambda expressions
	 * Lead to very concise code
	 * 		names.stream().forEach(e->System.out.println("The next name in the list: " + e))
	 */
	
	/*
	 * COLLECTIONS VS ARRAYS
	 * Collections = more flexible, easier to manipulate with methods
	 * Arrays can be converted into a list: Arrays.asList(arrayName)
	 * And vise versa: listName.toArray(new String[0])  // 0 has no effect, you just want it to know what datatype is used
	 */

}
