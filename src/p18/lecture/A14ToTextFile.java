package p18.lecture;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class A14ToTextFile {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output4.txt";
		Scanner scanner = new Scanner(System.in);
		
		Writer wr = new FileWriter(file);
		
		String line = "";
		
		while (!line.equals("종료")) {
			System.out.print("입력>");
			line = scanner.nextLine();
			// line이 저장한 문자열을 output4.txt에 쓰기
			// write시 끝에 enter 추가 "\n"
			wr.write(line + "\n");
			
		}
		
		wr.close();
		scanner.close();
		
	}
}
