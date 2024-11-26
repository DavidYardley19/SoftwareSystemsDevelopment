
abstract public class Staff extends Person {
	
	private String jobTitle;
	private String office;
	
	// abstract means you need to declare it in the subclasses
	abstract double getPay();
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public String getAddr() {
		return "Home addr: " + address + ", Work addr: " + office;
	}
	
	public String toString() {
		return "Name: " + name;
	}
	

	public Staff(String name, String addr, String jobTitle, String office) {
		super(name, addr);
		this.jobTitle = jobTitle;
		this.office = office;
	}

	
	
}
