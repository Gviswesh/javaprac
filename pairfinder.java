public class pairfinder {
    public static int[] findPairClosestToTarget(int[] arr, int target) {
        int left = 0; // pointer starting from the beginning of the array
        int right = arr.length - 1; // pointer starting from the end of the array
        int closestSum = Integer.MAX_VALUE;
        int[] closestPair = new int[2];

        while (left < right) {
            int sum = arr[left] + arr[right];

            // Check if the current pair has a sum closer to the target
            if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                closestSum = sum;
                closestPair[0] = arr[left];
                closestPair[1] = arr[right];
            }

            // Move the pointers based on the sum
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return closestPair;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 10};
        int target = 12;
        int[] closestPair = findPairClosestToTarget(arr, target);
        System.out.println("Pair with the sum closest to " + target + ": " + closestPair[0] + ", " + closestPair[1]);
    }
}
