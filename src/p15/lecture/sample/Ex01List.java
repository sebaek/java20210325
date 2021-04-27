package p15.lecture.sample;

import java.util.Arrays;
import java.util.List;

public class Ex01List {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7, 9, -100, 30, 90, 700);
		
		System.out.println(list);
		
		int sum = sum(list);
		System.out.println(sum);
	}
	
}
