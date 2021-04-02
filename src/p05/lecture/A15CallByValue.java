package p05.lecture;

public class A15CallByValue {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
		System.out.println(arr1[0]);
		arr1[0] = 99;
		System.out.println(arr1[0]);
		
		method1(arr1);
		System.out.println(arr1[0]);
	}
	
	public static void method1(int[] arr) {
		arr[0] = 5000;
	}
}



