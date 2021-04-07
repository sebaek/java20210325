package p06.textbook.s060803;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
		
		myCar.keyTurnOn();
		myCar.run();
		
		speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
	}
}
