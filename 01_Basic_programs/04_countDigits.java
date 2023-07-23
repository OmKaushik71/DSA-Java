// Given a number, count how many digits are there in the given number.
// Input : 23423, Output : 5

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        scn.close();
        // We keep dividing the given number with 10 until the quotient becomes zero.

        int digits = 0;
        while (n != 0) {
            n = n / 10;
            digits++;
        }
        System.out.println("The given number is of " + digits + " digits.");
    }
}