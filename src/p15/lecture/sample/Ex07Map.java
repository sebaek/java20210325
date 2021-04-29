package p15.lecture.sample;

import java.util.Map;

public class Ex07Map {
	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 1, 3, 3, 2, 3, 2, 1, 4, 5, 5 };
		
		Map<Integer, Integer> map = count(arr1);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		/*
			3:3
			5:2
			1:4
			2:2
			4:1

		 */
	}
}








