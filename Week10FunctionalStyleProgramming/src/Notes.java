// Functional Style Programming
public class Notes {

	/**
	 * Covers
	 * Functional style programming
	 * java 8 streams
	 * Processing pipeline
	 * Parrallel streams
	 */
	
	/*
	 * Functional style programming
	 * Most 3rd gen langs such as java support imperative programming style
	 * 		Sequence, selections, iteration, state : vars
	 * 			Trademarks of the imperative style
	 * Alternative: functional
	 * 		Declarative style, what is required rather than how it works
	 * Formed by combining functions which process info and returns result
	 * 		Itself is often processed by other functions.
	 */
	
	/**
	 * Java 8 provides this via Streams API
	 * Write functional style interfaces to process elems extracted from data source eg. collection
	 * Common ops can be done more elegantly and efficiently
	 * Chain method calls, reflect functional rather than imperative.
	 * Processing pipeline = collective chained methods
	 */
	
	/*
	 * ID data source of stream
	 * 		Collection/ Array, explicit vals, file, generator
	 * Once known, provide 1/M chained intermediate methods (middle of pipeline)
	 * Terminal method = execution and returns results (as collection / val)
	 */
	
	/**
	 * Data source > intermediate methods > terminal method
	 * Pipeline handles internal iteration, moving elems one at a time through pipeline
	 * Compare to processing collection, req external iteration and processing specified by programmer
	 */
	
	/*
	 * Create stream from collection, call stream method
	 * Stream<Student> studentStream = students.stream();
	 * 
	 * Create from array/ individual vals, call Stream.of method
	 * Stream<Integer> numStream = Stream.of(1,2,3,4,5);
	 * Stream<Customer> custStream = Stream.of(custArray);
	 * 
	 * Create from text file, call Files.lines method
	 * Stream<String> fileStream = Files.lines(Paths.get("info.txt"));
	 */
	
	/**
	 * Once created, it can call one or more chained methods
	 * Example counting no of students w failing grade
	 * int failedCount = studentStream.filter(s -> s.getGrade() < 40).count()
	 * 		Called methods often use lambda expressions to allow specific elems processed.
	 * .count is a terminal method.
	 */
	
	/*
	 * Intermediate methods: processing within pipeline
	 * - map(funct) returns stream with given function applied to each elem
	 * - filter(condition) returns stream of elems matching condition
	 * - sorted returns sorted elems
	 * - distinct returns stream containing only unique elems
	 * - limit(max) returns stream limited to max value
	 * - skip(n) returns stream with first n elems discarded
	 * They can all be combined. Stream in, Stream out... Can chain immediately.
	 */
	
	/**
	 * Terminal methods, end of call chain.
	 * - Collect collects stream elems into a collection like a list
	 * - toArray returns to an array
	 * - forEach(action) performs action to each elem
	 * - count counts elems in stream
	 * - max max value in stream
	 * - min same as max but min
	 */
	
	/*
	 * Example including each stage of the processing pipeline
	 * List<String> name = students.stream()
	 * 		.filter(s -> s.getGrade() >= 40)
	 * 		.map(s -> s.getName())
	 * 		.sorted()
	 * 		.collect(Collectors.toList());
	 * Takes a collection of students, forms as a stream
	 * 	Filters the stream to provide only students with a passing grade
	 * 	Converts the stream to provide the names of the students
	 * 	Sorts the stream, default is ascending
	 * 	Converts back into a list
	 */
	
	/**
	 * Example using a text file as a datasource
	 * List<String> longWords = Files.lines(Paths.get("words.txt"))
	 * 		.filter(w -> w.length() >= 10)
	 * 		.limit(50)
	 * 		.map(n -> n.toUpperCase())
	 * 		.sorted()
	 * 		.collect(Collectors.toList())
	 * Takes in a list of words, reduces it to words greater than 10 letters
	 * Reduces the stream to the first 50 items
	 * Changes all to uppercase
	 * Sort alphabetically
	 * Turn back into a list
	 */
	
	/*
	 * Stream, similar to collection. Works with multiple vals
	 * We do not store contained vals directly.
	 * All methods called: provode vals when required to do so
	 * Short circuits processing pipeline, +performance
	 * Take limit for example, once reached, it wont check any more items coming in.
	 */
	
	/**
	 * Specialised. A lot works with numeric vals producing statistics
	 * Specialised primitive streams created from regular object streams
	 * 	IntStream, LongStream, DoubleStream
	 */
	
	/*
	 * Example using mapToInt to create specialised IntStream
	 * int sum = carsForSale.stream()
	 * 		.filter(c -> c.getYear() == 2003)
	 * 		.mapToInt(c -> c.getValue())
	 * 		.sum();
	 * IntStream gives sum method, otherwise unavailable on regular streams
	 * Other specialised prim stream methods: average, summaryStatistics
	 */
	
	/**
	 * Some sources produce vals on demand, rather than extract one by one
	 * 		Stream.generate(Math::random).limit(1000).forEach(System.out::printLn);
	 * generate method : create list of 1k random vals between 0 and 1.
	 * 
	 * Range of vals:
	 * 		IntStream.range(1,10).map(n->n*n).forEach(System.out::println);
	 * Generates int from 1 to 9, map used to square each val before printing
	 */
	
	/*
	 * Parallel Streams : Sometimes speed up processing by distribting over cores
	 * Good if no interdependency between elems within a pipeline
	 * 
	 * Created directly as a datasource
	 * 		Stream<Employee> empStream = employees.parallelStream();
	 * Or requested by calling parallel method on existing stream
	 * 		Stream<Student> parallelStudentStream = student.parallel();
	 * All other methods are the same once made
	 */
	
	/**
	 * Example adds VAT to each non food item in salesList
	 * 		salesList.stream()
	 * 			.parallel()
	 * 			.filter(p->p.type() != Item.FOOD)
	 * 			.forEach(p->p.addVAT(20.0);
	 * Requesting does not guarantee one is given
	 */	
	
	/*
	 * Summary.
	 * Steams API allow processing ops using functional programming
	 * They simplify processing multiple vals, or run query type ops similar to SQL
	 * Processing pipeline: Data source, 1/M intermediate methods, terminal methods
	 * Specialised provide ++ methods for numerical processing
	 * Parallel streams speed up processing, request but not guaranteed.
	 */
}
