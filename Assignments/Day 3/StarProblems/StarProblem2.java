import java.util.Scanner;

public class StartProblem2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int size = sc.nextInt();

        String[][] triangle = new String[size][size];

        for(int i = 0; i<size; i++){
            for(int j = size-1; j>=0; j--){
                if(j == 0){
                    triangle[i][j] = "*";
                }
                else if(i == size -1){
                    triangle[i][j] = "*";
                }
                else if(i == j){
                    triangle[i][j] = "*";
                }
                else 
                    triangle[i][j] = " ";
                System.out.print(triangle[i][j]);
            }
            System.out.println("");
        }
        sc.close();
    }
}