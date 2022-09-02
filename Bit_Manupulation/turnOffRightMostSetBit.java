package Bit_Manupulation;

import java.util.Scanner;

public class turnOffRightMostSetBit {

    static int turnOffBit(int n) {

        // Brute force

        // Optimised approach : n & (n-1)
        int result = n & (n-1);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        System.out.println("Result after turning off right most set bit = " + turnOffBit(n));
    }

}
