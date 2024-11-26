
public class Person {

	protected String name;
	protected String address;
	
	public String getName() {
		return name;
	}
	
	public String getAddr() {
		return address;
	}
	
	public String toString() {
		return "name: " + name + ", address "+ address;
	}
	
	public Person(String name, String addr) {
		this.name = name;
		this.address = addr;
	}
}
