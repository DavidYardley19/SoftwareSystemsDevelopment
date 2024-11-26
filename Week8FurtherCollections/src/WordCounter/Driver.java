package WordCounter;

public class Driver {

	public static void main(String[] args) {
	
		WordCounter wc = new WordCounter();
		
		wc.addSentance("This sentence has the word has in it twice has has has");
		wc.outputResults();

	}

}
