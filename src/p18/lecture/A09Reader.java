//p한글
package p18.lecture;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class A09Reader {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/A09Reader.java";
		// byte 단위
		InputStream is = new FileInputStream(file);

		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		
		is.close();
		
		// 문자단위
		Reader rd = new FileReader(file);
		
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		
		rd.close();
	}
}







