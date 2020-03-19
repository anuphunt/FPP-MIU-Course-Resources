package stackToQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		Deque<String> stack = new ArrayDeque<String>();
		
		stack.push("Tom");
		stack.push("Harry");
		stack.push("Sally");
		stack.push("Robin");

		//pushing stack to queue
		for(String s: stack) {
			queue.add(s);
		}
		
		stack.clear();
		
		
		//pushing queue to stack
		for(String s: queue) {
			stack.push(s);
		}
		
		
		//emptying stack to stack2 while maintaining the same order.
		Deque<String> stack1 = new ArrayDeque<String>();
		Deque<String> stack2 = new ArrayDeque<String>();

		while(stack.size() != 0) {
			stack1.push(stack.pop());
		}
		
		while(stack1.size() != 0) {
			stack2.push(stack1.pop());
		}
		System.out.println(stack2);
	}
}
