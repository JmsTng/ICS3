/*
 * TITLE: Homework Set 28 - String Length
 * NAME: James Tung
 * DATE: 11/14/2023
 * DESCRIPTION: Print the length of a string.
 */

package HW28;

import java.util.Scanner;

public class StringLen {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        String input;

        // Get input
        System.out.print("Enter a string: ");
        input = sc.nextLine();

        // Print length
        System.out.println("Length: " + input.length());
    }
}
