package p15.lecture;

import java.util.HashMap;
import java.util.Map;

public class A11MapEquals {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put(new String("java"), 99);
		map.put(new String("html"), 100);
		map.put(new String("java"), 200);

		System.out.println(map.size());
		System.out.println(map.get("java"));
		
		Map<Computer, Integer> map2 = new HashMap<>();
		
		map2.put(new Computer(100), 30000);
		map2.put(new Computer(200), 40000);
		map2.put(new Computer(100), 70000);
		
		System.out.println(map2.size());
		System.out.println(map2.get(new Computer(100)));
	}
}

class Computer {
	private int model;
	
	public Computer(int model) {
		this.model = model;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + model;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (model != other.model)
			return false;
		return true;
	}
	
	
}

















