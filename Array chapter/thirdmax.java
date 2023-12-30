// package Array chapter;
import javax.swing.JOptionPane;
public class thirdmax {
    public static int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for (Integer num : nums) {
            if (num.equals(max1) || num.equals(max2) || num.equals(max3)) {
                continue; // Skip duplicates
            }

            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max3 == null || num > max3) {
                max3 = num;
            }
        }

        return (max3 == null) ? max1 : max3;
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the elements"));
        int k=thirdMax(arr);
        // System.out.println("Array after sorting");
        // for(int i=0;i<n;i++)
        //     System.out.println(arr[i]+"");
        System.out.println("The distinct maximum number is "+k);
    }
}
