package p99.leetcode;

import java.util.Stack;

public class Solution1047 {
	public String removeDuplicates(String S) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);

			char last = ' ';
			if (!stack.empty()) {
				last = stack.peek();
			}
			if (last == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		String res = "";
		for (int i = 0; i < stack.size(); i++) {
			res += stack.get(i);
		}

		return res;
	}
}
