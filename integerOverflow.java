package Bit_Manupulation;

public class integerOverflow {

    static int checkOverflow(int result,int a, int b) {
        result = a + b;

        if(a > 0 && b > 0 && result < 0) {
            return -1;
        }
        if(a < 0 && b < 0 && result > 0) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {

        int result = -2147483646;
        int a = 2147483640;
        int b = 100;

        System.out.println(checkOverflow(result, a, b));
        System.out.println(result);
    }
}
