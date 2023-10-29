/*
 * TITLE: Homework Set 18 - Power
 * NAME: James Tung
 * DATE: 10/29/2023
 * DESCRIPTION: Calculate the power of a number.
 */

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        double base;
        int exponent;
        double result = 1;

        // Read input
        System.out.print("Enter the base: ");
        base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        exponent = sc.nextInt();

        if (exponent < 0) {
            System.out.println("Exponent must be non-negative.");
            return;
        }

        // Calculate result
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        // Print result
        System.out.println(base + " to the power of " + exponent + " is " + result + ".");
    }
}
