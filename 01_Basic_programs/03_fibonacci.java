// Given a number n, print n digits of fibonacci series.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of digits to print.");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("The fibonacci series is as follows:");
        // We'll use three variable, the first two stores the starting two digits of fib
        // series and third one store the sum of first two.
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            // Print the first fib digit.
            System.out.println(a);
            // Calculate the third fib digit.
            int c = a + b;
            // Update the current fib digit for next iteration.
            a = b;
            // Update the second fib for next iteration.
            b = c;
        }

    }
}