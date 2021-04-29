package p99.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1207 {
	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int n : arr) {
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
		}

		Set<Integer> values = new HashSet<>();

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int value = entry.getValue();

			if (values.contains(value)) {
				return false;
			}

			values.add(value);
		}

		return true;
	}
}
