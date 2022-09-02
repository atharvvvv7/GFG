package Bit_Manupulation;

import java.util.Scanner;

public class powerOf4 {

    static int power(int n) {
        int x = n & (n-1);
        int count = 0;

        if(n>0 && x==0) {
            while(n > 1) {
                n >>= 1;
                count++;
            }
            return (count %2 == 0)? 1 : 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        if(power(n) > 0) {
            System.out.println(n + " is a power of 4");
        } else {
            System.out.println(n + " is not a power of 4");
        }

    }

}
