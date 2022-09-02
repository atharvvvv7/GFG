package Bit_Manupulation;

//  Write a program to add one to a given number.
//  The use of operators like ‘+’, ‘-‘, ‘*’, ‘/’, ‘++’, ‘–‘ …etc are not allowed.

public class addOneToGivenNum {

    static int addOne(int n) {

//        int result = n | 1;
//        return result;

        return (-(~n));
    }

    public static void main(String[] args) {

        int n = 12;

        System.out.println(addOne(n));
    }

}
