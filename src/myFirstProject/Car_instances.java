// author = "Aidan"

package myFirstProject;

public class Car_instances {
	// These is instance variables
	public String brand;
	public Integer year;
	public Integer mile;
	public String price;
	public String horsepower;
	
	// This is how we get the value of a variable* (instance method)
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		this.brand= brand;
	}
	// *
// ----------------------------------------------------------------------
	public Integer getyear() {
		return year;
	}
	public void setyear(Integer year) {
		this.year = year;
	}
// ----------------------------------------------------------------------
	public Integer getmile() {
		return mile;
	}
	public void setmile(Integer mile) {
		this.mile = mile;
	}
//-----------------------------------------------------------------------	
	public String getprice() {
		return price;
	}
	public void setprice(String price) {
		this.price = price;
	}
//-----------------------------------------------------------------------
	public String gethorsepower() {
		return horsepower;
	}
	public void sethorsepower(String horsepower) {
		this.horsepower = horsepower;
	}
}
