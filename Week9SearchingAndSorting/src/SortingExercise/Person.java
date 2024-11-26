package SortingExercise;

public class Person {
	
	/**
	 * Attributes to store height (cm), age (years), gender (boolean)
	 */
	private int height, age;
	private boolean gender;
	
	/*
	 * Getters and setters for each attribute
	 */
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean getGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	/**
	 * toString displaying the persons details
	 * @return Height: PersonHeight, Age: PersonAge, Gender: gender
	 */
	public String toString() {
		// Terniary operator used to convert the gender boolean into a new string
		String genderString = (gender == true) ? "Male" : "Female";
		return "Height: " + height + ", Age: " + age + ", Gender: " + genderString;
	}
	
	/**
	 * Constructor for person, taking parameters and assigning locally respectively
	 */
	public Person(int height, int age, boolean gender) {
		this.height = height;
		this.age = age;
		this.gender = gender;
	}
	
	
}
