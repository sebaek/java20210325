package p10.textbook.exercise;

public class Solution0105 {
	// 1번 문제
	// 답: 4번
	
	
	public static void main(String[] args) {
		// 2번 문제
		// 답: 3번

		try {
			int i = 1;
			int j = 5 / i;
			return;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block");
		}
		
	}
	
	// 3번 문제
	// 답: 4번
	
	// 4번 문제
	// 답: 2번
	
	
	// 5번 문제
	// 답: 3번
	
	public void method2() {
		try {
			method1();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void method1() throws NumberFormatException, ClassNotFoundException {
		
	}
}







