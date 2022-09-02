package Bit_Manupulation;

public class OddEvenParity {

    static void parity(int n) {
        int count = 0;

        while(n != 0) {
            n = n & (n-1);
            count++;
        }
        if(count %2 == 0) {
            System.out.println("Even parity");
        } else {
            System.out.println("Odd parity");
        }
    }

    public static void main(String[] args) {
        int n = 7;

        parity(n);
    }

}
