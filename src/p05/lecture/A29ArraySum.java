package p05.lecture;

import java.util.Arrays;

public class A29ArraySum {
	public static void main(String[] args) {
		int[] arr1 = {3, 4, 5, 6, 7, 8};
		int[] arr2 = {11, 22, 33, 44, 55, 66};
		int[] arr3 = new int[6];
		
		/*
		arr3[0] = arr1[0] + arr2[0];
		arr3[1] = arr1[1] + arr2[1];
		arr3[2] = arr1[2] + arr2[2];
		;
		;
		arr3[5] = arr1[5] + arr2[5];
		*/
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}
		
		System.out.println(Arrays.toString(arr3));
	}
}








