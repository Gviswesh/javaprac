// // import java.util.Scanner;

// import javax.swing.JOptionPane;

// public class patterngeneration {
//     public static void main(String[] args) {
//         // Scanner scan=new Scanner(System.in);
//         int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
//         pattern(n);
//         // System.out.println(answer+"");

//     }
//     public static void pattern(int n){
//         for(int i=1;i<=2*n-1;i++){
//             for(int j=1;j<=2*n-1;j++){
//                 int num=Math.max(Math.abs(i-n+1), Math.abs(j-n+1))+1;
//                 System.out.println(num+"");
//                 if(j<2*n-1){
//                     System.out.println("*");
//                 }

//             }
//             System.out.println();
//         }
        
//     }
// }
import java.util.Scanner;

public class patterngeneration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        
        generatePattern(N);
    }

    public static void generatePattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i = N - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
