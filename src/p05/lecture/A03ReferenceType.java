package p05.lecture;

public class A03ReferenceType {
	// 그림 : 02.참조타입.png
	public static void main(String[] args) {
		int i = 3;
		int j = 3;
		
		String s = new String("java");
		String t = new String("java");
		
		System.out.println(i == j);
		System.out.println(s == t);
	}
}
