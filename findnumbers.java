// This program is to find how many integers are present in an array with even number of digits
import java.util.Scanner;
import javax.swing.*;
public class findnumbers {
    public static int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        // int[] arr=new int[30];
        for(int i=0;i<n;i++){
            int digits=0;
            while(nums[i]!=0){
                nums[i]/=10;
                digits++;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[30];
        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of elements"));
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        int count=findNumbers(arr);
        JOptionPane.showMessageDialog(null,"Number of numbers having even no of digits is "+count);
    }
}
