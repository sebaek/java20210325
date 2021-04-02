package p99.programmers;

public class P12935 {
	// 제일 작은 수 제거하기
	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			return new int[] { -1 };
		}

		int[] result = new int[arr.length - 1];

		// 최소값만 빼고 arr의 값을 result에 옮긴다.

		// 최소값 구하기
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		// arr을 result에 옮긴다.
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (min != arr[i]) {
				result[j] = arr[i];
				j++;
			}
		}

		return result;
	}
}
