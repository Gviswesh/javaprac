import java.util.Scanner;
import javax.swing.*;
public class searchindex {
    public static int searchInsert(int[] nums, int target,int n) {
        // int n = nums.length;

        // Sort the array
        for (int k = 0; k < n; k++) {
            for (int j = k + 1; j < n; j++) {
                if (nums[k] > nums[j]) {
                    int temp = nums[k];
                    nums[k] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        // Search for the target
        for (int i = 0; i < n; i++) {
            if (target == nums[i]) {
                return i;
            }
            if (target < nums[i]) {
                return i;
            }
        }

        // If the target is greater than all elements, insert at the end
        return n;
    }
    public static void main(String[]args) {
        int[] arr=new int[10];
        // String words=JOptionPane.showInputDialog(null,"Enter the  word");
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of elements "));
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        System.out.println("Enter the target integer ");
        int target=scan.nextInt();
        int length=searchInsert(arr,target,n);
        System.out.println("The index of the target is "+length);
    }
}
