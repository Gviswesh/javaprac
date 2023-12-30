// package Array chapter;

import javax.swing.JOptionPane;

public class removeelement {
    public int removeElement(int[] nums, int n,int val) {
        // int n = nums.length;
        int k = 0; // Initialize k as 0 instead of 1
        int count = 0;
    
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
    
        // Handle the case where array length is 0
    //     if (n == 0) {
    //         return 0;
    //     }
    
    //     while (k < n) {
    //         nums[k] = val;
    //         k++;
    //     }
    
    //     int i = 0;
    //     while (nums[i] != val) {
    //         count++;
    //         i++;
    //     }
    
        return k;
    }
    // public static int[] bubblesort(int[] nums,int n){
    //     int temp;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(nums[i]<nums[j]){
    //                 temp=nums[i];
    //                 nums[i]=nums[j];
    //                 nums[j]=temp;
    //             }
    //         }
    //     }
    //     return nums;
    // }
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int val=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the value that needs to be removed"));
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the elements"));
        int k=removeelement(arr,n,val);
        // arr=bubblesort(arr, n);
        System.out.println("Array after sorting");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]+"");
        System.out.println("The non repeated elements are "+k);
    }


}
