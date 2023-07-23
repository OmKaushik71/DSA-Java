// Given a number, print the digits of the number in reverse order.
// For ex: num : 1234 print 4321.

// Solution
// We can solve this by dividing the number such that the last digit comes as remainder and print it immediately.
// For example: num = 234;
// Divide 234 by 10 we get 23 as quotient and 4 as remainder.
// Print 4 and update the number as its quotient.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();

        while (num != 0) {
            int r = num % 10;
            System.out.println(r);
            num = num / 10;
        }
    }
}