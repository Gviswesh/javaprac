// This problem is Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
import javax.swing.*;
import java.util.Scanner;
public class zeroindex {
    public static void main(String[] args) {
        int zerocount=0;
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the element"));
        System.out.println("The original array is");
        for(int num:arr){
            System.out.println(num+"");
            // zerocount++;
        }
        for(int i=0;i<n;i++)
            if(arr[i]==0)
                zerocount++;
        int index=n-1;
        int zeroindex=n+zerocount-1;
        while(index>=0 && zeroindex>=0){
            if(arr[index]==0){
                if(zeroindex<n){
                    arr[zeroindex]=0;
                }
                zeroindex--;
            }
            if(zeroindex<n)
                arr[zeroindex]=arr[index];
                index--;
                zeroindex--;
        }
        System.out.println("The changed array is");
        for(int num:arr)
            System.out.println(num+"");

    }
}
