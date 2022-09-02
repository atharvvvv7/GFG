package Bit_Manupulation;
import java.util.Scanner;

public class russianPeasant_MultiplyTwoNum {

    static int multiplyTwoNumbers(int a, int b) {
        /* Russian peasant algorithm
        Two num a & b double a and halve b
        if b = odd b + res (res = 0)
         */
        int res = 0;
        while(b > 0) {

            if((b & 1) != 0) {
                res = res + a;
            }
            a <<= 1;
            b >>= 1;

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of first number");
        int a = sc.nextInt();
        System.out.println("Enter the value of second number");
        int b = sc.nextInt();

        System.out.println(a + " * " + b + " = " + multiplyTwoNumbers(a, b));
    }

}
