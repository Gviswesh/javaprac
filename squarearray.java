// This program is to find the square of an array and print the sorted array after finding the square
import javax.swing.*;
import java.util.Scanner;
public class squarearray {
    public static int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the element"));
        System.out.println("The array given is");
        for(int num:arr)
            System.out.println(num+"");

        arr=sortedSquares(arr);
        System.out.println("The solution for this array");
        for(int num:arr)
            System.out.println(num+"");
    }
}

