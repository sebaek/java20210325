package p05.lecture;

public class A18ArraySample {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 4, 5, 6, 7};
		int[] arr2 = new int[] {99, 88, 70};
		
		double avg1 = avg(arr1);
		double avg2 = avg(arr2);
		
		System.out.println(avg1); // 5
		System.out.println(avg2); // 85.666666666667
	}
	
	public static double avg(int[] arr) {
		// 작성할 곳..
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		double avg = (double) sum / arr.length;
		
		return avg;
	}
}





