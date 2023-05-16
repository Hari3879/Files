package com.ojas.nayatasks;

import java.util.Stack;

public class MatchingParathesis {
	public static boolean isMatchingParanthesis(String input) {
		if (input == null) {
			return false;
		}

		if (input.isEmpty()) {
			return true;
		}

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isMatchingParanthesis("(a + b) * c))"));
	}

}
