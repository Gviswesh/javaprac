public class palindrome {
    // public static boolean ispalindrome(int n){
    //     if(n<0)
    //         return false;
        
    // }
    public static void main(String[] args) {
        int n=Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "Enter the number"));
        if(n<0)
            System.out.println("It is a negative number");
        long reversed = 0;
        long temp = n;

        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if(reversed==n)
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
    }
}
