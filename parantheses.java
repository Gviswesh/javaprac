import java.util.*;
import javax.swing.*;
public class parantheses {
    public static boolean isparantheses(String s){
        Stack<Character> stack = new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{')
                stack.push(c);
            else{
                if(c==')' && stack.peek()=='(')
                    stack.pop();
                else if(c==']' && stack.peek()=='[')
                    stack.pop();
                else if(c=='}' && stack.peek()=='{')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.empty();   
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a=JOptionPane.showInputDialog(null, "Enter the character");
        boolean b=isparantheses(a);
        
    }
}
