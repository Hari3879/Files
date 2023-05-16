package com.ojas.dailytask;

import java.util.Stack;

class WildCardPattern {
	public static void printAllCombinations(String pattern) {
		if (pattern == null || pattern.length() == 0) {
			return;
		}

		Stack<String> stack = new Stack<>();
		stack.push(pattern);
		int index;

		while (!stack.empty()) {
			String curr = stack.pop();

			if ((index = curr.indexOf('?')) != -1) {
				for (char ch = '0'; ch <= '1'; ch++) {
					curr = curr.substring(0, index) + ch + curr.substring(index + 1);
					stack.push(curr);
				}
			}

			else {
				System.out.println(curr);
			}
		}
	}

	public static void main(String[] args) {
		String pattern = "1?11?00?1?";

		printAllCombinations(pattern);
	}
}