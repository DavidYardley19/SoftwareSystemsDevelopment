package NameManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameManager {

	/**
	 * A list of stored names, formatting not specific.
	 */
	private List<String> names = new ArrayList<String>();
	
	public void addName(String name) {
		names.add(name);
	}
	
	/**
	 * Prints all the names in order, in the list
	 */
	public void printNames() {
		for (String name:names) {
			System.out.println(name);
		}
	}
	
	/**
	 * Removes any names that are longer than 15 characters long
	 */
	public void removeLongNames() {
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()){
			String name = iter.next();
			if (name.length() > 15)
			{
				// Iterator allows you to do this on the fly safely
				iter.remove();
			}
		}
	}
}
