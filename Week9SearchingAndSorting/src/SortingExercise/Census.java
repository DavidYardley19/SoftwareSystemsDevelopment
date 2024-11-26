package SortingExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Maintains a list of Person instances, stored using an arraylist
 */
public class Census {

	/*
	 * Attributes storing a list of people objects, number of males and females
	 */
	private List<Person> people = new ArrayList<Person>();
	private int males;
	private int females;
	
	/**
	 * Adding a person object to the list of people
	 * @param person object containing information: height, age and gender
	 */
	public void addPerson(Person person) {
		people.add(person);
	}
	
	/**
	 * Removing a requested person from the list of people
	 * @param person object requested for removal
	 * @return true if the person existed in the list (now removed)
	 * @return false if the requested removal was not in the list
	 */
	public boolean removePerson(Person person) {
		if (people.contains(person)) {
			people.remove(person);
			return true;
		}
		return false;
	}
	
	/**
	 * Provides the total quantity of people in the list
	 * @return the quantity
	 */
	public int countPeople() {
		return people.size();
	}
	
	/**
	 * Provides the number of people who's gender attribute is male (bool: true)
	 * @return number of males in the list
	 */
	public int countMales() {
		males = 0;
		for (Object person : people) {
			if (person.toString().contains("true")) {
				males ++;
			}
		}
		return males;
	}
	
	/**
	 * Provides the number of people who's gender attribute is female (bool: false)
	 * @return number of females in the list
	 */
	public int countFemales() {
		females = 0;
		for (Object person : people) {
			if (person.toString().contains("false")) {
				females ++;
			}
		}
		return females;
	}
	
	/**
	 * toString showing the details of all the people in the census
	 */
	@Override
	public String toString() {
		String result = "";
		for (Object person: people) {
			result += person.toString() + "\n";
		}
		return result;
	}
	
	// TODO TASK 2: Sorting methods by height, age, gender (using Collections.sort method)
	// "Implement anonymous inner class sorting people using appropriate attribute for each method"
	
	// Used chatgpt to assist with bugs
	// Compare() returns an integer. Messed up the gender one by using "public boolean" instead.. but should be fine now.
	
	public void sortOnAge() {
	    Collections.sort(people, new Comparator<Person>() {
	        @Override
	        public int compare(Person p1, Person p2) {
	            return Integer.compare(p1.getAge(), p2.getAge());
	        }
	    });
	}

	
	public void sortOnHeight() {
	    Collections.sort(people, new Comparator<Person>() {
	        @Override
	        public int compare(Person p1, Person p2) {
	            return Integer.compare(p1.getHeight(), p2.getHeight());
	        }
	    });
	}
	
	public void sortOnGender() {
	    Collections.sort(people, new Comparator<Person>() {
	        @Override
	        public int compare(Person p1, Person p2) {
	            return Boolean.compare(p1.getGender(), p2.getGender());
	        }
	    });
	}

}
