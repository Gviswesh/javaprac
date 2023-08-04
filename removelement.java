import java.util.Scanner;
import javax.swing.*;
public class removelement{
    public static int removeElement(int[] nums, int val) {
        int n=nums.length;
        int temp=0;
        for(int i=0;i<n;i++){
            if(nums[i]==val){
                for(int j=i+1;j<n;j++){
                    temp=nums[i];
                    nums[i]=nums[j];
                    n--;
                }
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int val=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the value of element"));
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the element"));
        int k=removeElement(arr, val);
        System.out.println("The answer for the array is "+k);
    }
}