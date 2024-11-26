package EmailStore;
import java.util.HashSet;
import java.util.Set;

/**
 * Class which processes email data
 * Each email is unique so a set is best for this scenario.
 */
public class EmailStore {

	/**
	 * Attribute to be manipulated, a number of unique email addresses
	 */
	private Set<String> emailAddresses = new HashSet<String>();

	/**
	 * Stores given param in emailAddresses set
	 * @return true if the email was added
	 * @return false if the email was a duplicate
	 * @param email
	 */
	public boolean addEmail(String email) {
		return emailAddresses.add(email);
	}
	
	/**
	 * Checks whether the given param represents an email address already stored
	 * @param email The email to check
	 * @return boolean, respective of whether the email is present in the set
	 */
	public boolean hasEmail(String email) {
		return emailAddresses.contains(email);
	}
	
	/**
	 * Iteration over the set via for loop
	 * Displays each stored email address to console
	 */
	public void displayEmails() {
		for (String email : emailAddresses) {
			System.out.println(email);
		}
	}
}
