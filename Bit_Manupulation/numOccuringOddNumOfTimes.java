package Bit_Manupulation;

public class numOccuringOddNumOfTimes {

    static int oddNumOfTimes(int arr[]) {
        /*
        n ^ n = 0  and  n ^ 0 = n
        xor all the elements of the array the elements that occur even number of times will
        be cancelled out and the number that occurs odd number of times is printed.
        Time complexity : O(n)    Space complexity : O(1)
         */

        int result = 0;

        for(int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 3, 1, 3, 3, 7, 7, 7};

        System.out.println(oddNumOfTimes(arr) + " occurs odd number of times");
    }

}
