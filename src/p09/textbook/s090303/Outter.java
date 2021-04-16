package p09.textbook.s090303;

public class Outter {

	public void method1(final int arg) {
		final int localVarialbe = 1;
//		arg = 100;
//		localVarialbe = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVarialbe;
			}
		}
	}
	
	
	public void method2(int arg) {
		int localVariale = 1;
//		arg = 100;
//		localVariale = 100;
		
		class Inner {
			public void method() {
				int result = arg + localVariale;
			}
		}
	}
}












