// Given a number and a rotation digit, output the rotated number.
// For ex: 
// 1. num = 12345 and k = 2 => output : 45123.
// 2. num = 12345 and k = 4 => output: 23451.
// 3. num = 12345 and k = 5 => output: 12345.
// 4. num = 12345 and k = 6 => output: 51234 (equivalent to k=1).
// 5. num = 12345 and k = -2 => output: 34512 (equivalent to k = 3).
// 6. num = 12345 and k = -3 => output: 45123 (equivalent to k = 2).

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number to be rotated");
        int num = scn.nextInt();
        System.out.println("Enter the rotation digit");
        int k = scn.nextInt();

        // First we have to find out the number of digits.
        int nod = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }
        // If k is greater than the number of digits then we repeat the cycle.
        // For ex: if num = 1234 and k = 5 then it is equivalent to k = 1
        k = k % nod;

        // If k is a negative number then say k = -1 then it is equivalent to k = 4.
        if (k < 0)
            k = k + nod;

        // Now we have to divide the number with a suitable divisor such that the
        // remainder is of k digits.
        int divisor = (int) Math.pow(10, k);
        // Also we need a multiplier to shift the remainder to starting positions.
        int multiplier = (int) Math.pow(10, nod - k);

        // Now we divide the number with divisor , multiply the remainder with
        // multiplier and add the quotient to obtain the required number.
        // For example: num = 1234 and k = 2;
        // here nod = 4 => divisor = 100 and multiplier = 100;
        // Divide 1234 by 100 we get quotient as 12 and remainder as 34.
        // Multiply the remainder with multiplier we get 3400 and add the quotient we
        // get 3412.

        int r = num % divisor;
        int q = num / divisor;

        int rotatedNum = r * multiplier + q;
        System.out.println("Rotated number");
        System.out.println(rotatedNum);
    }
}