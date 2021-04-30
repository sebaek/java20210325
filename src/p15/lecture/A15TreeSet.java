package p15.lecture;

import java.util.Iterator;
import java.util.TreeSet;

public class A15TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(100);
		set.add(50);
		set.add(200);
		set.add(30);
		set.add(300);
		
		for (int n : set) {
			System.out.println(n);
		}
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.lower(210));
		System.out.println(set.higher(210));
		
		System.out.println("내림 차순 탐색");
		Iterator<Integer> di = set.descendingIterator();
		
		while (di.hasNext()) {
			System.out.println(di.next());
		}
	}
}







