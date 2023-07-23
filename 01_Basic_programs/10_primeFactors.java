// Given a number write down all the prime factors product of which comes out to be the number itself.
// For ex: num = 12, print : 2 2 3

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scn.nextInt();
        System.out.println("Prime factors of given number are");

        for (int div = 2; div * div <= num; div++) {
            while (num % div == 0) {
                num = num / div;
                System.out.println(div);
            }
        }
        if (num != 1) {
            System.out.println(num);
        }
    }
}