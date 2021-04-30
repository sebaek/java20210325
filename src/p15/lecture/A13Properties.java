package p15.lecture;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A13Properties {
	public static void main(String[] args) throws Exception {
		Map<String, String> map1 = new HashMap<>();
		
		String path = "bin/p15/lecture/config1.properties";
		Scanner scanner = new Scanner(new File(path));
		
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		
		scanner.close();
	}
}
















