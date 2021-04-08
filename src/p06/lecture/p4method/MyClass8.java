package p06.lecture.p4method;

public class MyClass8 {

	int max(int... nums) {
		if (nums.length == 0) {
			return 0;
		}
		
		int max = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
		
		return max;
	}

}




