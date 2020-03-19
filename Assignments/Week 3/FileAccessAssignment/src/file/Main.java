package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner s = null;
		try {
			File f = new File("test.java");
			s = new Scanner(f);
			String text = "";
			String word = null;
			try {
				while( (word = s.next()) != null){
					System.out.println(word);
					text += word;
				}
			}
			catch(NoSuchElementException e){
				//No more 
			}	
			System.out.println(text);
		} catch (FileNotFoundException e1) {
			System.out.println("File Not Found!");
			System.exit(0);
			e1.printStackTrace();
		}
		s.close();
		
		
//		Question c Read from test.java and copy to MyCopy.java
		readAndCopy();

	}
	
	static void readAndCopy() {
		File input = new File("test.java");
		File output = new File("MyCopy.java");
		try {
			Scanner sc = new Scanner(input);
			PrintWriter printer = new PrintWriter(output);
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				printer.write(s);
			}
			printer.flush();
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
}
