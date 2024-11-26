
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Person p1 = new Person("David", "1 address close");
		System.out.println("P1: " + p1);
		
		Person p2 = new Person("Andy", "2 address grove");
		System.out.println("P2: " + p2);
		
		PTStaff s1 = new PTStaff("Peter", "3 address lane", "Support Agent", "Block 2 room 3");
		System.out.println("s1: " + s1);
		// The above will not print the job title since it calls the toString that was inherited from person
		// Now its changed, it will call the version most local.
		
		s1.setHours(10);
		
		// Staff s3 = new PTStaff("Peter", "3 address lane", "Support Agent", "Block 2 room 3");
		// The above is fine, but you can no longer call methods that are in PTStaff that are not in Staff
		// Example not possible: s3.setHours(10);
		
		double pay = s1.getPay();
		System.out.println(pay);
	}

}
