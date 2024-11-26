/**
 * Instances will be sorted by surname, then forename if the surnames match
 */
public class Person implements Comparable<Person> {

	String surname, forename;
	
	// Defines how the sort should work, customises to your needs
	public int compareTo(Person other) {
		int result = surname.compareTo(other.surname);
		if (result == 0)
			result = forename.compareTo(other.forename);
		return result;
	}
	
	public String toString() {
		return "'" + surname + ", " + forename + "'";
	}
	
	public Person(String surname, String forename) {
		this.surname = surname;
		this.forename = forename;
	}

}
