package Bit_Manupulation;
import java.util.Scanner;

public class nthMagicNumber {

    /*
    Magic number --> power of 5 or sum of unique powers of 5
    ex: 5, 25, 30(25+5), 125, 130(125+5), 150(125+25)
    binary : 101, 11001, 11110, 1111101, 10000010, 10010110
        321
    1 - 001 - pow(5, 1)
    2 - 010 - pow(5, 2)
    3 - 011 - pow(5, 1) + pow(5, 2)
    4 - 100 - pow(5, 3)
    5 - 101 - pow(5, 1) + pow(5, 3)
     */

    static int magicNumber(int n) {

        int pow = 1;
        int result = 0;

        while(n != 0) {
            pow *= 5;
            if((n &1) == 1) {
                result += pow;
            }
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println(n + "th magic number is " + magicNumber(n));
    }

}
