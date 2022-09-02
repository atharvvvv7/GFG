package Bit_Manupulation;
import java.util.Scanner;

public class turnOffKthBit {

    static int turnOffBit(int n, int k) {
        int mask = ~(1 << (k-1));

        return n & mask;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the bit that is to be turned off (starting with 0)");
        int k = sc.nextInt();

        System.out.println("The number after turning off " + k + "th bit is " +
                turnOffBit(n, k));

    }
}
