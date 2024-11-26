
public class PTStaff extends Staff {
	
	private int hoursWorked;

	@Override
	double getPay() {
		
		return hoursWorked * 10;
	}
	
	public int getHours() {
		return hoursWorked;
	}
	
	public void setHours(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public PTStaff(String name, String addr, String jobTitle, String office) {
		super(name, addr, jobTitle, office);
	}

}
