import javax.swing.JOptionPane;

public class plusone {
    public static int[] plusOne(int[] digits,int n) {
        // int n = digits.length;
        
        // Add 1 to the last digit and handle carry-over if needed
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1; // No carry-over, so increment and return
                return digits;
            } else {
                digits[i] = 0; // Set the current digit to 0 and propagate carry-over
            }
        }
        
        // If there is still a carry-over after the loop, create a new array with an additional digit
        int[] result = new int[n + 1];
        result[0] = 1; // The first digit will be 1
        return result;
    }
    //     int num=arrayToInteger(digits);
    //     num+=1;
    //     return (integerToArray(num));
    // }
    // public static int arrayToInteger(int[] arr) {
    //     StringBuilder sb = new StringBuilder();

    //     for (int num : arr) {
    //         sb.append(num);
    //     }

    //     return Integer.parseInt(sb.toString());
    // }
    // public static int[] integerToArray(int num) {
    //     String numString = Integer.toString(num);
    //     int[] arr = new int[numString.length()];

    //     for (int i = 0; i < numString.length(); i++) {
    //         arr[i] = Character.getNumericValue(numString.charAt(i));
    //     }

    //     return arr;
    // }
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int[] arr =new int[n+1];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the element"));
        int[] ans=new int[n+2];
        ans=plusOne(arr,n);
        System.out.println("The array after calculation is ");
        for(int i=0;i<n;i++)
            System.out.println(ans[i]+"");
        
    }
}