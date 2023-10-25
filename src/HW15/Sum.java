/*
 * TITLE: Homework Set 15 - Sum
 * NAME: James Tung
 * DATE: 10/23/2023
 * DESCRIPTION: Use a do-while loop to sum a series of numbers until the user inputs a negative number.
 */

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i = 0;

        // Sum until a negative number is provided
        do {
            sum += i;
            System.out.print("Enter a number (negative to terminate): ");
            i = sc.nextInt();
        } while (i >= 0);

        // Print sum
        System.out.println("Sum: " + sum);
    }
}
