// author = "Aidan"
package myFirstProject;

public class Car_main_method {
	
	public static void main(String[] main) {
		Car car1 = new Car();
			car1.setbrand("Ferrari");
			car1.setyear(2018);
			car1.setmile(0);
			car1.sethorsepower("660 hp");
			car1.setprice("$280,900");
			
//----------------------------------------------------------
			Car car2 = new Car();
			car2.setbrand("Audi");
			car2.setyear(2019);
			car2.setmile(0);
			car2.sethorsepower("340 hp");
			car2.setprice("$83,800");

//-----------------------------------------------------------
			Car car3 = new Car();
			car3.setbrand("Toyota");
			car3.setyear(2019);
			car3.setmile(0);
			car3.sethorsepower("132 hp");
			car3.setprice("$18,700");
			
			System.out.println("Car1 brand: " + car1.getbrand());
			System.out.println("Car2 year: " + car2.getyear());
			System.out.println("Car3 mile: " + car3.getmile());
			System.out.println("Car1 horsepower: " + car1.gethorsepower());
			System.out.println("Car2 price: " + car2.getprice());
			
	
	for (int number = 1; number <= 10; number++) {
		System.in.toString();
		System.out.println("$" + number + "k");
		
	}

}
}
