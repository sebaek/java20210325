package p05.lecture;

import java.util.Arrays;

public class A31MatrixSum {
	public static void main(String[] args) {
		int[][] mat1 = {
				{1, 2, 3},
				{5, 6, 7},
				{9, 8, 7},
				{2, 3, 4},
		};
		
		int[][] mat2 = {
				{22, 33, 44},
				{77, 88, 99},
				{3, 2, 1},
				{0, 1, 2},
		};
		
		int[][] mat3 = sum(mat1, mat2);
		
		for (int[] row : mat3) {
			System.out.println(Arrays.toString(row));
		}
	}

	private static int[][] sum(int[][] a, int[][] b) {
		int[][] c = new int[][]; // 수정해야함...
		
		// 코드 작성....
		
		return c;
	}
}
















