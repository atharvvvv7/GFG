package Bit_Manupulation;

public class swapTwoNumbers {

    static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swapping " + a + " " + b);
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 25;

        System.out.println("Before Swapping " + a + " " + b);
        swap(a, b);
    }

}
