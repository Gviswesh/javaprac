import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class leadersofarray {
    public static void main(String[] args) {
        List<Integer> leaders = new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of elements"));
        int[] arr=new int[n+1];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        int currentMax=arr[n-1];
        leaders.add(currentMax);
        for(int i=n-2;i>=0;i--){
            if (arr[i] > currentMax) {
                currentMax = arr[i];
                leaders.add(currentMax);
            }
        }
    System.out.println("Leaders in the array:");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}
