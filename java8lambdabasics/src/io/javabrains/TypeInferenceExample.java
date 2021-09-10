package io.javabrains;

public class TypeInferenceExample {

	public static void main(String[] args) {
		TypeInferenceLambda l = s -> s.length();
		printLambda(l);
	}
	
	public static void printLambda(TypeInferenceLambda l) {
		System.out.println(l.getLength("Hello Lambda"));
	}
}

interface TypeInferenceLambda {
	int getLength(String s);
}
