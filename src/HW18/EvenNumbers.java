/*
 * TITLE: Homework Set 18 - EvenNumbers
 * NAME: James Tung
 * DATE: 10/29/2023
 * DESCRIPTION: Continually read an integer from the user and print the number of even numbers once a non-positive integer is entered.
 */

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int n;
        int even = 0;

        // Read input and loop until non-positive integer is provided
        System.out.print("Enter an integer: ");
        while ((n = sc.nextInt()) > 0) { // Assignment and check
            if (n % 2 == 0) { // If even, increment even
                even++;
            }

            // Read input
            System.out.print("Enter an integer: ");
        }
        System.out.println("You entered " + even + " even numbers.");
    }
}
