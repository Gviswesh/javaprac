import java.util.Scanner;

public class maxbeadchain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of beads: ");
        int n = scanner.nextInt();
        
        int[] beads = new int[n];
        System.out.println("Enter the values of beads:");
        for (int i = 0; i < n; i++) {
            beads[i] = scanner.nextInt();
        }

        int maxSum = maxBeadChainSum(beads);
        System.out.println("Maximum chain sum: " + maxSum);
    }

    public static int maxBeadChainSum(int[] beads) {
        int currentSum = beads[0];
        int maxSum = beads[0];

        for (int i = 1; i < beads.length; i++) {
            currentSum = Math.max(beads[i], currentSum + beads[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
