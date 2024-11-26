
public interface MessageLogger {

	String errorPrefix = "ERROR: ";
	
	/**
	 * Log single message
	 * @param message the message to be logged
	 */
	default void logError(String message) {
		System.err.println(errorPrefix + message);
	}
	
	void logMessage(String message);
	
	// Notice how there is no code body provided above
}
