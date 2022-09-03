package Bit_Manupulation;

import java.util.Scanner;

public class numIsSparseOrNot {

    static void SparseNumber(int n) {

        int sparse = n & (n>>1);

        if(sparse == 0) {
            System.out.println(n + " is sparse");
        } else {
            System.out.println(n + " is not sparse");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        SparseNumber(n);
    }

}
