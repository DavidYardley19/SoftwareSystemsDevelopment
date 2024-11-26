import java.util.HashSet;
import java.util.Set;

public class TimeDriver {

	public static void main(String[] args) {
		
		Set<Time> times = new HashSet<Time>();
		
		// Create two time obj with the same attribute vals: hr,min,sec
		Time timeA = new Time(10,5,0);
		Time timeB = new Time(10,5,0);
		
		times.add(timeA);
		System.out.println(times.contains(timeB));
		// This will output true since the attributes match
		
		// Imagine you are importing people via their first names
		// There might be two andys.
		// If checking for either andy, it will come up true.
		
		// If hashCode and equals methods were not included, it would be false!
		// Since it will just compare the objects via their ID's in memory

	}

}
