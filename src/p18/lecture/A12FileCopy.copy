package p18.lecture;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class A12FileCopy {
	public static void main(String[] args) throws Exception {
		// 파일 복사 Reader, Writer 이용
		
		String src = "src/p18/lecture/A12FileCopy.java";
		String des = "src/p18/lecture/A12FileCopy.copy";
		
		Reader fr = new FileReader(src);
		Writer fw = new FileWriter(des);
		
		// 코드 작성......
		
		int c = 0;
		
		while ((c = fr.read()) != -1) {
			fw.write(c);
		}
		
		fr.close();
		fw.close();
		
		System.out.println("복사 완료");
	}
}




