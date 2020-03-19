import java.util.Scanner;

public class StringBuffer1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a text: ");
		
		//Question (a)
		StringBuffer textBuffer = new StringBuffer(sc.nextLine());
		
		
		System.out.println("Appending 'bye'...");
		
		textBuffer.append("bye");
		
		System.out.println(textBuffer);
		
		//Question (b)
		System.out.println("Changing lowercase to uppercase and uppercase to lowercase..");
		
		for(int i = 0; i<textBuffer.length(); i++) {
			
			
			if(textBuffer.charAt(i) >= 'a' && textBuffer.charAt(i) <= 'z') {
				int diff = textBuffer.charAt(i) - 'a';
				int capitalAscii = 'A' + diff;
				char newChar = (char) capitalAscii;
				
				textBuffer.replace(i, i+1, String.valueOf(newChar));
			}
			
			else if(textBuffer.charAt(i) >= 'A' && textBuffer.charAt(i)<= 'Z') {
				int diff = textBuffer.charAt(i) - 'A';
				int smallAscii = 'a' + diff;
				char newChar = (char) smallAscii;
				
				textBuffer.replace(i, i+1, String.valueOf(newChar));
			}
		}
		
		System.out.println(textBuffer);

		sc.close();
    }
}