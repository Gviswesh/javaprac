import java.util.Scanner;

public class reverse_array{
    static void print(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
    static void reverse(int arr[],int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("The elements after reversing\n");
        print(arr);
    }
    public static void main(String[] args) {
        int n=Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "Enter the number of elements"));
        int arr[]=new int[n];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the elements\n");
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        System.out.println("The elements of the array: \n");
        print(arr);
        reverse(arr,0,n-1);

    }
}
