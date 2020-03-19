public class TwoDimensionalArrays {
    public static void main(String[] args){
        int[][] table = new int[][] {
            {10000, 10000, 10000, 10000, 10000, 10000},
            {11000, 11100, 11200, 11300, 11400, 11500},
            {12100, 12321, 12544, 12769, 12996, 13225}
        };
        
        //average of rows
        for(int i =0;i<table.length; i++){
            int sum = 0;
            for(int j = 0; j<table[i].length; j++){
                sum += table[i][j];
            }
            System.out.printf("Average of Row %d: %d \n", i, sum/table[i].length);
        }

        //average of columns
        for(int i =0; i<table[0].length; i++){
            int sum = 0;
            for(int j =0; j<table.length; j++){
                sum += table[j][i];
            }
            System.out.printf("Average of Columns %d: %d \n", i, sum/table.length);
        }
    }
}