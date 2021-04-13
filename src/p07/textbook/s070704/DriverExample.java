package p07.textbook.s070704;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi =  new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
