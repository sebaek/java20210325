package p02.lecture;

public class A06TypeLong {
	public static void main(String[] args) {
		// long : 8byte(64bit) 
		//
		System.out.println("최대값");
		System.out.println(Long.MAX_VALUE);
		System.out.println("최소값");
		System.out.println(Long.MIN_VALUE);
		
		long longVar;
		longVar = 9223372036854775807L; // L 을 끝에 작성 long literal
		longVar = -9223372036854775808L;
//		longVar = -9223372036854775809L; // not ok
//		longVar = 9223372036854775808L;  // not ok
		
		longVar = 1_000_000;
		longVar = 100_0000;
		
		
		
	}
}






