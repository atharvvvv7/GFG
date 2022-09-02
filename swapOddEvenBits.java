package Bit_Manupulation;

public class swapOddEvenBits {

    public static void main(String[] args) {

//        int mask = 0;
//        int n = 23;
//
//        for(int i = 0; i < 32; i++) {
//            if(i %2 == 0) {
//                mask = 1 << i;
//            }
//        }
//        n &= mask;
//        System.out.println(n);

        // Format for writing hexadecimal numbers --> O*______

        int n = 23;

        int oddMask = 0x55555555;
        int evenMask = 0xAAAAAAAA;

        int oddBits = n & oddMask;
        int evenBits = n & evenMask;

        oddBits<<=1;
        evenBits>>=1;

        int result = oddBits | evenBits;
        System.out.println(result);

    }
}
