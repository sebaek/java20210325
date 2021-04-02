package p05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int[] array = {-11, -15, -13, -18, -12};
		// 최대값
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		// 최소값
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		// 합계
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		// 평균
		double avg = sum / (double) array.length;
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}




