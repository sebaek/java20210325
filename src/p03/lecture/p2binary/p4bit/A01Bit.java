package p03.lecture.p2binary.p4bit;

public class A01Bit {
	public static void main(String[] args) {
		// and & : 같은 자리의 비트가 둘 다 1이면 1, 나머지 0
		// or |  : 같은 자리의 비트가 둘 다 0이면 0, 나머지 1
		// xor ^ : 같은 자리의 비트가 다르면 1, 같으면 0
		// not ~ : 0 --> 1, 1 --> 0
		
		// and &
		int a = 99; // 2진법 : 00 0110 0011
		int b = 999;// 2진법 : 11 1110 0111
		
		// a & b;      2진법 : 00 0110 0011
		int c = a & b;
		System.out.println(c);
		
		// or |
		c = a | b;  // 2진법 : 11 1110 0111
		System.out.println(c);
		
		// xor ^ 
		c = a ^ b;  // 2진법 : 11 1000 0100
		System.out.println(c);
	}
}





