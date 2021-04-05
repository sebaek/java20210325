package p05.textbook.exercise;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				// 학생수
				System.out.print("학생수>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];

				break;
			case 2:
				// 점수입력
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}
				break;
			case 3:
				// 점수리스트
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				break;
			case 4:
				// 분석
				int max = Integer.MIN_VALUE;
				double sum = 0;
				double avg = 0;
				
				for (int score : scores) {
					sum += score;
					if (score > max) {
						max = score;
					}
//					max = (max > score) ? max : score;
//					max = Math.max(max, score);
				}
				
				avg = sum / scores.length;
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				break;
			case 5:
				// 종료
				run = false;
				break;

			}
		}

		scanner.close();
		System.out.println("프로그램 종료");
	}
}
