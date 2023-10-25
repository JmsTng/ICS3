/*
 * TITLE: Homework Set 15 - Integer Counting Two
 * NAME: James Tung
 * DATE: 10/23/2023
 * DESCRIPTION: Use a do-while loop to count the number of integers inputted by the user until a negative number is provided.
 */

import java.util.Scanner;

public class CountInt2 {
    public static void main(String[] args) {
        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int count = 0;

        // Count until a negative number is provided
        do {
            System.out.print("Enter a number (negative number to terminate): ");
            count++;
        } while (sc.nextInt() >= 0);

        // Print count
        System.out.println("Count: " + (count - 1));
    }
}
