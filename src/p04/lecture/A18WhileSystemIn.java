package p04.lecture;

public class A18WhileSystemIn {
	public static void main(String[] args) throws Exception {
		// System.in : 키보드
		
		// System.in.read() : 키보드 키를 int로 리턴
		
		while (true) {
			int key = System.in.read();
			
			System.out.println(key);
		}
		
	}
}


