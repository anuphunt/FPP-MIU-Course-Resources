
import java.util.Scanner;
//This is a class that changes a uppercase characters to lowercase and lowercase character to uppwercase.
public class UpperLower {
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text: ");
        StringBuffer text = new StringBuffer(sc.nextLine());

        for(int i = 0; i<text.length(); i++){
            var originalChar = text.charAt(i);
            if(originalChar >='a' && originalChar<='z'){
                var newChar = Character.toUpperCase(originalChar);
                text.replace(i, i+1, String.valueOf(newChar));
            }
            else if(originalChar >= 'A' && originalChar <= 'Z'){
                var newChar = Character.toLowerCase(originalChar);
                text.replace(i, i+1, String.valueOf(newChar));
            }
        }
        System.out.println(text);
    }
}