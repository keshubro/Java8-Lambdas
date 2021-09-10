package io.javabrains2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import io.javabrains.Person;

public class StandardFunctionalInterfacesJava8 {


	


		public static void main(String[] args) {
			List<Person> people = Arrays.asList(
					new Person("Charles", "Dickens", 60),
					new Person("Lewis", "Caroll", 42),
					new Person("Thomas", "Carlyr", 51),
					new Person("Charlotte", "Bronte", 45),
					new Person("Matthew", "Arnold", 39)
				);
				
			// Sort list by last name
			Collections.sort(people, (o1, o2) ->o1.getLastName().compareTo(o2.getLastName()));
			
			
			
			
			// Create a method that prints all elements in the list
			// The same lambda can be used to print all the values as well
			printConditionally(people, p  -> true);
			
			
			
			// Create a method that prints all the people with last name beginning with C
			printConditionally(people, p  -> p.getLastName().startsWith("C"));
			
			

		}

		// Predicate is a functional interface that comes with Java 8. We have many other functional interfaces already defined in Java 8
		// that we can use if the signature of the method in that interface matches with that of our lambda
		private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
			for(Person p: people) {
				if(predicate.test(p)) {
					System.out.println(p);	// This will automatically call the toString() method
				}
			}
			
		}

		

	

}
