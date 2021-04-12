package p07.lecture.p2constructor;

public class Sub extends Super {
	
	public Sub(int i) {
		// 상위 클래스 생성자 호출
//		this.i = i; // x
		super(i);
	}
}
