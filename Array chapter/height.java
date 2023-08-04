import javax.swing.JOptionPane;
public class height {
    public static int heightChecker(int[] heights) {
        int count = 0,temp;
        int n=heights.length;
        // System.out.println("Elements of height[]");
        // print(heights,n); 
        // int m=n+1;
        int[] expected=new int[n];
        for(int i=0;i<n;i++)
            expected[i]=heights[i];
        // System.out.println("Elements of expected[]");
        // print(expected,n);
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(expected[j]>expected[j+1]){
                    temp=expected[j];
                    expected[j]=expected[j+1];
                    expected[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        
        
        return count;
    }
    public static void print(int[] arr,int n){
        for(int i=0;i<n;i++)
            System.out.println(arr[i]+"");
    }
    // }
    
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the elements"));
        System.out.println("Elements of the original array");
        print(arr,n);
        int result=heightChecker(arr);
        JOptionPane.showMessageDialog(null, "The difference in position is "+result);
    }
}
