import javax.swing.JOptionPane;
public class squaresortedarray {
    public static int[] sortedSquares(int[] nums){
        int n=nums.length;
        System.out.println("The original array is");
        print(nums);
        for(int i=0;i<n;i++)
            nums[i]=nums[i]*nums[i];
        System.out.println("Array after squaring");
        print(nums);
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }
        }
        return nums;
    }
    public static void print(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++)
            System.out.println(arr[i]+"");
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the elements"));
        }
        int[] result=sortedSquares(arr);
        System.out.println("The sorted square array is ");
        print(result);
    }
}
