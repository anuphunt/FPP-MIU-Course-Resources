package checkdelimiter;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) {

		String s1 = "(a + b[(x+y)] + 10)";

		Deque<Character> stack = new ArrayDeque<Character>();
		char[] arr = s1.toCharArray();

		for (char ch : arr) {
			switch (ch) {
			case '(':
			case '[':
				stack.push(ch);
				break;
			case ')':
				if (stack.size() == 0) {
					System.out.println("Missing '('");
					return;
				} else {
					if (stack.peek() == '(')
						stack.pop();
					else {
						System.out.println("Missing '('");
						return;
					}
				}
				break;
			case ']':
				if (stack.size() == 0) {
					System.out.println("Missing '['");
					return;
				} else {
					if (stack.peek() == '[')
						stack.pop();
					else {
						System.out.println("Missing '['");
						return;
					}
						
				}
				break;
			}
		}
		while (stack.size() != 0) {
			char ch = stack.pop();
			switch (ch) {
			case '(':
				System.out.println("Missing ')'");
				return;
			case '[':
				System.out.println("Missing ']'");
				return;
			}
		}
		
		System.out.println("All delimiters are matching. ");
	}
}
