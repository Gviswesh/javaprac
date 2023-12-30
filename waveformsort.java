import java.util.Scanner;
import javax.swing.JOptionPane;

public class waveformsort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int[] arr = new int[20];
        int temp;
        for (int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array after regular sorting");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + "");
        int temp1;
        for (int i = 0; i < n; i += 2) {
            if (i + 1 < n) {
                temp1 = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp1;
            }
        }
        System.out.println("Array after waveform sorting");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + "");
    }
}
