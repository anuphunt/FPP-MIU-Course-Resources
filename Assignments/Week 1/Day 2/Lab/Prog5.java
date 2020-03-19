
import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a text: ");
        String text = sc.nextLine();

        //Reversing String
        String reverseText = ""; 
        for(int i = text.length()-1; i >= 0; i--){
            reverseText += text.charAt(i);
        }
        System.out.println("Reverse Text: " + reverseText);

        //counting X
        int countX = 0;
        for(int i = 0; i<text.length(); i++){
            if(text.charAt(i) == 'X' || text.charAt(i) == 'x'){
                countX++;
            }
        }
        System.out.println(countX + " 'x' charaters.");

        sc.close();
    }
}