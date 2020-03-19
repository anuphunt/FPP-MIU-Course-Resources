
public class AverageOfArray {
    public static void main(String[] args){
        int[] arrayOfInts = new int[]{2, -21, 3, 45, 0, 100, 18, 6, 3, 1, 0, -100};
        System.out.println(average(arrayOfInts));
    }

    static int average(int[] arrayOfInts){
        int sum = 0;
        for(int value: arrayOfInts){
            sum += value;
        }
        return sum/arrayOfInts.length;
    }
}