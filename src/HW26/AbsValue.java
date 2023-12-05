/*
 * TITLE: Homework Set 26 - AbsValue
 * NAME: James Tung
 * DATE: 11/13/2023
 * DESCRIPTION: Print the absolute value of a number.
 */

package HW26;

import java.util.Scanner;

public class AbsValue {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        double n;

        // Read input
        System.out.print("Enter a number: ");
        n = sc.nextDouble();

        // Print result
        System.out.println("The absolute value of " + n + " is " + Math.abs(n) + ".");
    }
}
