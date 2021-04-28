package p99.leetcode;

import java.util.Stack;

public class Solution1021 {
	public String removeOuterParentheses(String s) {
		Stack<Character> stack = new Stack<>();
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(') {
				stack.push(c);
				if (stack.size() != 1) {
					res += c;
				}
			} else {
				stack.pop();
				if (stack.size() != 0) {
					res += c;
				}
			}
		}

		return res;
	}
}
