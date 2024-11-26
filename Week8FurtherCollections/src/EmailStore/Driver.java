package EmailStore;

/**
 * Runs a program that manipulates the EmailStore class
 */
public class Driver {

	/**
	 * Testing the EmailStore class for bugs
	 * @param args
	 */
	public static void main(String[] args) {
		
		EmailStore emailSet = new EmailStore();
		
		emailSet.addEmail("dy@gmail.com");
		System.out.println(emailSet.addEmail("dy@gmail.com"));
		emailSet.addEmail("blank@outlook.co.uk");
		System.out.println(emailSet.addEmail("blank@outlook.co.uk"));
		
		emailSet.hasEmail("dy@gmail.com");
		emailSet.hasEmail("notAnEmail");
		
		emailSet.displayEmails();
	}
}
