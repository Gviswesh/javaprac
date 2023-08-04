import java.util.*;
public class array1{
    static void remove_even(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0)
                arr[i].remove;  
        }
        System.out.println("The elements of the array are: \n");
        for(int j=0;j<n;j++)
            System.out.println(arr[j]);    
    }
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null,"Enter the number of elements: "));
        System.out.println("Enter the elements\n");
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        System.out.println("The elements of the array before removal are: \n");
        for(int j=0;j<n;j++)
            System.out.println(arr[j]);
        remove_even(arr);
    }
}