package p11.textbook.exercises.ex10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		
		// 알파벳시작, 숫자알파벳, 총8~12자
		id = "a38k3lo22ll";
//		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		String regExp = "[a-zA-Z]\\w{7,11}";
		
		// \w ==> [a-zA-Z0-9_]
		
		boolean isMatch = Pattern.matches(regExp, id);
		
		if (isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
	}
}
