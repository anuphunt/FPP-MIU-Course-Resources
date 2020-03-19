package linkedlist;

import java.util.*;

public class Main {

	static List<Character> A = new LinkedList<Character>();
	static List<Character> B = new LinkedList<Character>();
	static List<Character> C = new LinkedList<Character>();

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		while (true) {
			System.out.println("Enter Command: \n 'R' - Read String \n "
					+ "'W' - Write String \n 'C' - Concatenate String \n "
					+ "'CLEAR' - Clear String \n 'LEN' - Length \n "
					+ "'COMPARE' - Compare List");
			var command = sc.nextLine();

			switch (command.toUpperCase()) {
			case "R":
				readString();
				break;
			case "W":
				writeString();
				break;
			case "C":
				concatenateString();
				break;
			case "CLEAR":
				clearList();
				break;
			case "LEN":
				int length = len();
				System.out.println("The length of the string is: " + length);
				break;
			case "COMPARE":
				boolean equals = equals();
				String msg = equals? "The two strings are equal" : "The two strings are not equal.";
				System.out.println(msg);
				break;
			case "Q":
				System.exit(1);
			default: 
				System.out.println("Command doesn't exist.");
			}
		}
	}

	public static boolean equals() {
		System.out.println("Enter First List: (A, B, or C)");
		var first = sc.nextLine();
		System.out.println("Enter Second List: (A, B, or C");
		var second = sc.nextLine();
		var firstList = getListFromString(first);
		var secondList = getListFromString(second);
		
		var firstItr = firstList.listIterator();
		var secondItr = secondList.listIterator();
		
		while(firstItr.hasNext() && secondItr.hasNext()){
			var firstNext = firstItr.next();
			var secondNext = secondItr.next();
			
			if(firstNext.compareTo(secondNext) != 0) {
				return false;
			}
		}
		return true;
	}

	public static void clearList() {
		System.out.println("Enter List Name: (A, B, or C)");
		var listName = sc.nextLine();
		List<Character> list = getListFromString(listName);
		if(list == A)
			A.clear();
		else if(list == B)
			B.clear();
		else if(list == C)
			C.clear();
	}

	public static void concatenateString() {
		System.out.println("Enter Target: ");
		var target = sc.nextLine();
		System.out.println("Enter Source: ");
		var source = sc.nextLine();
		
		var targetList = getListFromString(target);
		var sourceList = getListFromString(source);
		
		targetList.addAll(sourceList);
		
		for(int i = 0; i<targetList.size(); i++) {
			System.out.print(targetList.get(i));
		}
		System.out.println("\n");
	}

	public static void writeString() {
		System.out.println("Enter String Name: (A, B, or C)");
		String stringName = sc.nextLine();
		var list2 = getListFromString(stringName);
		writeList(list2);
	}

	public static void readString() {
		System.out.println("Enter String Name: (A, B, or C)");
		String stringName = sc.nextLine();
		System.out.println("Enter a text: ");
		var text = sc.nextLine();
		var list = getListFromString(stringName);
		populateList(list, text);
	}
	
	public static int len() {
		System.out.println("Enter String Name: (A, B, or C)");
		String stringName = sc.nextLine();
		List<Character> list = getListFromString(stringName);
		ListIterator<Character> iterator = list.listIterator();
		int count = 0;
		while(iterator.hasNext()) {
			iterator.next();
			count++;
		}
		return count;
	}

	private static List<Character> getListFromString(String s) {
		switch (s.toUpperCase()) {
		case "A":
			return A;
		case "B":
			return B;
		case "C":
			return C;
		default: 
			System.out.println("String doesn't exist");
		}
		return null;
	}

	private static void populateList(List<Character> list, String text) {
		for (int i = 0; i < text.length(); i++) {
			list.add(text.charAt(i));
		}
	}

	private static void writeList(List<Character> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
	}

}

