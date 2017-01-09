package stacksqueues;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by broniowj on 2017-01-07.
 *
 * https://www.hackerrank.com/challenges/ctci-balanced-brackets
 */
public class BalancedBrackets {
	static Stack<Character> leftBrackets = new Stack<>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
	}

	static boolean isBalanced(String expression) {
		leftBrackets.removeAllElements();

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				leftBrackets.push(c);
			}
			if (c == ')') {
				if (!leftBrackets.isEmpty() && '(' == leftBrackets.peek()) {
					leftBrackets.pop();
				} else {
					return false;
				}
			}
			if (c == ']') {
				if (!leftBrackets.isEmpty() && '[' == leftBrackets.peek()) {
					leftBrackets.pop();
				} else {
					return false;
				}
			}
			if (c == '}') {
				if (!leftBrackets.isEmpty() && '{' == leftBrackets.peek()) {
					leftBrackets.pop();
				} else {
					return false;
				}
			}
		}
		return leftBrackets.size() == 0;
	}
}
