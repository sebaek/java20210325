package p05.lecture;

import java.util.Arrays;

public class A27ArrayOfArray {
	// 그림 : 11.배열의 배열.png
	public static void main(String[] args) {
		int[] arr1 = { 3, 4, 5 };

		int[][] arr = { { 99, 88, 77 }, { 3, 4 } };
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		
		System.out.println("arr의 길이: " + arr.length);
		System.out.println("arr[0]의 길이: " + arr[0].length);
		System.out.println("arr[1]의 길이: " + arr[1].length);
		
		arr[0][2] = 66;
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
	}
}




