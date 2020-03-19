package pushandpop;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] arge) {
		
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		stack.push(sc.nextInt());
		
		while(true) {
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			if(num == -1) {
				break;
			}
			stack.push(num); 
		}
		
		if(stack.size() ==1) {
			System.out.print(stack.pop());
			return;
		}
		
		while(stack.size() != 0) {
			if(stack.size() == 1) {
				System.out.println("and " + stack.pop());
			}
			else {
				System.out.print(stack.pop() + ", ");				
			}
		}
		sc.close();
	}
}
