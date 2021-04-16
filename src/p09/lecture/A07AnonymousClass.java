package p09.lecture;

public class A07AnonymousClass {
	// field
	MyInterface o1 = new MyInterface() {
		
	};
	
	void method2() {
		// 매개값(argument)
		method(new MyInterface() {
			
		});
	}
	
	void method(MyInterface o) {
		
	}
}
