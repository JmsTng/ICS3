/*
 * TITLE: Homework Set 28 - Alphabetical
 * NAME: James Tung
 * DATE: 11/14/2023
 * DESCRIPTION: Compare two strings alphabetically.
 */

package HW28;

import java.util.Scanner;

public class Alphabetical {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        String first, second;

        // Get input
        System.out.print("Enter a string: ");
        first = sc.nextLine();
        System.out.print("Enter another string: ");
        second = sc.nextLine();

        // Compare strings
        if (first.compareTo(second) < 0) {
            System.out.println(first + " comes before " + second + " alphabetically.");
        } else if (first.compareTo(second) > 0) {
            System.out.println(first + " comes after " + second + " alphabetically.");
        } else {
            System.out.println(first + " and " + second + " are the same.");
        }
    }
}
