// This program is to find the maximum number of consecutive 1's in a binary array
public class consecutiveones {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0; // variable to store the maximum consecutive 1's count
        int currentCount = 0; // variable to store the current consecutive 1's count

        for (int num : nums) {
            if (num == 1) {
                currentCount++; // increment the current count if the current number is 1
            } else {
                maxCount = Math.max(maxCount, currentCount); // update the max count if necessary
                currentCount = 0; // reset the current count if the current number is 0
            }
        }

        // handle the case where the maximum count is at the end of the array
        maxCount = Math.max(maxCount, currentCount);

        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1's count: " + maxConsecutiveOnes);
    }
}

