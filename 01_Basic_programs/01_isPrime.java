// Check whether the given number is prime or not.
// The first number tells how many numbers are to be checked.
// For each number print "Prime" or "Not Prime"

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Scanner to take input
        Scanner scn = new Scanner(System.in);
        // Number of digits to be checked.
        System.out.println("Enter the number of digits to be checked.");
        int n = scn.nextInt();

        System.out.println("Enter the digits to be checked");
        // A loop that runs n times to check all the digits
        for (int i = 0; i < n; i++) {
            // The individual numbers to be checked will be stored in 'num' variable.
            int num = scn.nextInt();
            // Variable to store the number of divisors of the given number.
            int count = 0;

            // Instead of running the loop from 1 to 'num' we will run it only from 2 to
            // sqrt(num).
            // This is because the cases after sqrt(num) are repeated hence no need to
            // check.
            // We have also eliminated 1 and num from checking since every number is
            // divisible by these two.

            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    count++;
                    // Since we are only checking if the number is prime or not we will simply stop
                    // checking after first divisor is obtained.
                    break;
                }
            }
            if (count == 0)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
        }
        System.out.println("Program exited successfully");
    }
}