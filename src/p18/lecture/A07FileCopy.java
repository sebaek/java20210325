package p18.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class A07FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/p18/lecture/A02InputStream.java";
		String des = "src/p18/lecture/A02InputStream.copy2";
		
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(des);

		byte[] datas = new byte[20];
		int len = 0;
		while ((len = is.read(datas)) != -1) {
//			os.write(datas); // 20bytes
			os.write(datas, 0, len); // len bytes
		}
		
		is.close();
		os.close();
		
		System.out.println("복사 완료");
	}
}











