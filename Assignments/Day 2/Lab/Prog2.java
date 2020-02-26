

public class Prog2 {
    public static void main(String[] args){
        float a, b, c;
        a = 1.27f; b = 3.881f; c = 9.6f;

        int sum;
        sum = (int) (a + b + c);
        System.out.println("The sum of the floats as an integer, obtained by casting the sum to type int is " + sum);
        
        sum = Math.round(a + b + c);
        System.out.println("the sum of the floats as an integer, obtained by rounding the sum to the nearest integer, using the Math.round function " + sum);
    }
}