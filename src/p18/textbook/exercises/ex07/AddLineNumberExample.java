package p18.textbook.exercises.ex07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String path 
		= "src/p18/textbook/exercises/ex07/AddLineNumberExample.java";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		int lineNum = 0;
		while ((line = br.readLine()) != null) {
			System.out.println((++lineNum) + ": " + line);
		}
		
		br.close();
		fr.close();
	}
}





