package p06.textbook.s060801;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myClac = new Calculator();
		myClac.powerOn();
		
		int result1 = myClac.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myClac.divide(x, y);
		System.out.println("result2: " + result2);
		
		myClac.powerOff();
	}
}





