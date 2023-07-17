
// Given an upper range and a lower range, print all prime numbers between this range.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter lower limit");
        int l = scn.nextInt();
        System.out.println("Enter upper limit");
        int h = scn.nextInt();
        System.out.println("All prime numbers between the given range are:");

        // Loop to iterate over every number between the given range.
        for (int i = l; i <= h; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {

                if (i % j == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0)
                System.out.println(i);
        }

    }
}