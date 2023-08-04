import javax.swing.JOptionPane;

public class uniqueelements {
    public static int unique(int[] nums,int n){
        if (n== 0) {
            return 0;
        }

        int k = 1; // Index for the first unique element

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the elements"));
        int k=unique(arr,n);
        System.out.println("Array after sorting");
        for(int i=0;i<n;i++)
            System.out.println(arr[i]+"");
    }
}
