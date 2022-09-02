package Bit_Manupulation;

public class rotateNumOfBits {

    static final int INT_BITS = 32;

    static int rotate_left(int n, int d) {
        /* n << d - last d bits becomes 0
           n >> (INT_BITS-d) - puts first d bits of n at last then bitwise or them to get result
         */
        return (n << d) | (n >> (INT_BITS - d));

    }

    static int rotate_right(int n, int d) {
        /* n >> d - first d bits becomes 0
           n << (INT_BITS-d) - puts last d bits of n at first then bitwise or them to get result
         */
        return (n >> d) | (n << (INT_BITS-d));

    }

    public static void main(String[] args) {
        int n = 16;
        int d = 2;

        System.out.println("Rotate left  " + rotate_left(n, d));
        System.out.println("Rotate right " + rotate_right(n, d));
    }

}
