package Bit_Manupulation;

public class countSetBits {

    static int countSetBits(int n) {
        int count = 0;

        while(n != 0) {
            n &= (n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 123;

        System.out.println("Number of set bits in " + n + " are " + countSetBits(n));
    }

}
