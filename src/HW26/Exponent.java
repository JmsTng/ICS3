/*
 * TITLE: Homework Set 26 - Exponent
 * NAME: James Tung
 * DATE: 11/13/2023
 * DESCRIPTION: Print the result of a base number to the power of an exponent.
 */

package HW26;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int base;
        int exponent;

        // Read input
        System.out.print("Enter the base number: ");
        base = sc.nextInt();
        System.out.print("Enter an exponent: ");
        exponent = sc.nextInt();

        // Print result
        System.out.println(base + " to the power of " + exponent + " is " + Math.pow(base, exponent) + ".");
    }
}
