package p04.lecture;

public class A14Break {
	public static void main(String[] args) {
		// break : 가장 가까운 loop (for, while, switch) 종료
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			if (i == 3) {
				break;
			}
		}
		
		System.out.println("다음 실행 흐름....");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + ", " + j);
				if (j == 3) {
					break;
				}
			}
		}
		
		System.out.println("또 다음 실행 흐름....");
	}
}














