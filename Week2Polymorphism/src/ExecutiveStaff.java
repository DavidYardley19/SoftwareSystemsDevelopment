
public class ExecutiveStaff extends Staff {

	private float bonus;

	@Override
	double getPay() {
		
		return 1000000 + bonus * 10;
	}
	
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	public ExecutiveStaff(String name, String addr, String jobTitle, String office) {
		super(name, addr, jobTitle, office);
	}
}
