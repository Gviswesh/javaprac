import javax.swing.JOptionPane;

public class selectionsort {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the element"));

        System.out.println("The array before sorting");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + "");

        arr = sort(arr, n);

        System.out.println("The array after sorting");
        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + "");
            // JOptionPane.showMessageDialog(null, ""+arr);
    }

    public static int[] sort(int[] x, int n) {
        int large, index;

        for (int i = n - 1; i > 0; i--) {
            large = x[0];
            index = 0;

            for (int j = 1; j <= i; j++) {
                if (x[j] > large) {
                    large = x[j];
                    index = j;
                }
            }

            x[index] = x[i];
            x[i] = large;
        }

        return x;
    }
}
