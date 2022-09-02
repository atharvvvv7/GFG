package Bit_Manupulation;

import java.util.Scanner;

public class multiplyANumBy3point5 {

    static int multiply(int n) {

        // Given an integer x, write a function that multiplies x with 3.5 and returns the integer result.
        // You are not allowed to use %, /, *.

        // Approach: 2x + x + x/2  Multiply the number with 2 by left shift and divide the number with 2 >>
        //           x<<1 + x + x>>1

        int result = (n<<1) + (n) + (n>>1);

        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        System.out.println(n + "*3.5 = " + multiply(n));

    }

}
