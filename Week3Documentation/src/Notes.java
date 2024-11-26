
public class Notes {

	// DOCUMENTATION
	
	/**
	 * Convensions, 
	 * type of comments, 
	 * naming+indentations,
	 * Javadoc comments
	 */
	
	/*
	 * Without comments, real programs cannot be maintained
	 * Improve quality of code, more rebust, reusable, maintainable.
	 * Support comms between teams of devs
	 * Many languages have conventions that should be followed.
	 */
	
	/**
	 * Class names: singular nouns. Start with capitals.
	 * Identifier names (attributes, vars, params) = nouns but lowercase start
	 * Identifier names if collection or array = plural
	 * Constants prefixed with final = UPPERCASE_AND_SEPERATED
	 * Methods = verbs, start with lowercase, indicate action performed.
	 */
	
	/*
	 * Single line comments with a //
	 * Multiline C style comments with /*
	 * Multiline javadoc style comments with special tags /**
	 * 		This allows auto gen of program docs using tool called javadoc
	 */
	
	/**
	 * Regular comments descrive algorithms or reasoning
	 * Often appear within method code blocks
	 * Comments include info not easily derived from a first glance.
	 */
	
	/*
	 * Using meaningful names is vital. When 3gl programs first dev'd, names were short due to resources
	 * Programs with meaningful names and comments becomes self documenting.
	 * Allows for better debugging, maintenance and reuse.
	 */
	
	// EXAMPLE, names make it very easy to read the code.
	float calculateAverageScore(float [] scores) {
		int numOfScores = scores.length;
		float totalScore = 0, aveScore;
		for (int nextScore=0;nextScore<numOfScores;nextScore++) {
			totalScore = totalScore + scores[nextScore];
		}
		aveScore = totalScore/numOfScores;
		return aveScore;
	}
	
	/**
	 * Indentation, applies to languages that use code blocks.
	 * Helps with readability, without = difficult to create a mental model of the program flow.
	 * Harder to spot bugs.
	 * Eclipse IDE can do this for you >> CTRL SHIFT F
	 */
	
	/*
	 * Javadocs, These are coloured in blue in eclipse.
	 * Directly above classes, attributes and methods. Auto generate documentation from comments.
	 * Ensures that comments are always up to date with the code > code is self documenting.
	 */
	
	/**
	 * Javadoc tags: prefixed with @ symbol.
	 * @param describes param values accepted by a method
	 * @see used to cross reference related classes, attributes, methods.
	 * @link <identifier> used to cross reference other classes, attributes, methods.
	 * Valid HTML can be used here. <br>
	 * @author david Very useful to trace who implemented what.
	 */
	
	/*
	 * Generate document: produced output arranged in multiple pages, contains links
	 * Can be generated via javadoc command line tool.
	 * However much easier to gen docs in eclipse ide.
	 * It does call the underlying javadoc program.
	 * Select: "Generate Javadoc" from the project menu.
	 */
	
	/**
	 * Once generation started, process is shown in console view
	 * Warnings in red show consistency problems with javadoc comments.
	 * 		Such as referring to a param or link that doesnt exist
	 */
	
	
	
}
