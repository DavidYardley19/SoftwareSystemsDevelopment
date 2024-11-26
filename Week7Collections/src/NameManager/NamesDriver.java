package NameManager;

public class NamesDriver {

	public static void main(String[] args) {
		
		NameManager mngr = new NameManager();
		
		mngr.addName("M.Mickleson");
		mngr.addName("Joshua Taylor Biggs");
		mngr.addName("P.Smith");
		mngr.addName("Peter Jonathan Smythton");
		mngr.addName("P.Thompson");
		
		mngr.printNames();
		System.out.println();
		
		mngr.removeLongNames();
		
		mngr.printNames();

	}

}
