package p18.lecture;

import java.io.FileInputStream;
import java.io.InputStream;

public class A03InputStream {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18/lecture/A02InputStream.java";
		InputStream is = new FileInputStream(fileName);

		byte[] datas = new byte[20];

//		int cnt = is.read(datas);
//		
//		System.out.println(datas[0]);
//		System.out.println(datas[1]);
//		System.out.println(datas[2]);
//		
//		System.out.println(cnt);

		int cnt = 0;
		while ((cnt = is.read(datas)) != -1) {
			System.out.println(cnt);
		}

		is.close();
	}
}







