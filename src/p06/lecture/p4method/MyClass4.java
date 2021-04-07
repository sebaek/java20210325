package p06.lecture.p4method;

public class MyClass4 {
	void method1() {
		System.out.println("method1 호출...");
	}
	
	int method2() {
		System.out.println("method2 호출...");
		
		return 5;
	}
	
	String method3() {
		System.out.println("method3 호출...");
		
		return "";
	}
	
	int[] method4() {
		System.out.println("method4 호출...");
		return new int[] {};
	}
	
	int[] method5() {
		System.out.println("method5 호출...");
		int[] res = {};
		
		return res;
	}
	
	String method6() {
		System.out.println("method6 호출...");
		
		boolean b = 3 < 5;
		
		if (b) {
			return "hello";
		} else {
			return "hello";
		}
	}
}










