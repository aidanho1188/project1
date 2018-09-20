// author = "Aidan"

package myFirstProject;

public class User {

	private String userName;
	private String email;
	private String firstName;
	private String lastName;

	// Method signature consists of...
	// Accessor - public(anyone can call) ,private(only that class can call) or
	// protected(within the packet).
	// Return type - Any type or void for nothing.
	// Method name - make it good so people know what the method
	// does.(*getUserName*)
	// Argument list - parameters passed to the method.(getUserName*()*)
	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
}
