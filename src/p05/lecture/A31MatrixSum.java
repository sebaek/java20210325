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
		
		int[][] mat3 = sum2(mat1, mat2);
		
		for (int[] row : mat3) {
			System.out.println(Arrays.toString(row));
		}
	}
	
	private static int[][] sum2(int[][] a, int[][] b) {
		int[][] c = new int[a.length][];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new int[a[i].length];
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}

	private static int[][] sum(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length]; // 수정해야함...
		
		// 코드 작성....
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}
}
















