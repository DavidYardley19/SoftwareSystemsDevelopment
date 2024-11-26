
public class Person {

	protected String name;
	protected String address;
	// Protected is useful when using inheritance, it allows access from the subclasses.
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String toString() {
		return "Name: " + name + ", Address: " + address;
	}
	
	Person(String name, String address){
		this.name = name;
		this.address = address;
	}
	
}

