package arraylist;

import java.util.ArrayList;

public class UsingArrayList {
    public static void main(final String[] args) {
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("dog");
        animals.add("cat");
        animals.add("mouse");
        animals.add("rabbit");

        System.out.println("The size of the ArrayList animals is: " + animals.size());
        System.out.println("List of all animals in array list: ");

        for(int i = 0; i<animals.size(); i++){
            System.out.println(animals.get(i) + "\n");
        }
    }
}