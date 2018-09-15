// author = "Aidan"
// Namespace - keeping object unique
// translates to a folder.
// Helps you organize 'like' code.
package myFirstProject;

// App is the entry point to our application.
public class App {

	public static void main(String[] args) {
		User u1 = new User(); // Instances
		u1.setfirstName("George");
		u1.setlastName("John");
		u1.setemail("george@john.com");
		u1.setuserName("gjohn");

		User u2 = new User();
		u2.setfirstName("George");
		u2.setlastName("John");
		u2.setemail("george2@john.com");
		u2.setuserName("gjohn");

		User u3 = new User();
		u3.setfirstName("Alex");
		u3.setlastName("Young");
		u3.setemail("AlexYoung@gmail.com");
		u3.setuserName("AlexY");

		User u4 = new User();
		u4.setfirstName("Scott");
		u4.setlastName("Jack");
		u4.setemail("ScottyJ@yahoo.com");
		u4.setuserName("ScottJ");
		// call a service that returns hundreds of user....

		System.out.println(u1.getemail());
		System.out.println(u2.getemail());
		System.out.println(u3.getuserName());
		System.out.println(u4.getemail());

		// for loop
		for (int x = 0; x < 100; x++) {
			// Prompt user to guess a letter.

			// Prompt user with mask of word.(recalculate mask)

			// Prompt user with hint.

			// Collect user input.
			System.in.toString();
			// repeat...

			System.out.println(x);
		} // increment(x++) counter x + 1 each time it loop
	}

	// Ask Mike
	private void generateMask() {
		// print the word for mask
	}
}
