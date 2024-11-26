package WordCounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Will provide a method for counting unique words within a sentance
 * Attribute to manage unique word count via a map
 */
public class WordCounter {

	/**
	 * Maps unique words to their occurence count
	 */
	private final Map<String, Integer> wordMap = new HashMap<String, Integer>();
	
	/**
	 * Method uses wordMap to maintain a number of occurences of that word
	 * If word not in map then it should be inserted with a number 1
	 * If word is in map then it should increment the integer value
	 */
	public void addWord(String word) {
		if (wordMap.containsKey(word)) {
			wordMap.put(word, wordMap.get(word) + 1);
		}
		else {
			wordMap.put(word, 1);
		}
	}
	
	/**
	 * addSentance takes a full sentance: Words seperated by spaces
	 * It splits the words up and calls the addWord() method for each word
	 */
	public void addSentance(String sentance) {
		String[] wordList = sentance.split(" ");
		for (String word : wordList) {
			addWord(word);
		}
	}
	
	/**
	 * outputResults displays each word within the map, along with its occurences
	 */
	public void outputResults() {
		System.out.println("Printing all the words and occurences");
		// EntrySet method is used which allows iteration over entries (pairs) within the map
		for (Entry<String, Integer> entry : wordMap.entrySet()) {
			String word = entry.getKey();
			int wordCount = entry.getValue();
			System.out.println(word + " : " + wordCount);
		}
	}
	
}
