package Bit_Manupulation;
import java.util.Scanner;

public class oppositeSigns {

    static boolean oppositeSigns(int a, int b) {
        return ((a^b) < 0);
    }

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        if(oppositeSigns(a, b) == true) {
            System.out.println("The numbers have opposite signs");
        } else {
            System.out.println("The numbers have same signs");
        }

    }

}
