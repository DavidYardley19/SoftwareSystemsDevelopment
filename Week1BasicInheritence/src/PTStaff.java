
public class PTStaff extends Staff{

	private int hoursWorked;
	
	
	public int getHours() {
		return hoursWorked;
	}
	
	public void setHours(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	
	public PTStaff(String name, String address, String jobTitle, String office) {
		super(name, address, jobTitle, office);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getPay() {
		// TODO Auto-generated method stub
		return hoursWorked * 10;
	}

	
	
}
