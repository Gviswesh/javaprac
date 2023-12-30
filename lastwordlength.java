import javax.swing.*;
public class lastwordlength {
    public static int lengthOfLastWord(String s) {
        String trimmed=s.trim();
        int lasttrim=trimmed.lastIndexOf(' ');
        String lastword=trimmed.substring(lasttrim+1);
        return lastword.length();
    }
    public static void main(String[]args){
        String word=JOptionPane.showInputDialog(null, "Enter the entire string");
        int length=lengthOfLastWord(word);
        System.out.println("The length of the last word is "+length);
    }
}