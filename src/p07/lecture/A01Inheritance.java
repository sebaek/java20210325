package p07.lecture;

public class A01Inheritance {
	// 상속 : 상속받는 클래스는 상속하는 클래스의 멤버를 갖는다.
	
	// 상속받는 클래스: 하위클래스, 자식클래스, sub class
	// 상속하는 클래스: 상위클래스, 부모클래스, super class
	
	// 문법: 서브클래스 extends 수퍼클래스

	public static void main(String[] args) {
		A01Child o1 = new A01Child();
//		A01Child o2 = new A01Child(3);
		
		o1.i = 3;
		o1.method1();
	}
}











