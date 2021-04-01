package p05.lecture;

public class A05StringLiteral {
	// 그림 : 04.String.png
	public static void main(String[] args) {
		String s = new String("java");
		String t = "java";
		String u = "java";
		
		System.out.println(s == t);
		System.out.println(t == u);
	}
}
