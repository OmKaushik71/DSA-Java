// Given a number, find its highest common factor and lowest common multiple.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = scn.nextInt();
        System.out.println("Enter second number");
        int n2 = scn.nextInt();

        int product = n1 * n2;

        while (n1 % n2 != 0) {
            int r = n1 % n2;
            n1 = n2;
            n2 = r;
        }

        int hcf = n2;
        int lcm = product / hcf;
        System.out.println("HCF : " + hcf);
        System.out.println("LCM : " + lcm);
    }
}