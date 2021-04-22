package p11.lecture.arrays;

import static java.util.Arrays.sort;

import java.util.Arrays;

public class A02ArraysSort {
	public static void main(String[] args) {
		int[] arr1 = { 29, 2, 2, 51, 1983, 10, 1, 0, };

		System.out.println(Arrays.toString(arr1));
		sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = {"spring", "java", "python", "sugar"};
		
		System.out.println(Arrays.toString(arr2));
		sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}






