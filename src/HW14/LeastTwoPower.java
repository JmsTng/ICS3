/*
 * TITLE: Homework Set 14 - Least Power of Two
 * NAME: James Tung
 * DATE: 10/23/2023
 * DESCRIPTION: Read a positive integer from the user and print the least power of two that is greater than or equal to the user's input.
 */

package HW14;

import java.util.Scanner;

public class LeastTwoPower {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int result = 0;
        int power = 1;

        // Prompt user for input
        while (input <= 0) {
            System.out.print("Enter a positive integer: ");
            input = sc.nextInt();
        }

        // Calculate power
        while (power < input/2.0 && result < input) {
            power++;
            result = (int) Math.pow(2, power);
        }

        // Print result
        System.out.printf("The least power of two that is greater than or equal to %d is %d (%s).", input, result, "2^" + power);
    }
}
