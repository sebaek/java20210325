package p09.lecture;

public class A03Access {
	class NonStaticClass {
		
	}
	
	static class StaticClass {
		
	}
	
	NonStaticClass o1 = new NonStaticClass();
	StaticClass o2 = new StaticClass();
	
//	static NonStaticClass o4 = new NonStaticClass();
	static StaticClass o3 = new StaticClass();
	
	
	
	void instanceMethod() {
		// non-static(instance) member는 static 접근 가능
		staticMethod();
	}
	
	static void staticMethod() {
		// static member는 non-static(instance) 접근 불가능
//		instanceMethod();
	}
}





