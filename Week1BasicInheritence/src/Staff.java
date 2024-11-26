/**
 * An error will be provided if this was blank... This is because it requires a matching signature constructor
 */
abstract public class Staff extends Person{
	// Abstract means that this class will now allow you to create an object of this type
	// Useful to create an incomplete class, DESIGNED TO BE EXTENDED.

	/*
	 * More information... Inherited attributes and local attributes
	 */

	private String jobTitle;
	private String officeAddress;
	
	/**
	 * Creating an abstract method
	 * This means that anything that extends this class must implement this method.
	 */
	abstract double getPay();
	
	
	// The below is an example of overriding
	public String toString() {
		//return "Name: " + name + ", Address: " + address + ", Job Title: " + jobTitle;
		// Instead try this!
		String str = super.toString();
		return str + ", Job Title: " + jobTitle;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public String getAddress() {
		String supAdd = super.getAddress();
		return supAdd + ", Office Address: " + this.officeAddress;
	}
	
	/*
	 * Constructor created
	 */
	Staff(String name, String address, String jobTitle, String office) {
		/**
		 * Super allows you to refer to a super class.
		 * This is the subclass.
		 * Super will refer to Person >> Which was extended
		 */
		super(name, address);
		// TODO Auto-generated constructor stub
		/*
		 * Additional can be set below
		 */
		this.jobTitle = jobTitle;
		this.officeAddress = office;
		
	}

	
	
	
}
