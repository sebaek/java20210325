package p18.lecture;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class A05OutputStream {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18/lecture/output2.txt";
		OutputStream os = new FileOutputStream(fileName);
		
		byte[] datas = new byte[50];
		
		os.write(datas);
		os.write(datas);
		os.write(datas, 0, 33); // 바이트배열, 시작위치, 갯수
		
		os.close();
	}
}




