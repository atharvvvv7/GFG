package Bit_Manupulation;
import java.util.Scanner;

public class equalNumbers {

    static void checkEquality(int a, int b) {
        if((a ^ b) == 0) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are not equal");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        checkEquality(a, b);
    }

}
