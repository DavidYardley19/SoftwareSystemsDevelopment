import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonDriver {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Anderson", "Neo"));
		people.add(new Person("Peterson", "John"));
		people.add(new Person("Anderson", "Anthony"));
		
		Collections.sort(people);
		System.out.println(people);

	}

}
