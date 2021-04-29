package p99.leetcode;

import java.util.HashSet;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {
		Set<Integer> allSet = new HashSet<>();
		Set<Integer> uniSet = new HashSet<>();

		for (int n : nums) {
			if (allSet.contains(n)) {
				uniSet.remove(n);
			} else {
				allSet.add(n);
				uniSet.add(n);
			}
		}

		int sum = 0;
		for (int n : uniSet) {
			sum += n;
		}
		return sum;
	}
}
