// package Array chapter;
import javax.swing.JOptionPane;
public class paritysort {
    public static int[] sortArrayByParity(int[] nums,int n) {
        // int n=nums.length;
        int k=0,temp;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                k++;
            }
            // else{
                
            // }
        }
        return nums;
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the elements"));
        arr=sortArrayByParity(arr,n);
        System.out.println("Array after sorting");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]+"");   
    }
}
