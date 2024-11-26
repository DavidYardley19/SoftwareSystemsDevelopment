package Week10Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1, "JJ. Jognson", 38));
		students.add(new Student(2, "P. Tibbs", 48));
		students.add(new Student(3, "W. Major", 28));
		students.add(new Student(4, "P. Turner", 60));
		students.add(new Student(5, "A. Ball", 20));
		students.add(new Student(6, "B. Smithy", 90));
		students.add(new Student(7, "R. Jules", 71));
		students.add(new Student(8, "T. Verne", 97));

		/*
		 * Create a stream from students list.
		 * Uses forEach terminal method to print info about each student 
		 * NOTE: Student class has toString method, can be passed directly to println method.
		 */
		Stream<Student> studentStream = students.stream();
		studentStream.forEach(student -> System.out.println(student.toString()));
		studentStream.close();
		System.out.println();
		
		/*
		 * Create stream from student list.
		 * Filters stream to students with grade over 70%
		 * Uses forEach terminal method to print info of remaining students
		 */
		Stream<Student> studentStream2 = students.stream();
		studentStream2.filter(student -> student.getGrade() > 70.0)
			.forEach(student -> System.out.println(student.toString()));
		studentStream2.close();
		System.out.println();
		
		/*
		 * Create steam from students list
		 * Use map() to change each student object into a student name (string)
		 * Always uppercase, then sorted alphabetically.
		 * Collect results in array called studentArray
		 * Print array content with code given.
		 */
		Stream<Student> studentStream3 = students.stream();
		Object [] studentArray = 
		studentStream3
			.map(student -> student.getName().toUpperCase())
			.sorted()
			.toArray();
		System.out.println(Arrays.toString(studentArray));
		studentStream3.close();
		System.out.println();
		
		/*
		 * Create stream from students list
		 * Use mapToDouble() creating specialized DoubleStream.
		 * Call method on that stream to calc average grade for all students.
		 * Call getAsDouble() to access and store result in variable called aveGrade.
		 * Print to console.
		 */
		Stream<Student> studentStream4 = students.stream();
		double aveGrade =
		studentStream4
			.mapToDouble(student -> student.getGrade())
			.average()
			.getAsDouble();
		System.out.println("The average grade is: " + aveGrade);
		studentStream4.close();
		System.out.println();
		
		// 2) GENERATED STREAMS
		// Using Streams API complete tasks in main method of driver class
		
		/* 1.
		 * Use IntStream.range() to create stream of ints from 90-100.
		 * Map each elem into the cubed version
		 * Output to console using forEach terminal method
		 */
		IntStream
			.range(90,101)
			.map(n->n*n*n)
			.forEach(System.out::println);
		System.out.println();
		
		/* 2.
		 * Use Stream.generate() to create infinite stream of rand numbers.
		 * map() to range 0-5, ensure theyre integers
		 * 		Hint: n -> (int)(n * 5 + 1)
		 * limit() to ensure only 10 vals are generated
		 * Collect into List of ints, displau using traditional for loop
		 */
		List<Integer> randomNumbers = 
			Stream.generate(Math::random) 
			.map(n -> (int) (n * 5 + 1))                           
	        .limit(10)
	        .distinct()
	        .toList();                        

	    for (int i = 0; i < randomNumbers.size(); i++) {
	        System.out.println("Random number " + (i + 1) + ": " + randomNumbers.get(i));
	    }
	    System.out.println();
	    
	    /*
	     * Add additional intermediate methods to ensure dupes were removed from resultant collection
	     * Using .distinct() method.
	     */
	}
}