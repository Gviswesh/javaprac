import java.util.PriorityQueue;
import java.util.Scanner;

public class cookies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] cookies = new int[n];
        for (int i = 0; i < n; i++) {
            cookies[i] = scan.nextInt();
        }

        int result = minimumOperations(cookies, k);
        System.out.println(result);

        // scan.close();
    }

    public static int minimumOperations(int[] cookies, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int cookie : cookies) {
            pq.offer(cookie);
        }

        int operations = 0;

        while (pq.peek() < k) {
            if (pq.size() < 2) {
                return -1; // Not enough cookies to create a combined cookie
            }

            int leastSweet = pq.poll();
            int secondLeastSweet = pq.poll();

            int combinedSweetness = leastSweet + 2 * secondLeastSweet;
            pq.offer(combinedSweetness);
            operations++;
        }

        return operations;
    }
}
