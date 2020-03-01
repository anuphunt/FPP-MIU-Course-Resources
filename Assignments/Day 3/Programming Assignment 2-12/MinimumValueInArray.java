
public class MinimumValueInArray {
    public static void main(String[] args){

        int[] arrayOfInts = new int[]{2, -21, 3, 45, 0, 100, 18, 6, 3, 1, 0, -100};
        System.out.println(min(arrayOfInts));
    }

    static int min(int[] arrayOfInts){
        
        int minValue = Integer.MAX_VALUE;
        for(int value: arrayOfInts){
            if(value < minValue){
                minValue = value;
            }
        }
        return minValue;
    }
}