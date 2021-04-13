package p07.lecture.p6polymorphism.ex3;

public class A01AbstractClass {
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		KindaCat k2 = new Tiger();
		
		KindaCat k3 = new KindaCat(); // 인스턴스 만들 수 없음
	}
}
