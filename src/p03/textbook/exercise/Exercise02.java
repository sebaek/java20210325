package p03.textbook.exercise;

public class Exercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		int z = (++x) + (y--);
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);
	}
}
