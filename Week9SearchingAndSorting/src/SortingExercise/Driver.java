package SortingExercise;

/**
 * Used to test the Person and Census methods
 */
public class Driver {

	public static void main(String[] args) {
		
		Census cen = new Census();
		
		Person p1 = new Person(170,20,true);
		Person p2 = new Person(150,50,false);
		Person p3 = new Person(160,25,true);
		Person p4 = new Person(161,29,true);
		Person p5 = new Person(145,101,false);
		
		cen.addPerson(p1);
		cen.addPerson(p2);
		cen.addPerson(p3);
		cen.addPerson(p4);
		cen.addPerson(p5);
		
		System.out.println("Count: " + cen.countPeople());
		System.out.println("Males: " + cen.countMales());
		System.out.println("Females: " + cen.countFemales());
		
		System.out.println();
		
		System.out.println("p4 in list and removed: " + cen.removePerson(p4));
		System.out.println("Count: " + cen.countPeople());
		System.out.println("Males: " + cen.countMales());
		System.out.println("Females: " + cen.countFemales());
		
		System.out.println();
		
		Person p1Twin = new Person(170,20,true); // This doesnt work as its a completely diff object
		System.out.println("p1Twin in list and removed: " + cen.removePerson(p1Twin));
		System.out.println("Count: " + cen.countPeople());
		System.out.println("Males: " + cen.countMales());
		System.out.println("Females: " + cen.countFemales());

		System.out.println();
		
		System.out.println(cen.toString());
		
		System.out.println("Sorting by age");
		cen.sortOnAge();
		System.out.println(cen.toString());
		
		System.out.println("Sorting by gender");
		cen.sortOnGender();
		System.out.println(cen.toString());
		
		System.out.println("Sorting by height");
		cen.sortOnHeight();
		System.out.println(cen.toString());
	}
}
