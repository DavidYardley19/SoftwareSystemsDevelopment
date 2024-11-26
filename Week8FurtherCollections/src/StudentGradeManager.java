import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * MAP EXAMPLE
 */
public class StudentGradeManager {

	/**
	 * Map between key (studentID) and value (moduleGrade)
	 */
	private Map<String, Float> moduleMarks = new HashMap<String, Float>(); 
	// Notice how float has a capital letter... * Float

	/**
	 * Adds a studentID and associated moduleGrade
	 * @param studentID
	 * @param moduleGrade
	 */
	void AddGrade(String studentID, float moduleGrade) {
		moduleMarks.put(studentID,moduleGrade);
	}
	
	/**
	 * Gets the grade of a specified student
	 * @param studentID
	 * @return Student module grade
	 */
	float GetGrade(String studentID) {
		return moduleMarks.get(studentID);
	}
	
	/**
	 * Traversing through a map, printing all grades
	 */
	void PrintAllGrades() {
		System.out.println("Printing all the grades");
		// EntrySet method is used which allows iteration over entries (pairs) within the map
		for (Entry<String, Float> entry : moduleMarks.entrySet()) {
			String studentID = entry.getKey();
			float moduleGrade = entry.getValue();
			System.out.println(studentID + " " + moduleGrade);
		}
	}
	
	/**
	 * Printing all key elements of a map
	 */
	void PrintStudentIDs() {
		System.out.println("All Student IDs: ");
		// Notice here .keySet() is used
		for (String studentID: moduleMarks.keySet()) {
			System.out.println(studentID);
		}
	}
	
	/**
	 * Printing all value elements of a map
	 */
	void PrintModuleGrades() {
		System.out.println("All module marks: ");
		// Notice here .values() is used
		for (float moduleGrade : moduleMarks.values()) {
			System.out.println(moduleGrade);
		}
	}
}
