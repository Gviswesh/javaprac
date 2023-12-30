import javax.swing.JOptionPane;
import java.util.Arrays;
public class commonprefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        String[] in=new String[20];
        for(int i=0;i<n;i++)
            // String inp=
            in[i]=JOptionPane.showInputDialog(null, "Enter the string array");
        String[] ans=new String[20];
        ans[0]=longestCommonPrefix(in);
        // JOptionPane.showMessageDialog(null, "The output substring is "+ans[0]);
        System.out.println("The output of the string is "+ans[0]);
    }
}