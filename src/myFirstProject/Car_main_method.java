// author = "Aidan"
package myFirstProject;

public class Car_main_method {
	
	public static void main(String[] main) {
		Car_instances car1 = new Car_instances();
			car1.setbrand("Ferrari");
			car1.setyear(2018);
			car1.setmile(0);
			car1.sethorsepower("660 hp");
			car1.setprice("$280,900");
			
			System.out.println("Car brand: " + car1.getbrand());
			System.out.println("Car year: " + car1.getyear());
			System.out.println("Car mile: " + car1.getmile());
			System.out.println("Car horsepower: " + car1.gethorsepower());
			System.out.print("Car price: " + car1.getprice());
			
	}

}
