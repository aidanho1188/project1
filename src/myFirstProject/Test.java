package myFirstProject;
// _author_ = "Aidan"

// Hello World program.

// An object is 2 thing.
// 1. Actions. Methods.
// 2. Attributes. Variables.

public class Test {
	// My name
	private static String name = "Aidan";
	private static String lastname = "Ho";

	// main method. Starts the program.
	// Method Signature - What make this method unique. Defines the method.
	public static void main(String[] args) {
		Test hw = new Test();
		hw.sayHello();
	}

	// This method says hello when called.
	private void sayHello() {
		// Prints to the console
		System.out.println("Hello World");
	}

	{
		// print Printing and Hello World
		System.out.println("Printing...");
		System.out.println("Hello World!");
		// printing my name
		System.out.println("My name is " + name + " " + lastname + ".");
	}
}
