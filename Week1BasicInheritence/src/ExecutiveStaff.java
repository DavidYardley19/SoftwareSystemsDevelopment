
public class ExecutiveStaff extends Staff {

	private float bonus;
	
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	ExecutiveStaff(String name, String address, String jobTitle, String office) {
		super(name, address, jobTitle, office);
	}

	@Override
	double getPay() {
		// This is an abstract method in the super class
		return 10000 + bonus * 10;
	}

	
	
}
