import java.util.*;

public class frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read the number of elements in the array
        int n = scan.nextInt();
        
        // Read the array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        
        // Read the n value
        int targetFrequency = scan.nextInt();
        
        // Calculate the frequency of each element in the array
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Filter out elements with frequency >= n
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            if (freq >= targetFrequency) {
                result.add(num);
            }
        }
        
        // Sort the result based on frequency and numerical value
        Collections.sort(result, (a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA != freqB) {
                return freqB - freqA; // Sort by decreasing frequency
            } else {
                return b - a; // If frequency is the same, sort by decreasing numerical value
            }
        });
        
        // Print the result
        if (result.isEmpty()) {
            System.out.println("invalid");
        } else {
            for (int num : result) {
                System.out.print(num + " ");
            }
        }
    }
}
