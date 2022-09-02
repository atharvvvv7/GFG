package Bit_Manupulation;
import java.util.Scanner;

public class XORWithoutUsingXOR {

    static int XOR(int a, int b) {

        return (a | b) & (~a | ~b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        System.out.println(a + " ^ " + b + " = " + XOR(a, b));
    }

}
