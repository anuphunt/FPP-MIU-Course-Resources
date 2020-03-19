package queueAssignment2;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String noColon = "N";
		String leftLonger = "L";
		String rightLonger = "R";
		String sameLengthDifferentValue = "D";
		String same = "S";

		Queue<Character> beforeColon = new LinkedList<Character>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text: ");
		String text = sc.nextLine();

		char[] arr = text.toCharArray();

		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == ':') break;
			beforeColon.add(arr[i]);
		}
		
		int rightTextSize = 0;
		if (text.length() != beforeColon.size()) {
			rightTextSize = text.length() - beforeColon.size() - 1;
		}

		if (rightTextSize == 0) {
			System.out.println(noColon);
		} else if (beforeColon.size() > rightTextSize) {
			System.out.println(leftLonger);
		} else if (beforeColon.size() < rightTextSize) {
			System.out.println(rightLonger);
		} else if (beforeColon.size() == rightTextSize) {
			String[] textArr = text.split(":");
			if(textArr[0].equals(textArr[1])) {
				System.out.println(same);
			}
			else System.out.println(sameLengthDifferentValue);
			
		}
		sc.close();
	}
	

}
