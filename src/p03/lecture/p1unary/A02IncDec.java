package p03.lecture.p1unary;

public class A02IncDec {
	public static void main(String[] args) {
		// 증가 연산자
		// ++ : 변수에 1더한 값을 다시 변수에 할당
		
		int x = 5;
		x++;
		System.out.println(x);
		
		// 감소 연산자
		// -- : 변수에 1뺀 값을 다시 변수에 할당
		x--;
		System.out.println(x);
		
		/////////////////
		// 연산자가 앞에 있을 때
		++x;
		System.out.println(x);
		
		int y = 5 + (++x);
		System.out.println(y);
		
		/////////////////
		// 연산자가 뒤에 있을 때
		System.out.println(x);
		
		y = 5 + (x++);
		System.out.println(y);
		System.out.println(x);
	}
}













