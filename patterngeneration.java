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
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        generatePattern(n);
    }

    public static void generatePattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int num = Math.max(Math.abs(i - n + 1), Math.abs(j - n + 1)) + 1;
                System.out.print(num);
                if (j < 2 * n - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
