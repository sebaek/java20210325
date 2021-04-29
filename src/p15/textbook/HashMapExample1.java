package p15.textbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println("총 Entry 수: " + map.size());
		
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		for (Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}
}












