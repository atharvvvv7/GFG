package Bit_Manupulation;

import java.util.Scanner;

public class powerOf2 {

    static void powerOf2(int n) {

        // Time complexity O(n)
//        int count = 0;
//        while(n != 0) {
//            n = n & (n-1);
//            count++;
//        }

        // Optimised solution : Time complexity O(1)
        if( n > 0) {
            n &= (n - 1);
        }

            if (n == 0) {
                System.out.println("The number is power of 2");
            } else {
                System.out.println("The number is not a power of 2");
            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        powerOf2(n);
    }

}
