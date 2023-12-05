/*
 * TITLE: Homework Set 28 - First and Last
 * NAME: James Tung
 * DATE: 11/14/2023
 * DESCRIPTION: Print the first and last characters of a string.
 */

package HW28;

import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        String input;

        // Get input
        System.out.print("Enter a string: ");
        input = sc.nextLine();

        // Print first and last characters
        System.out.println("First character: " + input.charAt(0));
        System.out.println("Last character: " + input.charAt(input.length() - 1));
    }
}
