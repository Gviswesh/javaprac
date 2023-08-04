import javax.swing.*;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number ");
        a = scan.nextInt();
        System.out.println("The entered number is " + a);

    }
}