package p08.lecture.ex7;

public class A01InterfaceExtends {
	public static void main(String[] args) {
		MyInterface2 i2 = new MyInterface2() {

			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void method2() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

}

interface MyInterface1 {
	void method1();
}

interface MyInterface2 extends MyInterface1 {
	void method2();
}




