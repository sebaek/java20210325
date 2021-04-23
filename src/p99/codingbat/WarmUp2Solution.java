package p99.codingbat;

public class WarmUp2Solution {
	boolean doubleX(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			char c = str.charAt(i);
			if (c == 'x') {
				return str.charAt(i + 1) == 'x';
			}
		}

		return false;
	}

	int countXX(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("xx")) {
				cnt++;
			}
		}

		return cnt;
	}

	public String frontTimes(String str, int n) {
		String res = "";

		String front = str;

		if (str.length() >= 3) {
			front = str.substring(0, 3);
		}

		for (int i = 0; i < n; i++) {
			res += front;
		}

		return res;
	}

	public String stringTimes(String str, int n) {
		String res = "";

		for (int i = 0; i < n; i++) {
			res += str;
		}

		return res;
	}
}
