package p15.lecture.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05List {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(4,6,9,10);
		List<Integer> list2 = Arrays.asList(-3,-8,-10,-99,-22);
		List<Integer> list3 = Arrays.asList(8888, 9999, 222, 111);
		List<Integer> list4 = Arrays.asList(3030,223,123);
		
//		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<List<Integer>> list = new ArrayList<>();
		
		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		
		int max = max(list);
		System.out.println(max);
		
	}
}
















