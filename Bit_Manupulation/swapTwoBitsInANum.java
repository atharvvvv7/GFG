package Bit_Manupulation;

import java.util.Scanner;

public class swapTwoBitsInANum {

    static int swapBits(int n, int p1, int p2) {

        int b1 = (n >> p1) & 1;
        int b2 = (n >> p2) & 1;

        int x = b1 ^ b2;
        x = (x<<p1) | (x<<p2);

        return x ^ n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the position p1");
        int p1 = sc.nextInt();
        System.out.println("Enter the position p2");
        int p2 = sc.nextInt();

        System.out.println(swapBits(n, p1, p2));
    }

}
