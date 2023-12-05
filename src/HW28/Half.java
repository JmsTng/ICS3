/*
 * TITLE: Homework Set 28 - Half Strings
 * NAME: James Tung
 * DATE: 11/14/2023
 * DESCRIPTION: Print the first and second halves of a string on separate lines.
 */

package HW28;

import java.util.Scanner;

public class Half {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        String input;

        // Get input
        System.out.print("Enter a string: ");
        input = sc.nextLine();

        // Print halves
        System.out.println("First half: " + input.substring(0, input.length() / 2));
        System.out.println("Second half: " + input.substring(input.length() / 2));
    }
}
