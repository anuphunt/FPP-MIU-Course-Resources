import java.util.Scanner;

public class StarProblem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int size = sc.nextInt();
        String[][] triangle = new String[size][size];
        
        for(int i =0; i<triangle[0].length; i++){
            for(int j = 0; j<triangle.length; j++){
                if(i == j){
                    triangle[i][j] = "*";
                }
                else if(j == 0){
                    triangle[i][j] = "*";
                }
                else if(i == triangle.length -1){
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