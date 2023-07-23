// Given a number, print out the digits of that number.
// For ex, Input : 34534
// Output :
// 3
// 4
// 5
// 3
// 4

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();

        // First of all we will count the number of digits and store it in 'nod'.

        int nod = 0;
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            nod++;
        }

        // Now we will divide the given number such that the first digit is obtained,
        // which will be printed immediately, and after that the number will be assigned
        // to the remainder.
        // For ex: num = 234
        // divide 234 by 100 we get '2' as quotient and 34 as remainder.
        // Print '2' and assign the remainder as the new number i.e. '34';
        // Now do this until the num becomes 0.
        int div = (int) Math.pow(10, nod - 1);
        while (num != 0) {
            int q = num / div;
            System.out.println(q);
            num = num % div;
            div = div / 10;
        }
    }
}