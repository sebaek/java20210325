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
		
		max = max2(list);
		System.out.println(max);
		
		List<Integer> flatList = flat(list);
		System.out.println(flatList.size()); // 16
		System.out.println(flatList.get(15)); // 123
		
		flatList = flat2(list);
		System.out.println(flatList.size()); // 16
		System.out.println(flatList.get(15)); // 123
	}

	private static List<Integer> flat2(List<List<Integer>> list) {
		List<Integer> flat = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			List<Integer> sub = list.get(i);
			
			for (int j = 0; j < sub.size(); j++) {
//				Integer item = sub.get(j);
//				flat.add(item);
				flat.add(sub.get(j));
			}
		}
		
		return flat;
	}

	private static List<Integer> flat(List<List<Integer>> list) {
		List<Integer> flat = new ArrayList<>();
		
		for (List<Integer> sub : list) {
			for (Integer item : sub) {
				flat.add(item);
			}
		}
		
		return flat;
	}

	private static int max2(List<List<Integer>> list) {
		int max = Integer.MIN_VALUE;
		
		for (List<Integer> sub : list) {
			for (int item : sub) {
				if (item > max) {
					max = item;
				}
			}
		}
		
		return max;
	}

	private static int max(List<List<Integer>> list) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < list.size(); i++) {
			List<Integer> subList = list.get(i);
			
			for (int j = 0; j < subList.size(); j++) {
				int item = subList.get(j);
				
				if (item > max) {
					max = item;
				}
			}
		}
		
		return max;
	}
}
















