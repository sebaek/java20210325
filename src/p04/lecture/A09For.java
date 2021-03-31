package p04.lecture;

public class A09For {
	public static void main(String[] args) {
		
		System.out.println("실행문1");
		
		
		// 실행순서:
		// 1번 --> 2번 -true-> 코드블록 --> 3번 --> 2번
		//            -false-> 종료
		
		//   1번      ; 2번  ; 3번
		for (int i = 0; i < 3; i++) {
			// 코드블록
			System.out.println("반복할 코드들...");
		}
		
		System.out.println("실행문2");
	}
}
