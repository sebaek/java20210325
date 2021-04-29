package p99.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1512 {
	public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map  = new HashMap<>();
        
        for (int n : nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int cnt = entry.getValue();
            
            res += cnt * (cnt-1) / 2;
        }
        return res;
    }
}
