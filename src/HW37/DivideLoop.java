/*
 * TITLE: Homework Set 37 - DivideLoop
 * NAME: James Tung
 * DATE: 12/9/2023
 * DESCRIPTION: Read two integers from the console and divide them. Repeat until user quits by setting numerator to a string starting with "q" or "Q".
 */

package HW37;

import java.util.*;

public class DivideLoop {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        String input;
        double numerator;
        double denominator;
        boolean quit = false;

        // Collect input
        while (!quit) {
            // Receive numerator
            System.out.print("Enter numerator: ");
            input = sc.nextLine();
            try {
                numerator = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                if (input.startsWith("q") || input.startsWith("Q")) { // Check for quit
                    quit = true;
                } else {
                    System.out.println("Invalid input. Expecting integer.");
                }
                continue;
            }

            // Receive denominator
            System.out.print("Enter denominator: ");
            try {
                denominator = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Expecting integer.");
                continue;
            }

            // Check for division by zero
            if (denominator == 0) {
                System.out.println("Cannot divide by zero.");
                continue;
            }
            sc.nextLine(); // Clear buffer

            // Divide
            System.out.printf("%.0f / %.0f = %f%n", numerator, denominator, numerator / denominator);
        }
    }
}
