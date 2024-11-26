
public class Notes {

	/**
	 *  Interfaces
	 *  
	 *  Declare methods
	 *  methods often have NO implementation code
	 *  Default code can be provided
	 *  Alternative to class based inheritence
	 *  Allows looser coupling of implementation code
	 *  Programmers agree on a contract in terms of what methods MUST be provided by a class
	 *  
	 */
	
	/*
	 * Keyword: interface
	 * In its own file
	 * implements is used in the class instead of extends... the contract is agreed upon here.
	 */
	
	/**
	 * Methods are implicitly public
	 * Classes can implement multiple interfaces
	 * Unrelated classes may implement the same interface, sep by commas
	 * Declared interface names can be used as a datatype for attributes, local variables or parameters
	 * @Override annotation indicates method is declared elsewhere
	 * javadoc inherited from interface so no need to re-write in each class (THIS I LIKE)
	 */
	
	/*
	 * Anonymous class
	 * Rather than implementing an interface using an explicitly defined class
	 * Used when an interface typed arg is passed as a param to another method
	 * Class has no name, cannot be used elsewhere... it is for one use only.
	 * Syntax can be cumbersome.
	 * 
	 * Used often to pass event listeners when programming graphical user interfaces supporting classes
	 */
	
	/**
	 * Functional interface
	 * Declares single abstract method. An easier way than working the long form for anonymous classes.
	 * Used via Lambda expression, concise anonymous class creation.
	 * Example:
	 * 		m.Trade(1234,"internal","£200", (message) -> System.out.println("LOG: " + message));
	 * Commonly used with java framework classes, many interfaces are functional interfaces.
	 */
	
	/*
	 * Instead of abstract methods
	 * You can implement default methods, static methods
	 * Constants can be defined
	 * These are inherited by any class which implements the interface.
	 * We can utilise interface inheritence with keyword: extends.
	 */
	
	/**
	 * Default method identified by default keyword
	 * Gives actual implementation code.
	 * Class can optionally provide implementation code.
	 * Allows methods to be added to interfaces without breaking existing classes
	 * Default methods are implicitly public
	 */
	
	/*
	 * Static need implementaion code
	 * Helper methods, commonly used for functionality. Typically not reimplemented
	 * Defined in interface, cannot access attributes that arent constants. Rely on provided param only
	 * Grouping static methods allow easy access to commonly used functionality
	 * Can be called from default methods within the interface.
	 */
	
	/**
	 * Constants, implicitly static and final!
	 * They MUST be given an initial value.
	 * Provide ease of access to shared values elsewhere... Think Math.PI
	 */
	
	/*
	 * SDK includes predefined classes and interfaces
	 * Used in collections framework > APIS
	 * Multiple classes provide alternative implementations of those interfaces.
	 * Commonly used methods like sort() >> Rely on Comparator interface which is functional!
	 * Lambda Example:
	 * 		orders.sort((order1,order2) -> order1.amount() - order2.amount());
	 */
	
	/**
	 * SUMMARY
	 * Interface gives mechanism of declaring methods without implementation code
	 * reduces coupling, allowing independant development of different parts of a system
	 * Class can use multiple interfaces whilst extending a super class
	 * interface names can be used as datatypes, flexible with APIs
	 * Default interface allow them to be changed without breaking existing code
	 */
	
}
