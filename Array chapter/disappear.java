import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

public class disappear {
    
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the elements"));
        List<Integer> result=new ArrayList<>();
        result=findDisappear(arr);
        System.out.println("The resultant array is ");
        print(result);

    }
    public static void print(List<Integer> arr){
        for(Integer i:arr)
            System.out.println(i+"");
    }
    public static List<Integer> findDisappear(int[] nums){
        List<Integer> result = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();

        // Add all elements of nums to the set
        for (int num : nums) {
            numSet.add(num);
        }

        int n = nums.length;
        // Check for missing numbers in the range [1, n]
        for (int i = 1; i <= n; i++) {
            if (!numSet.contains(i)) {
                result.add(i);
            }
        }

        return result;
        
    }

    
}
