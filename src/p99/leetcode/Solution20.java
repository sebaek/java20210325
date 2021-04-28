package p99.leetcode;

import java.util.Stack;

public class Solution20 {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == ')') {
				if (stack.empty()) {
					return false;
				}
				char o = stack.pop();
				if (o != '(') {
					return false;
				}
			} else if (c == '}') {
				if (stack.empty()) {
					return false;
				}
				char o = stack.pop();
				if (o != '{') {
					return false;
				}
			} else if (c == ']') {
				if (stack.empty()) {
					return false;
				}
				char o = stack.pop();
				if (o != '[') {
					return false;
				}
			} else {
				stack.push(c);
			}
		}

		return stack.empty();
	}
}
