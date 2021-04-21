package p99.codingbat;

public class WarmUp1Solution {
	public String everyNth(String str, int n) {
		String res = "";

		for (int i = 0; i < str.length(); i += n) {
			res += str.charAt(i);
		}

		return res;
	}

	public String endUp(String str) {
		if (str.length() < 3) {
			return str.toUpperCase();
		}

		String end = str.substring(str.length() - 3);
		String front = str.substring(0, str.length() - 3);

		return front + end.toUpperCase();
	}

	public boolean lastDigit(int a, int b) {
		return (a % 10) == (b % 10);
	}

	public boolean stringE(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'e') {
				cnt++;
			}
		}

		return 1 <= cnt && cnt <= 3;
	}

	public int max1020(int a, int b) {
		if (a < 10 || 20 < a) {
			a = 0;
		}

		if (b < 10 || 20 < b) {
			b = 0;
		}

		return Math.max(a, b);
	}

	public boolean in3050(int a, int b) {
		boolean a3040 = (30 <= a) && (a <= 40);
		boolean b3040 = (30 <= b) && (b <= 40);

		boolean a4050 = (40 <= a) && (a <= 50);
		boolean b4050 = (40 <= b) && (b <= 50);

		return (a3040 && b3040) || (a4050 && b4050);
	}

	public int close10(int a, int b) {
		int a10 = Math.abs(10 - a);
		int b10 = Math.abs(10 - b);

		if (a10 < b10) {
			return a;
		} else if (b10 < a10) {
			return b;
		} else {
			return 0;
		}
	}

	public int intMax(int a, int b, int c) {
		int ab = Math.max(a, b);
		int max = Math.max(ab, c);

		return max;
	}

	public String startOz(String str) {
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && str.charAt(i) == 'o') {
				res += 'o';
				continue;
			}

			if (i == 1 && str.charAt(i) == 'z') {
				res += 'z';
				break;
			}
		}

		return res;
	}

	public boolean mixStart(String str) {
		if (str.length() < 3) {
			return false;
		}

		return str.substring(1, 3).equals("ix");
	}

	public String delDel(String str) {
		if (str.length() < 4) {
			return str;
		}

		String d = str.substring(1, 4);
		if (d.equals("del")) {
			return str.substring(0, 1) + str.substring(4);
		} else {
			return str;
		}
	}

	public boolean loneTeen(int a, int b) {
		boolean aTeen = (13 <= a) && (a <= 19);
		boolean bTeen = (13 <= b) && (b <= 19);

		return aTeen ^ bTeen;
	}

	public boolean hasTeen(int a, int b, int c) {
		boolean aTeen = (a >= 13) && (a <= 19);
		boolean bTeen = (b >= 13) && (b <= 19);
		boolean cTeen = (c >= 13) && (c <= 19);

		return aTeen || bTeen || cTeen;
	}

	public boolean startHi(String str) {
		if (str.length() >= 2) {
			char first = str.charAt(0);
			char second = str.charAt(1);
			return first == 'h' && second == 'i';
		}

		return false;
	}

	public String front22(String str) {
		if (str.length() > 2) {
			String front = str.substring(0, 2);

			return front + str + front;
		}

		return str + str + str;

	}

	public boolean or35(int n) {
		return (n % 3 == 0) || (n % 5 == 0);
	}

	public String front3(String str) {

		String front = str;

		if (str.length() > 3) {
			front = str.substring(0, 3);
		}

		return front + front + front;
	}

	public String frontBack(String str) {
		if (str.length() > 1) {
			char front = str.charAt(0);
			char last = str.charAt(str.length() - 1);

			String mid = str.substring(1, str.length() - 1);

			return last + mid + front;
		}

		return str;

	}

	public String missingChar(String str, int n) {
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			if (i != n) {
				res += str.charAt(i);
			}
		}

		return res;
	}

	public String notString(String str) {
		if (str.startsWith("not")) {
			return str;
		} else {
			return "not " + str;
		}

		/*
		 * if (str.length() < 3) { return "not " + str; }
		 * 
		 * String front = str.substring(0, 3);
		 * 
		 * if (front.equals("not")) { return str; } else { return "not " + str; }
		 */
	}

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return (a < 0) && (b < 0);
		} else {
			return (a * b) < 0;
		}
	}

	public boolean nearHundred(int n) {
		int diff = n - 100;

		if (diff >= -10 && diff <= 10) {
			return true;
		}

		diff = n - 200;

		if (diff >= -10 && diff <= 10) {
			return true;
		}

		return false;
	}

	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10) {
			return true;
		}

		if (a + b == 10) {
			return true;
		}

		return false;

	}

	public boolean parrotTrouble(boolean talking, int hour) {

		if (talking) {
			if (hour < 7 || hour > 20) {
				return true;
			}
		}
		return false;
	}

	public int diff21(int n) {
		if (n < 22) {
			return 21 - n;
		} else {
			return (n - 21) * 2;
		}
	}

	public int sumDouble(int a, int b) {
		return (a == b) ? (a + b) * 2 : (a + b);
	}

	public boolean in1020(int a, int b) {
		// return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);

		if (a >= 10 && a <= 20) {
			return true;
		}

		if (b >= 10 && b <= 20) {
			return true;
		}

		return false;
	}

	public boolean icyHot(int temp1, int temp2) {

		if (temp1 < 0 && temp2 > 100) {
			return true;
		}

		if (temp1 > 100 && temp2 < 0) {
			return true;
		}

		return false;
		/*
		 * return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
		 */
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		return aSmile == bSmile;
	}

	public boolean sleepIn(boolean weekday, boolean vacation) {
		return !weekday || vacation;
	}

	public String backAround(String str) {
		String res = "";
		int len = str.length();
		String last = str.substring(len - 1, len);

		res = last + str + last;

		return res;
	}

}
