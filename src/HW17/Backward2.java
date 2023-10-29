/*
 * TITLE: Homework Set 17 - Backward Two
 * NAME: James Tung
 * DATE: 10/25/2023
 * DESCRIPTION: Use a for loop to count down from 100 to 0 by 5's, but stop at a number inputted by the user.
 */

import java.util.Scanner;

public class Backward2 {
    public static void main(String[] args) {
        // Initialize variables
        int stop = 0;
        Scanner sc = new Scanner(System.in);

        // Read stop value
        while (stop < 50 || stop > 100) {
            System.out.print("Enter a number to stop at: ");
            stop = sc.nextInt();
        }

        // Count down by 5's
        for (int i = 100; i >= 5 && i >= stop; i -= 5) {
            System.out.println(i);
        }
    }
}
