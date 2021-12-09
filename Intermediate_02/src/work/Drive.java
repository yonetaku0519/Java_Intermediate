package work;

public class Drive {

	public static void main(String[] args) {
		
		Truck tr = new Truck();
		SportCar sc = new SportCar();
		
		Driver driver = new Driver();
		
		driver.drive(tr);
		driver.drive(sc);
		

	}

}
