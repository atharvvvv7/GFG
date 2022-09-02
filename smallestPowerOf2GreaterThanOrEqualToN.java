package Bit_Manupulation;

public class smallestPowerOf2GreaterThanOrEqualToN {

    static int smallestPowOf2(int n) {
        /*    Brute Force
        int res = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                res *= 2;
            }
            if(res >= n)
                break;
        }
        return res;
         */

        // Optimized
        int res = 1;

        while(res < n) {
            res <<= 1;
        }
        return res;
    }

    public static void main(String[] args) {

        int n = 32;

        System.out.println(smallestPowOf2(n));
    }

}
