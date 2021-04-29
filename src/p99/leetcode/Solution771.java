package p99.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {

	public int numJewelsInStones(String jewels, String stones) {
		Set<Character> jewelSet = new HashSet<>();
		for (int i = 0; i < jewels.length(); i++) {
			jewelSet.add(jewels.charAt(i));
		}

		int result = 0;

		// code......
		for (int i = 0; i < stones.length(); i++) {
			if (jewelSet.contains(stones.charAt(i))) {
				result++;
			}
		}

		return result;
	}
}
