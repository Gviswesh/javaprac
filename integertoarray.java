// Java Program to convert
// Set<Integer> to int[] in Java 8

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class integertoarray {

// Function to convert Set of Integer to Set of String
    public static void convertInt2Array(int guess)  {
        String temp = Integer.toString(guess);
        String temp2;
        int temp3;
        int [] newGuess = new int[temp.length()];
        for(int i=0; i<=temp.length(); i++) {
            if (i!=temp.length()) {
                temp2 = temp.substring(i, i+1);
            } else {
                temp2 = temp.substring(i);
                //System.out.println(i);
            }
            temp3 =  Integer.parseInt(temp2);
            newGuess[i] = temp3;
        }

        for(int i=0; i<=newGuess.length; i++) {
            System.out.println(newGuess[i]);
        }
    }

    public static void main(String args[]){
    // Create a set of integers
        Set<Integer> setOfInteger = new HashSet<>(
        Arrays.asList(1, 2, 3, 4, 5));

    // Print the set of Integer
        System.out.println("Set of Integer: " + setOfInteger);

    // Convert Set of integers to set of String
        int[] intArray = convertIntSetToStringSet(setOfInteger);

    // Print the set of String
        System.out.println("Array of Integer: "+ Arrays.toString(intArray));
    }
}
