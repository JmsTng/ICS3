/*
 * TITLE: Homework Set 30 - AddPairs
 * NAME: James Tung
 * DATE: 11/14/2023
 * DESCRIPTION: Add pairs of digits in a string.
 */

package HW30;

import java.util.Scanner;

public class AddPairs {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        String input;
        int sum = 0;

        // Get input
        System.out.print("Enter a string: ");
        input = sc.nextLine();

        // Add digits
        for (int i = 0; i < input.length(); i += 2) {
            sum += Integer.parseInt(input.substring(i, Math.min(input.length(), i + 2)));
        }

        // Print sum
        System.out.println("Sum of digits: " + sum);
    }
}
