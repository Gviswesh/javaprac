// package Array chapter;
import javax.swing.JOptionPane;
public class movezero {
    public static void moveit(int[] nums, int n){
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        while(k<n){
            nums[k]=0;
            k++;
        }
        System.out.println("Array after sorting");
        for(int i=0;i<n;i++)
            System.out.println(nums[i]+"");
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the elements"));
        moveit(arr,n);
        
    }
}
