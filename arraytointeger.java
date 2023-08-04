// // package com.jackrutorial;

import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;
// import java.util.*;
// import java.util.stream.*;
// import java.util.function.Function;

public class arraytointeger {
//     public static int[] convertIntSetToStringSet(Set<Integer> setOfInteger){
//         return setOfInteger.stream().mapToInt(Integer::intValue).toArray();
// }

//  public static void main(String[] args) {
//   int intArrs[] = { 2, 0, 1, 9 };

//   System.out.print("int arrays: [");
//   for (int i=0; i< intArrs.length; i++) {
//    System.out.print(intArrs[i]);
//    if(i < intArrs.length-1) {
//     System.out.print(",");
//    }
//   }
//   System.out.print("]");
  
//   StringBuilder builder = new StringBuilder();
//   for (int num : intArrs) {
//    builder.append(num);
//   }
//   int number = Integer.parseInt(builder.toString());
  
//   System.out.print(" -> converted: ");
//   System.out.println(number);
//   // Java Program to convert
// // Set<Integer> to int[] in Java 8



// // class GFG {

// // Function to convert Set of Integer to Set of String


// // public static void main(String args[])
// // {
// // Create a set of integers
//   Set<Integer> setOfInteger = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

//   // Print the set of Integer
//   System.out.println("Set of Integer: " + setOfInteger);

//   // Convert Set of integers to set of String
//   int[] intArray = convertIntSetToStringSet(number);

//   // Print the set of String
//   System.out.println("Array of Integer: "+ Arrays.toString(intArray));
//   }
// }

// //  }
// // }
// import java.util.Arrays;

// public class ArrayIntegerConverter {
    public static int[] integerToArray(int num) {
        String numString = Integer.toString(num);
        int[] arr = new int[numString.length()];

        for (int i = 0; i < numString.length(); i++) {
            arr[i] = Character.getNumericValue(numString.charAt(i));
        }

        return arr;
    }

    public static int arrayToInteger(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            sb.append(num);
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int num = arrayToInteger(arr);
        System.out.println("Converted integer: " + num);

        int[] convertedArr = integerToArray(num);
        System.out.println("Converted array: " + Arrays.toString(convertedArr));
    }
}
