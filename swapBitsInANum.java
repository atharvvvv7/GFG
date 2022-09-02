package Bit_Manupulation;
import java.util.Scanner;
public class swapBitsInANum {

    static int swapBits(int x, int p1, int p2, int n) {

        int set1 = (x >> p1) & ((1<<n)-1);
        int set2 = (x >> p2) & ((1<<n)-1);

        int xor = set1 ^ set2;

//        set1 = xor << p1;
//        set2 = xor << p2;
        xor = (xor << p1) | (xor << p2);

//        return x ^ set1 ^ set2;
        return x ^ xor;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(swapBits(x, p1, p2, n));
    }

}
