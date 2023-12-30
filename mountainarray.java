// Given an array of integers arr, return true if and only if it is a valid mountain array.

// Recall that arr is a mountain array if and only if:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

public class mountainarray {
    // public class Solution {
    public static boolean validMountainArray(int[] arr) {
        int length = arr.length;
        if (length < 3) {
            return false;
        }

        int i = 0;

        // Increasing phase
        while (i < length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak should not be the first or the last element
        if (i == 0 || i == length - 1) {
            return false;
        }

        // Decreasing phase
        while (i < length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == length - 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        boolean isValidMountain = validMountainArray(arr);
        System.out.println("Is valid mountain array? " + isValidMountain);
    }
}

// In this code, we perform the following steps:

// Check if the length of the array is less than 3. If it is, then it cannot be a valid mountain array, so we return false.

// Start from the beginning of the array and traverse until we find the peak element where the increasing sequence ends and the decreasing sequence starts.

// Check if the peak element is the first or the last element of the array. If it is, then it cannot be a valid mountain array, so we return false.

// Continue traversing the array in the decreasing phase until the end.

// Finally, check if we have reached the end of the array. If we have, then it is a valid mountain array, so we return true. Otherwise, we return false.
