import javax.swing.*;
public class mergesortedarray {
    // class Solution {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int o=m+n;
            //int i=0;
            int[] nums=new int[o];
            for(int i=0;i<m;i++)
            nums[i]=nums1[i];
            for(int i=0;i<n;i++)
            nums[m+i]=nums2[i];
            int temp=0;
            for(int i=0;i<o;i++){
                for(int j=i+1;j<o;j++){
                    if(nums[i]>nums[j]){
                        temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
                }
            }
            for(int i=0;i<o;i++)
            System.out.println(nums[i]+"");
            
        }
    // }
    public static void main(String[] args) {
        int m=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements of array 1"));
        int[] nums1=new int[m];
        for(int i=0;i<m;i++)
            nums1[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the elements of array 1"));
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements of array 2"));
        int[] nums2=new int[n];
        for(int i=0;i<n;i++)
            nums2[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the elements of array 2"));
        merge(nums1,m,nums2,n);
    }
}
//Alternate method is to sort the arrays while merging arrays dynamically 
