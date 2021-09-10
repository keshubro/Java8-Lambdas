 package io.javabrains;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		// Implementation of interface
		Greeter greeter = new Greeter();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet(helloWorldGreeting);
		
		// We do not really need to create an implementation for our Greeting interface.
		// Instead, we can use anonymous class like this :
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello from anonymous class");
			}
		};
		innerClassGreeting.perform();
		
		// Implementation using Lambda. Uses the same Greeting interface
		Greeting lambdaGreeting = () -> System.out.println("Hello from Lambda");
		lambdaGreeting.perform();
		greeter.greet(lambdaGreeting);
	}

}
