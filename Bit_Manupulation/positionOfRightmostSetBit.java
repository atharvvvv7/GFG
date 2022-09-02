package Bit_Manupulation;

import java.util.Scanner;

public class positionOfRightmostSetBit {

    static int rightmostSetBit(int n) {

        // Time complexity : O(n)

        int count = 1;
        while(n != 1) {
            if((n &1) == 0) {
                count++;
            }
            n>>=1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println("The position of rightmost set bit in " + n + " is " +
                rightmostSetBit(n));
    }

}
