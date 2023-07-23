// Given a number, find inverse of the number defined as follow:
// The given number of digit 'n' will always contain number from 1 to n in a non repeating manner.
// No digits will be skipped.
// For example : 1324, 613452, 21 etc are valid inputs.
// Inverse of a number is calculated by noting the position of each digit and reversing the position with digits.
// For example, num = 4132, from left to right, here as 1st position we have 2, at 2nd position we have 3 and so on.
// The reverse of this number will be obtained by putting 1 at 2nd position, 2 at 3rd position and so on.
// Hence the inverse obtained is : 4213.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();

        int inverseNum = 0;
        int multiplier = 1;
        int running = 1;
        while (running == 1) {
            int r = num % 10;
            int newDigit = multiplier * (int) Math.pow(10, r - 1);
            inverseNum = inverseNum + newDigit;
            num = num / 10;
            if (num == 0)
                running = 0;
            multiplier++;
        }
        System.out.println(inverseNum);
    }
}