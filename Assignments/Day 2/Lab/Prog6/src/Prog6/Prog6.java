package Prog6;

import java.util.ArrayList;

public class Prog6 {

	public static void main(String[] args) {
		ArrayList<String> newList = new ArrayList<String>();
		
		for(int i = 0; i < args.length; i++) {
			if(!newList.contains(args[i])) {
				newList.add(args[i]);
			}
		}
		for(String item: newList)
			System.out.println(item);
	}
}
