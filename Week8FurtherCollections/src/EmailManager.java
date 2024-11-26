import java.util.Set;
import java.util.HashSet;

/**
 * An example use of a SET
 */
public class EmailManager {

	/**
	 * A set of known email addresses
	 * TODO: Find out why it starts with Set though and not HashSet...
	 * 		Because arent we limiting the functionality to what the Set interface provides?
	 */
	private Set<String> emailAddresses = new HashSet<String>();
	
	/**
	 * Adds an email address to the known set of emails
	 * @param email
	 */
	void AddEmail(String email) {
		emailAddresses.add(email);
	}
	
	/**
	 * Checks if an email address is known
	 * @param email
	 * @return true if known
	 */
	boolean CheckExists(String email) {
		return emailAddresses.contains(email);
		//.contains is inherited from the collectoins interface
	}
	
	/**
	 * Prints out all email elements within the set
	 * An explicit iterator or stream based aggregate operation can be used instead of this for loop
	 */
	void PrintAllEmails() {
		System.out.println("The email addresses are as follows");
		for (String email: emailAddresses) {
			System.out.print(email);
		}
	}
	
}
