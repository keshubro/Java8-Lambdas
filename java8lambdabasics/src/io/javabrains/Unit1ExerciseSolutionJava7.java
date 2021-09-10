package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Caroll", 42),
				new Person("Thomas", "Carlyr", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
			);
			
		// Sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		
		
		
		// Create a method that prints all elements in the list
		printAll(people);
		
		
		
		// Create a method that prints all the people with last name beginning with C
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
			
		});


	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p: people) {
			if(condition.test(p)) {
				System.out.println(p);	// This will automatically call the toString() method
			}
		}
		
	}


	private static void printAll(List<Person> people) {
		for(Person p: people) {
			System.out.println(p);	// This will automatically call the toString() method
		}
		
	}

}

interface Condition {
	boolean test(Person p);
}
