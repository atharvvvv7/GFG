package Bit_Manupulation;

import java.util.Scanner;

public class multiplyBy7 {

    static int multiply(int n) {
        /*
        n << 3 - multiplies the number 2 power 3 times i.e 8 : 8n-n = 7n
         */
        return (n << 3) - n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        System.out.println(n + " * 7 = " + multiply(n));
    }

}
